/**
 * Define a grammar called IsiLang
 */
grammar IsiLang;

prog		: 'programa'	bloco	'fimprog;'
			; 

bloco		: (cmd)+
			;

cmd			: cmdleitura | cmdescrita | cmdattrib | cmdIf | cmddeclare
			;

cmddeclare	: 'declare' ID ( VG ID )* SC {System.out.println("reconheci um comando declare");}
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
			
Op_rel		: '>' | '<' | '==' | '<=' | '>=' | '!='
			;
			
			
