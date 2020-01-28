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
public class Student extends Person implements Comparable<Student> {
    private int age; 
    
    
    public Student(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }
    
    @Override
    public String toString() { 
        return "name: " + this.name + ", age: " + Integer.toString(this.age); 
    }
    
    @Override
    public void setName(String newName) {
        this.name = newName;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int newAge) {
        this.age = newAge;
    }
    
    
    // code from https://dzone.com/articles/sorting-java-arraylist 
    @Override     
    public int compareTo(Student stud) {          
        return (this.getAge() < stud.getAge() ? -1 : (this.getAge() == stud.getAge() ? 0 : 1));     
  }       
}
