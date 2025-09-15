/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Cheval;
import model.ChevalCourse;
import model.Course;

/**
 *
 * @author sio2
 */
public class TestChevalCourse {
    
    public static void main (String args[]){
        
        
        Cheval c = new Cheval();
        c.setId(1);
        c.setNom("Josh");
        
        Course co = new Course();
        co.setId(4);
        co.setNom("Course1");
        
        
        ChevalCourse cs = new ChevalCourse();
        cs.setPosition(9);  
        cs.setCheval(c);
        cs.setCourse(co);
        
        
        c.addChevalCourse(cs);
        
        System.out.println(cs.getCheval().getNom() + " " + cs.getPosition());
        
    }
    
}
