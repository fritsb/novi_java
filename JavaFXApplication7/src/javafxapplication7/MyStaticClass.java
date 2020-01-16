/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication7;

/**
 *
 * @author Streeksoft
 */
public class MyStaticClass {
    public static String welcomeText = "Welcome! ";
    public String welcomeText2 = "blabla";
    
    
    public static String getWelcomeText() {
        return "Welcome to my App";
    }
    
    public String getWelcomeText2() { 
        return this.welcomeText2; 
    }
}
