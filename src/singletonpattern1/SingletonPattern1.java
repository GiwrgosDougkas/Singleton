/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern1;

/**
 *
 * @author George
 */
public class SingletonPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1=Student.getInstance("Giorgos", "10");
        Student s2=Student.getInstance("giannhs", "10");
        
        System.out.println(s1);
        System.out.println(s2);
        
        
    }
    
}
