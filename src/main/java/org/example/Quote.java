package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Quote
{
    public static void main( String[] args )
    {
        System.out.println( "What is the quote?" );
        Scanner quote = new Scanner(System.in);
        Scanner author = new Scanner(System.in);
        String quoteInput = quote.nextLine();
        System.out.println("Who said it?");
        String authorInput = author.next();
        PrintQuote newQuote = new PrintQuote();
        String printQuote = newQuote.quote(quoteInput, authorInput);
        System.out.println(printQuote);
    }
}
