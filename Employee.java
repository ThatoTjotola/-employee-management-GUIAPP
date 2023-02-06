/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
//Importation of io
/**
 *
 * @author Amogelang
 */
public class Employee implements Serializable {
    private String name, surname;
    private Job job;
     private int staffnr;

    public Employee(String name, String surname, Job job, int staffnr) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.staffnr = staffnr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffnr() {
        return staffnr;
    }

    public void setStaffnr(int staffnr) {
        this.staffnr = staffnr;
    }
   
    
    
    
}
