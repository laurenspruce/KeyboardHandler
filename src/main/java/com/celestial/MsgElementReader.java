/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial;

import java.util.Scanner;

/**
 *
 * @author selvy
 */
public class MsgElementReader
{
    private final Scanner theScanner;
    
    public  MsgElementReader( Scanner sc )
    {
        theScanner = sc;
    }
    
    public  void prompt()
    {
        System.out.print("Enter an Item (White space as seperator): ");
    }
    
    public  String readFromKeyboard()
    {
        prompt();
        
        return theScanner.next();
    }
}
