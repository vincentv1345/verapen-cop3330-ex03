package org.example;

public class PrintQuote {
    public String quote(String quote, String author){
        return String.format(author + " says \"" + quote + "\"");
    }
}
