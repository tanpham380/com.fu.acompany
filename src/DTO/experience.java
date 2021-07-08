/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author phamt
 */
public class experience {
    protected int ExpInYear;
    protected String ProSkill;
public experience(){
    ExpInYear=0;
    ProSkill="";
    
}

    public experience(int ExpInYear, String ProSkill) {
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    public void add(){
        boolean Flag;
           do {
               Flag=false;
               try{
               System.out.println("enter information");
               Scanner sc = new Scanner(System.in);
               String s= sc.next();
                this.ExpInYear=Integer.parseInt(s);
                if(ExpInYear<=0) throw new Exception();
                }catch (NumberFormatException e){
                    System.out.println("Wrong Format (Input is number)");
                     Flag=true;
                }
                catch(Exception e1){
                    System.out.println("Code !>0");
                     Flag=true;
                }
    }while(Flag);
           do{
            Flag=false;
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("What is Staff classification, Good, Average or Weak?");
                this.ProSkill= sc.nextLine();
                ProSkill.toLowerCase();
                if( ProSkill.equalsIgnoreCase("Good")==false )
                if(ProSkill.equalsIgnoreCase("Average")==false) 
                if(ProSkill.equalsIgnoreCase("Weak")==false) throw new Exception();
            ProSkill=FormatForm.toTitleCase(ProSkill);
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
    }
    public void Out(){
        System.out.println("Staff ExpInYear: "+ExpInYear);
        System.out.println("Staff ProSkill: "+ProSkill);
    }
    @Override
    public String toString() {
        return "experience{" + "ExpInYear=" + ExpInYear + ", ProSkill=" + ProSkill + '}';
    }
    
}
