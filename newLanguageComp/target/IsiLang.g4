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
	private Program program;
	private Symbol symbol;
	private SymbolTable symbolTable;
	private int tipo;
	private String varName;
	private String varValue;
	private String readId;
	private String writeId;
	private ArrayList<AbstractCommand> mainThread;
}

public void verificaID(String id) {
	if(SymbolTable.exists(id)) {
		//todo exception
		throw new exception
	}
}

prog		: 'programa'	bloco	'fimprog.'
			; 

bloco		: (cmd)+
			;

cmd			: cmdleitura | cmdescrita | cmdattrib | cmdIf | cmddeclare | cmdFor | cmdWhile
			;

cmddeclare	: 'declare' ID ( VG ID )* P {System.out.println("reconheci declare");}
			;

cmdleitura	: 'leia' AP 
					ID 	{ verificaID(_input.LT(-1).getText())}
					FP SC
					{
						ReadCommand cmd = new ReadCommand(readId);
						//
					}
			;

cmdescrita	: 'escreva' 
				AP 
				ID { verificaID(_input.LT(-1).getText()); } FP SC
				{ WriteCommand cmd = new WriteCommand();
					writeId = _input.LT(-1).getText();
				}
			;
			
cmdattrib	: ID ATTR expr P
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
			;
			
Op_rel			: '>' | '<' | '==' | '<=' | '>=' | '!='
			;
			
			
