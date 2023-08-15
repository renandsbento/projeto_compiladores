public abstract class Symbol {
    protected String name;

    public abstract String generateJavaCode();

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nam) {
        this.name = nam;
    }

    @Override
    public String toString() {
        return "Symbol [name=" + name + "]";
    }

}