
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuelgomez
 */
public class TreeMapSet implements WordSet {
    
    private TreeMap base;
    
    public TreeMapSet(){
        base = new TreeMap();
    }

    @Override
    public void add(Word wordObject) {
        base.put(wordObject,1);
    }

    @Override
    public Word get(Word word) {
        return (Word) base.get(word);
    }
    
}
