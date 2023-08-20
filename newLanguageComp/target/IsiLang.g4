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
	private int tipo;
	private String varName;
	private String varValue;
	private ArrayList<AbstractCommand> mainThread;
}

prog		: 'programa'	bloco	'fimprog;'
			; 

bloco		: (cmd)+
			;

cmd			: cmdleitura | cmdescrita | cmdattrib | cmdIf | cmddeclare
			;

cmddeclare	: 'declare' ID ( VG ID )* SC {System.out.println("reconheci declare");}
			;

cmdleitura	: 'leia' AP ID FP SC
			;

cmdescrita	: 'escreva' AP ID FP SC
			;
			
cmdattrib	: ID ATTR expr SC
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
			
ATTR		: '='
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

TEXTO		: ([0-9] | [a-z] | [A-Z])+
			;
		
cmdIf		: 'if' AP termo Op_rel termo FP AC bloco FC ('else' AC bloco FC )?
			;
			
cmdFor		: 'for' AP termo SC termo SC termo FP AC bloco FC 
			;

cmdWhile	: 'while' AP termo FP AC bloco FC 
			;
			
Op_rel		: '>' | '<' | '==' | '<=' | '>=' | '!='
			;
			
			