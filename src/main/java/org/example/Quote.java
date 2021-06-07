package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  *  Copyright 2021 Vincent Verapen
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
