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
public class User extends Person {
    private String name;
    
    public User() {
        System.out.println("User object created");
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setFullName(String firstName, String lastName) { 
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    
}
