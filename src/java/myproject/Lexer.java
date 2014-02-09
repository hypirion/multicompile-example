package myproject;

import java.util.Iterator;

import myproject.records.Item;
// This is our Item record
import clojure.lang.Keyword;
// We want to use keywords


public class Lexer implements Iterator<Item> {
    public static final Keyword ERROR = Keyword.intern(null, "error");

    private long count;
    
    public Lexer(long count) {
        this.count = count;
    }
    
    public void remove() {
        throw new UnsupportedOperationException();
    }
    
    public Item next() {
        if (0 < count) {
            count--;
            return new Item(ERROR, String.format("%d", count));
        }
        return null;
    }

    public boolean hasNext() {
        return 0 < count;
    }
}
