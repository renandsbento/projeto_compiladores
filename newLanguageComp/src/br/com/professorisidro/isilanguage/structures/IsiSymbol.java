package br.com.professorisidro.isilanguage.structures

public abstract class IsiSymbol {
    protected String name;

    public abstract String generateJavaCode();

    public IsiSymbol(String name) {
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
        return "IsiSymbol [name=" + name + "]";
    }

}