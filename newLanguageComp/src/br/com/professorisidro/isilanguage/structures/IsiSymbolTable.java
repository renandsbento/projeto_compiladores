package br.com.professorisidro.isilanguage.structures

public class IsiSymbolTable {

    private HashMap<String, IsiSymbol> map;
	
    public IsySymbolTable() {
        map = new HashMap<String, IsiSymbol>();
        
    }
    
    public void add(IsiSymbolTable isySymbol) {
        map.put(symbol.getName(), isySymbol);
    }
    
    public boolean exists(String symbolName) {
        return map.get(symbolName) != null;
    }
    
    public Symbol get(String symbolName) {
        return map.get(symbolName);
    }
    
    public ArrayList<IsiSymbol> getAll(){
        ArrayList<IsiSymbol> symbolList = new ArrayList<IsiSymbol>();
        for (IsiSymbol symbol : map.values()) {
            symbolList.add(symbol);
        }
        return symbolList;
    }
}
