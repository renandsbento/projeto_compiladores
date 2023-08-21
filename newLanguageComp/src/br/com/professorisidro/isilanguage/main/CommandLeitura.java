package br.com.professorisidro.isilanguage.main

public class CommandLeitura extends Command{
    private String id;
    private IsiVariable var;
	
    public CommandLeitura (String id, IsiVariable var) {
	    this.id = id;
	    this.var = var;
    }

    @Override
    public String generateJavaCode() {
        return id +"= _key." + (var.getType()==IsiVariable.NUMBER? "nextDouble();": "nextLine();");
    }

    @Override
    public String toString() {
        return "CommandLeitura [id=" + id + "]";
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getCommand(){
        return this.getClass().getName();
    }
}