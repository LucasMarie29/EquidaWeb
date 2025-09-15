package test;

import model.Cheval;
import model.ChevalCourse;
import model.Course;
import model.Race;

public class TestCheval {

    public static void main (String args[]){
        
        
        
        Cheval c = new Cheval();
        c.setId(1);
        c.setNom("Josh");

        Cheval c1 = new Cheval();
        c1.setId(5);
        c1.setNom("June");

        Cheval c2 = new Cheval();
        c2.setId(13);
        c2.setNom("Eclair");

        Course co = new Course();
        co.setId(4);
        co.setNom("Course1");


        ChevalCourse cs1 = new ChevalCourse();
        cs1.setPosition(1);
        cs1.setCheval(c);
        cs1.setCourse(co);

        ChevalCourse cs2 = new ChevalCourse();
        cs2.setPosition(2);
        cs2.setCheval(c1);
        cs2.setCourse(co);

        ChevalCourse cs3 = new ChevalCourse();
        cs3.setPosition(3);
        cs3.setCheval(c2);
        cs3.setCourse(co);


        c.addChevalCourse(cs1);
        c.addChevalCourse(cs2);
        c.addChevalCourse(cs3);


        for (ChevalCourse cs : c.getLesChevalCourses()) {
            System.out.println("Cheval : " + cs.getCheval().getNom() + " - Course : " + cs.getCourse().getNom());
        }















        
        
        
        
        

        /*
        // création d'une instance de cheval nommée c
        Cheval c = new Cheval();
        c.setId(2);
        c.setNom("Houri");

        // création d'une instance de race nommée r
        Race r = new Race();
        r.setId(1);
        r.setNom("pur-sang");

        //affectation de  la race au cheval grâce à la relation ManyToOne
        c.setRace(r);

        // Affichage des informations dans la console
        //voir notamment du nom de la race du cheval
        System.out.println("Cheval : " + c.getId() + " " + c.getNom() + " "
                + c.getRace().getId() + " " + c.getRace().getNom());
        */
    }
}
