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
public class Car {
    private User owner; 
    
    public Car(User newOwner ) {
        this.owner = newOwner; 
    }
    
    public User getOwner() {
        return this.owner;
    }
    
    public void setOwner(User newOwner) {
        this.owner = newOwner; 
    }
    
    
}
