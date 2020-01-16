/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylistexample;

import java.util.ArrayList; 

/**
 *
 * @author Streeksoft
 */
public class JavaArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("Piet");
        Student student2 = new Student("Jan");
        Student student3 = new Student("Katrien");
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        
        System.out.println("ArrayList students has " + students.size() + " items");
        for(int i = 0; i < students.size(); i++) {
            System.out.println("Student on row "+i+" has the following name:" + students.get(i).getName() );
            
            // Also possible:
            Student student = students.get(i);
            System.out.println("Student on row "+i+" has the following name:" + student.getName() );
        }
        
        
    }
    
}
