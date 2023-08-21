package br.com.professorisidro.isilanguage

public class CommandLeitura extends Command{
    private String id;
    private IsiVariable var;
	
    public CommandLeitura (String id, IsiVariable var) {
	    this.id = id;
	    this.var = var;
    }

    @Override
    public String generateJavaCode() {
        //todo
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