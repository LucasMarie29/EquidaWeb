package model;

import java.sql.Date;


public class Course {
    private int id;
    private String nom;
    private String lieu;
    private Date date;
    
    private ChevalCourse chevalCourse;

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ChevalCourse getChevalCourse() {
        return chevalCourse;
    }

    public void setChevalCourse(ChevalCourse chevalCourse) {
        this.chevalCourse = chevalCourse;
    }
    
    
    
}
