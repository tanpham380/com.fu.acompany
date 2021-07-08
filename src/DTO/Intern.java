/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import static DTO.FormatForm.StringInput;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author phamt
 */
public class Intern {
    protected String Majors;
    protected String Semester;
    protected String University;
    public Intern(){
        Majors="";
        Semester="";
        University="";
    }

    public Intern(String Majors, String Semester, String University) {
        this.Majors = Majors;
        this.Semester = Semester;
        this.University = University;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }
    public void add(){
        boolean Flag;
        Scanner sc= new Scanner(System.in);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("Input Majors for Staff");
                this.Majors= sc.nextLine();
                if(Majors.isEmpty()||Majors.matches(StringInput)==false) throw new Exception();
                sc = new Scanner(System.in);
                System.out.println("Input Semester for Staff");
                this.Semester= sc.nextLine();
                if(Semester.isEmpty()||Semester.matches(StringInput)==false) throw new Exception();
                sc = new Scanner(System.in);
                System.out.println("Input University for Staff");
                this.University= sc.nextLine();
                if(University.isEmpty()||University.matches(StringInput)==false) throw new Exception();
                Majors=FormatForm.toTitleCase(Majors);
                Semester=FormatForm.toTitleCase(Semester);
                University=FormatForm.toTitleCase(University);
            }catch(NoSuchElementException e){
            System.out.println("Wrong Format");
            Flag=true; 
            }
            catch(Exception e1){
                System.out.println("Wrong Format");
                Flag=true;
            }
        }while(Flag);
    }
    public void out(){
        System.out.println("Majors: "+Majors);
        System.out.println("Semester: "+Semester);
        System.out.println("University: "+University);
    }
    @Override
    public String toString() {
        return "Intern{" + "Majors=" + Majors + ", Semester=" + Semester + ", University=" + University + '}';
    }
    
    
}
