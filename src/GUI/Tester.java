/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Intern;
import DTO.Listcandidates;
import DTO.candidates;
import DTO.experience;
import DTO.fresher;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author phamt
 */
public class Tester {
    public static void main(String[] args) {
        int ChoiceMain=0;
        int Choice=0;
        Listcandidates candidateslist =new Listcandidates();
        Scanner sc = new Scanner(System.in);
        boolean Flag;
        do{
            Flag = true;
        System.out.println("---Company Nemu---");
        System.out.println("1.add Staff ");
        System.out.println("2.display Staff");
        System.out.println("3.find Staff");
        System.out.println("4.update Staff");
        System.out.println("5.remove Staff");
        System.out.println("0. Out");
        System.out.println("------------------");
        try{
        sc = new Scanner(System.in);
        ChoiceMain = sc.nextInt();
        if(ChoiceMain==0){
            System.out.println("Thank for use my services");
            Flag=false;
        }
        if(ChoiceMain<0 || ChoiceMain>6) throw new Exception();
        }
        catch(InputMismatchException e1){
            System.out.println("Wrong Format");
            
        }
        catch(Exception e){
            System.out.println("Wrong choice, please choice agian");
           
        }
        switch(ChoiceMain){
            case 1:
                System.out.println("add Staff");
                candidates ca = new candidates();
                ca.InputID();
                ca.input();
                do{
                    
                    Flag=true;
                    try{
                    sc=new Scanner(System.in);
                    System.out.println("-Staff Information-");
                    System.out.println("1.Add exprience");
                    System.out.println("2.add fresher");
                    System.out.println("3.add Intern");
                    System.out.println("0.Out");
                    Choice = sc.nextInt();
                    if(Choice==0){
                        System.out.println("Thank!!! back to Main Nemu");
                        break;
                        
                    }
                    if(Choice<0 || Choice>4) throw new Exception();
                    } catch(InputMismatchException e1){
                        System.out.println("Wrong Format");
                        
                    } catch(Exception e){
                        System.out.println("Wrong choice, Please choice agian");
                    }
                    switch(Choice){
                        case 1: 
                            if(ca.getexperience()==null){
                            experience ex = new experience();
                            ex.add();
                            ca.setexperience(ex);
                            }
                            else System.out.println("has this information");
                            break;
                        case 2: 
                            if(ca.getFresher()==null){
                            fresher fr = new fresher();
                            fr.add();
                            ca.setFresher(fr);
                            }
                            else System.out.println("has this information");
                            break;
                        case 3: 
                            if(ca.getIntern()==null){
                            Intern in = new Intern();
                            in.add();
                            ca.setIntern(in);
                            }
                            else System.out.println("has this information");
                            break;      
                    }
                    
                }while(Flag);
                candidateslist.Add(ca);
                System.out.println("successfull");
               break;
            case 2:
                System.out.println("Display Staff");
                if(candidateslist.Display()==true) System.out.println("successfull");
                else System.out.println("Faill");
                break;                
            case 3:
                try{
                ca = new candidates();
                ca.InputID();
                ca=candidateslist.Search(ca.getId());
                if(ca==null) throw new Exception();
                ca.out();
                }catch (Exception e){
                    System.out.println("Don't have ID");
                }
                break;
            case 4:
                try{
                ca = new candidates();
                ca.InputID();
                ca=candidateslist.Search(ca.getId());
                if(ca==null) throw new Exception();
                candidateslist.UpdateStaff(ca.getId());
                }catch (Exception e){
                    System.out.println("Don't have ID");
                }
                break;  
            case 5:
                try{
                ca = new candidates();
                ca.InputID();
                ca=candidateslist.Search(ca.getId());
                if(ca==null) throw new Exception();
                candidateslist.Remove(ca.getId());
                }catch (Exception e){
                    System.out.println("Don't have ID");
                }
                break;
        }
        }while(Flag);
    }
    
}
