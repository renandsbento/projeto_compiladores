/**
 * Define a grammar called IsiLang
 */
grammar IsiLang;

prog	: 'programa'	bloco	'fimprog;'
		;

bloco	: (cmd)+
		;

cmd		: cmdleitura | cmdescrita | cmdattrib
		;

cmdleitura	: 'leia' AP ID FP SC
			;

cmdescrita	: 'escreva' AP ID FP SC
			;
			
cmdattrib	: ID ATTR expr SC
			;
			
expr		: termo ( OP termo )*
			;
			
termo		: ID | Num
			;
			
AP			: '('
			;
			
FP			: ')'
			;

SC			: ';'
			;

OP			: '+' | '-' | '*' | '/'
			;
			
ATTR		: '='
			;
			
ID			: [a-z] ([a-z] | [A-Z] | [0-9])*
			;
			
Num			: [0-9]+ ('.' [0-9]+)?
			;
			
WS			: (' ' | '\t' | '\n' | '\r') -> skip
			;
			
			
				
