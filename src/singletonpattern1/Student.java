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
public class Student {
    private String name;
    private String degree;
    private static Student std;
    
    private Student(String newName,String newDegree){
        this.name=newName;
        this.degree=newDegree;
    }
           
    public static Student getInstance(String name, String degree){
        if(std==null){
            std=new Student(name,degree);
        }
        return std;
    }
    
    @Override
    public String toString(){
        return this.name+" "+this.degree;
    
    }
}
