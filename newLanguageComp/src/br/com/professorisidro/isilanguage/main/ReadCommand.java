public class ReadCommand extends Command{
    private String id;
    private IsiVariable var;
	
    public ReadCommand (String id, IsiVariable var) {
	    this.id = id;
	    this.var = var;
    }

    @Override
    public String generateJavaCode() {
        //todo
    }

    @Override
    public String toString() {
        return "ReadCommand [id=" + id + "]";
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