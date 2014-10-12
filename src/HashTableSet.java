
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuelgomez
 */
public class HashTableSet implements WordSet{
     private Hashtable<Word,Integer> base;
    
    public HashTableSet(){
        base = new Hashtable<Word,Integer>();
    }

    @Override
    public void add(Word wordObject) {
        base.put(wordObject,1);
    }

    @Override
    public Word get(Word word) {
        if (base.containsKey(word)){
            base.remove(word);
            return word;
        }
        else
            return null;
    }
       
}
