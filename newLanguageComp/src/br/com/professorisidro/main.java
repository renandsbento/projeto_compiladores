package br.com.professorisidro.isilanguage;

import antlr4.target.IsiLangLexer;
import antlr4.target.IsiLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

// Responsável por criar a interação com o usuário instanciando o parser e apontando para o arquivo fonte
public class main {

	public static void main(String[] args) {
		try {
			IsiLangLexer lexer;
			IsiLangParser parser;
			
			lexer = new IsiLangLexer(CharStreams.fromFileName("input.isi"));
			System.out.println("Input encontrado!");
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new IsiLangParser(tokenStream);
			System.out.println("Realizando avaliacao!");
			parser.prog();
			System.out.println("Avaliacao realizada!");
		}
		catch(Exception ex) {
			System.err.println("Erro " + ex.getMessage());
		}
	}

}
