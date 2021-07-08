/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import static DTO.FormatForm.IsDateValid;
import static DTO.FormatForm.StringInput;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author phamt
 */
public class fresher {
   protected String Graduation_date;
   protected String Graduation_rank;
   protected String Education;
   public fresher(){
       Graduation_date="";
       Graduation_rank="";
       Education="";
   }

    public fresher(String Graduation_date, String Graduation_rank, String Education) {
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }
    public void add(){
        boolean Flag;
        Scanner sc = new Scanner(System.in);
        do {
            Flag=false;
            try{
            sc = new Scanner(System.in);
            System.out.println("input Staff Graduation_date: dd-mm-yyyy");
            Graduation_date = sc.nextLine();
            if (!IsDateValid(Graduation_date)) throw new Exception();
            } catch(Exception e){
                System.out.println("Date Invaild");
                Flag = true;    
            }
        } while (Flag);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("What is Staff graduation_rank, Good, Average or Weak?");
                this.Graduation_rank= sc.nextLine();
                Graduation_rank.toLowerCase();
                if( Graduation_rank.equalsIgnoreCase("Good")==false )
                if(Graduation_rank.equalsIgnoreCase("Average")==false) 
                if(Graduation_rank.equalsIgnoreCase("Weak")==false) throw new Exception();
            Graduation_rank=FormatForm.toTitleCase(getGraduation_rank());
            }
            catch(NoSuchElementException e){
            System.out.println("Wrong");
            Flag=true; 
            }
            catch(Exception e1){
                System.out.println("Wrong format");
                Flag=true;
            }
        }while(Flag);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("Input Address for Campus");
                this.Education= sc.nextLine();
                if(Education.isEmpty()||Education.matches(StringInput)==false) throw new Exception();
            Education=FormatForm.toTitleCase(Education);
            }catch(NoSuchElementException e){
            System.out.println("Wrong Format");
            Flag=true; }
            catch(Exception e1){
                System.out.println("Wrong Format");
                Flag=true;
            }
        }while(Flag);
    }
    public void Out(){
        System.out.println("Graduation_date: "+Graduation_date);
        System.out.println("Graduation_rank: "+Graduation_rank);
        System.out.println("Education: "+Education);
    }
    @Override
    public String toString() {
        return "fresher{" + "Graduation_date=" + Graduation_date + ", Graduation_rank=" + Graduation_rank + ", Education=" + Education + '}';
    }
   
}
