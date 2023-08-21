package br.com.professorisidro.isilanguage

public class CommandEscrita extends Command {

    private String id;

    public CommandEscrita(String id) {
        this.id = id;
    }

    @Override
    public String generateJavaCode() {
        return "System.out.println("+id+");";
    }

    @Override
    public String getId(){
    	return "";
    }

    @Override
    public String getCommand(){
    	return this.getClass().getName();
    }

    @Override
	public String toString() {
		return "CommandEscrita [id=" + id + "]";
	}
}