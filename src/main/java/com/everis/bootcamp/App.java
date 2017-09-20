package com.everis.bootcamp;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.print("Fecha actual: ");
        System.out.println(DateTime.now().withZone(DateTimeZone.UTC).toString("dd/MM/yyyy"));
    }
}
