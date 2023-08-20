/**
 * Define a grammar called IsiLang
 */
grammar IsiLang;

@header{
	import newLanguageComp.src.br.com.professorisidro.isilanguage.structures.IsiVariable.java
	import newLanguageComp.src.br.com.professorisidro.isilanguage.structures.Symbol.java
	import newLanguageComp.src.br.com.professorisidro.isilanguage.structures.SymbolTable.java
	import newLanguageComp.src.br.com.professorisidro.isilanguage.main.ReadCommand.java
	import newLanguageComp.src.br.com.professorisidro.isilanguage.main.WriteCommand.java
	import newLanguageComp.src.br.com.professorisidro.isilanguage.main.Command.java
	import newLanguageComp.src.br.com.professorisidro.isilanguage.main.AssignamentCommand.java
	import newLanguageComp.src.br.com.professorisidro.isilanguage.main.Program.java
}

@members{
	private IsiProgram program = new IsiProgram();
	private IsiSymbol symbol;
	private IsiSymbolTable symbolTable;
	private int tipo;
	private String varName;
	private String varValue;
	private String _readID;
	private String _writeID;
	private String _exprID;
	private String _exprContent;
	private String _exprDecision;
	private String _exprRepetition;
	private ArrayList<AbstractCommand> curThread;
	private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
	private ArrayList<String> VariaveisSemUso;
	private ArrayList<AbstractCommand> listaTrue;
	private ArrayList<AbstractCommand> listaFalse;
}

public void verificaID(String id){
	if (!symbolTable.exists(id)){
		throw new IsiSemanticException("Simbolo "+id+" não declarado");
	}
}

public StringBuilder exibeVariaveisSemUsoWNG() {
    StringBuilder varWNG = new StringBuilder();

    varWNG.append("As seguintes variáveis foram declaradas e não foram utilizadas no programa: ");
    ArrayList<String> var = program.getVarSemUso();

    if(var.isEmpty())return null;

    int size = var.size();
    if(size ==1)varWNG.append(var.get(0));

    else if(size>1){
        int i=0;
        for(;i<=size-2;i++){
            String w = var.get(i);
            varWNG.append(w);
            varWNG.append(",");
        }
        varWNG.append(var.get(size-1));
    }

    return varWNG;
}

public void Warnings() {
        StringBuilder warn = new StringBuilder();
        StringBuilder var = exibeVariaveisSemUsoWNG();
        if(var==null)return;
        warn.append("WARNINGS: \n");
        warn.append(exibeVariaveisSemUsoWNG());
        System.out.println(warn);
}
	
	public void generateCode(){
		program.generateTarget();
	}

prog		: 'programa'	bloco	'fimprog.'
			{  program.setVarTable(symbolTable);
           	  program.setComandos(stack.pop());
           } 
			; 

bloco		: (cmd)+
			;

tipo       : 'numero' { _tipo = IsiVariable.NUMBER;  }
           | 'texto'  { _tipo = IsiVariable.TEXT;  }
           ;

cmd			: cmdleitura | cmdescrita | cmdattrib | cmdIf | cmddeclare | cmdFor | cmdWhile
			;

cmddeclare	: 'declare' ID ( VG ID )* P {System.out.println("reconheci declare");}
			;

cmdleitura	: 'leia' AP 
					ID 	{ verificaID(_input.LT(-1).getText());
                     	  _readID = _input.LT(-1).getText();
                        } 
					FP SC
					{
						IsiVariable var = (IsiVariable)symbolTable.get(_readID);
              			CommandLeitura cmd = new CommandLeitura(_readID, var);
              			stack.peek().add(cmd);
					}
			;

cmdescrita	: 'escreva' 
				AP 
                 ID { verificaID(_input.LT(-1).getText());
	                  _writeID = _input.LT(-1).getText();
                     } 
                 FP 
                 SC
               {
               	  CommandEscrita cmd = new CommandEscrita(_writeID);
               	  stack.peek().add(cmd);
               }
			;
			
cmdattrib	: ID ATTR expr P
				{
                 verificaID(_input.LT(-1).getText());
                    _exprID = _input.LT(-1).getText();   
				} 
               	ATTR { _exprContent = ""; } 
               	expr 
               	SC
               	{
                    if (_exprContent =="")
                    {
                       throw new IsiSemanticException("Variável "+_exprID+" não foi atribuída");
                    }
                    else{
                           CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
                           stack.peek().add(cmd);
                    }
               	
               }
			;

cmdentrada	: ID ATTR Num 
			;
			
cmdsaida	: ID ATTR ID OP Num
			;

condicao	: expr Op_rel expr
			;

			
expr		: termo ( OP termo )*
			;
			
termo		: ID | Num | TEXTO
			;
			
AP			: '('
			;
			
AC			: '{'
			;
			
FC			: '}'
			;
			
FP			: ')'
			;

SC			: ';'
			;

OP			: '+' | '-' | '*' | '/'
			;
			
ATTR			: ':='
			;
			
VG			: ','
			;
			
P			: '.'
			;

PP			: ':'
			;
			
ID			: [a-z] ([a-z] | [A-Z] | [0-9])*
			;
			
Num			: [0-9] + ( '.' [0-9]+ )?
			;
			
WS			: (' ' | '\n' | '\r' | '\t') -> skip
			;

TEXTO			: ([0-9] | [a-z] | [A-Z])+
			;
		
cmdIf			: 'if' AP termo Op_rel termo FP AC bloco FC ('else' AC bloco FC )?
			;
			
cmdFor		: 'for' AP cmdentrada SC condicao SC cmdsaida FP AC bloco FC
			; 

cmdWhile	: 'while' AP condicao FP AC bloco FC 
                    ID{_exprRepetition = _input.LT(-1).getText(); }
                    OPREL { _exprRepetition += _input.LT(-1).getText(); }
                    (ID | NUMBER) {_exprRepetition += _input.LT(-1).getText(); }
                    FP
                    ACH
                    {
                      curThread = new ArrayList<AbstractCommand>(); 
                      stack.push(curThread);
                    }
                    (cmd)+ 
                    
                    FCH 
                    {
                       listaTrue = stack.pop();	
                       CommandRepeticao cmd = new CommandRepeticao(_exprRepetition, listaTrue);
                   		stack.peek().add(cmd);
                    } 
			;
			
Op_rel			: '>' | '<' | '==' | '<=' | '>=' | '!='
			;
			
			
