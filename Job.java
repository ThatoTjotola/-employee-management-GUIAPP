/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author Amogelang
 */
public class Job implements Serializable {
    private double salary;
    private String nameOfJob;

    public Job(double salary, String nameOfJob) {
        this.salary = salary;
        this.nameOfJob = nameOfJob;
    }
    public boolean equals (Job job)
    {
        return(this.getSalary() == job.getSalary() && this.getNameOfJob().equals(job.getNameOfJob()));
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the nameOfJob
     */
    public String getNameOfJob() {
        return nameOfJob;
    }

    /**
     * @param nameOfJob the nameOfJob to set
     */
    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }
   
}
