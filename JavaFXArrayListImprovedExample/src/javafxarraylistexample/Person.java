/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxarraylistexample;

/**
 *
 * @author Streeksoft
 */
public abstract class Person implements iPerson {
    protected String name;
    
    public abstract void setName(String s);
    public abstract String getName();
    
    public void justARandomMethod() { 
        System.out.println("This method only prints one line to console");
    }

}
