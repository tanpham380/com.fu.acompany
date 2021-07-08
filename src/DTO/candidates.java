/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import static DTO.FormatForm.IsDateValid;
import static DTO.FormatForm.StringInput;
import static DTO.FormatForm.isValidPhoneNo;
import static DTO.FormatForm.toTitleCase;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author phamt
 */
public class candidates {
    protected String Id;
    protected String Firstname;
    protected String lastname;
    protected String BirthDate;
    protected String Address;
    protected String Phone;
    protected  experience experience;
    protected fresher fresher;
    protected Intern Intern;
    public candidates(){
        Id="";
        Firstname="";
        lastname="";
        BirthDate="";
        Address="";
        Phone="";
        experience=null;
        fresher=null;
        Intern=null;
    }

    public candidates(String Id, String Firstname, String lastname, String BirthDate, String Address, String Phone, experience experience, fresher fresher, Intern Intern) {
        this.Id = Id;
        this.Firstname = Firstname;
        this.lastname = lastname;
        this.BirthDate = BirthDate;
        this.Address = Address;
        this.Phone = Phone;
        this.experience = experience;
        this.fresher = fresher;
        this.Intern = Intern;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public experience getexperience() {
        return experience;
    }

    public void setexperience(experience experience) {
        this.experience = experience;
    }

    public fresher getFresher() {
        return fresher;
    }

    public void setFresher(fresher fresher) {
        this.fresher = fresher;
    }

    public Intern getIntern() {
        return Intern;
    }

    public void setIntern(Intern Intern) {
        this.Intern = Intern;
    }
    public void InputID(){
         boolean flag;
         Scanner sc = new Scanner(System.in);
                do {
            flag = false;
            try {
                sc = new Scanner(System.in);
                System.out.println("input ID' Staff:");
                Id = sc.nextLine();
                Id = toTitleCase(Id);
                if (Id.isEmpty() && Id == null) {
                    throw new Exception();
                }
            }
            catch(NoSuchElementException e1){
                System.out.println("Something went Wrong");
                flag=true;
            }
            catch (Exception e) {
                System.out.println("input wrong format ");
                flag = true;
            }
        } while (flag);
    }
    public void input(){
        boolean Flag;
        Scanner sc = new Scanner(System.in);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("Input Firstname for Staff");
                this.Firstname= sc.nextLine();
                if(Firstname.isEmpty()||Firstname.matches(StringInput)==false) throw new Exception();
                Firstname=FormatForm.toTitleCase(Firstname);
                sc = new Scanner(System.in);
                System.out.println("Input lastname for Staff");
                this.lastname= sc.nextLine();
                if(lastname.isEmpty()||lastname.matches(StringInput)==false) throw new Exception();
                lastname=FormatForm.toTitleCase(lastname);
            }catch(NoSuchElementException e){
            System.out.println("Wrong Format");
            Flag=true; }
            catch(Exception e1){
                System.out.println("Wrong Format");
                Flag=true;
            }
        }while(Flag);
        do {
            Flag=false;
            try{
            sc = new Scanner(System.in);
            System.out.println("input Staff BirthDate: dd-mm-yyyy");
            BirthDate = sc.nextLine();
            if (!IsDateValid(BirthDate)) throw new Exception();
            } catch(Exception e){
                System.out.println("Date Invaild");
                Flag = true;    
            }
        } while (Flag);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("Input Address for Staff");
                this.Address= sc.nextLine();
                if(Address.isEmpty()) throw new Exception();
                Address=FormatForm.toTitleCase(Address);
            }catch(NoSuchElementException e){
            System.out.println("Wrong Format");
            Flag=true; }
            catch(Exception e1){
                System.out.println("Wrong Format");
                Flag=true;
            }
        }while(Flag);
        do{
            Flag=false;
            try{
            sc= new Scanner(System.in);
//            String S = new String();
            System.out.println("Phone for Staff");
            Phone=sc.next();
            if(!isValidPhoneNo(Phone)) throw new Exception();
            } catch(NumberFormatException  e){
                System.out.println("Wrong Format ID");
                Flag=true;
            } catch(Exception e1){
                System.out.println("Wrong Phone Number");
                Flag=true;
            }
        } while(Flag);
    }
    public void out(){
        System.out.println("ID: "+Id );
        System.out.println("Name: "+Firstname +lastname);
        System.out.println("Phone: "+BirthDate );
        System.out.println("Phone: "+Phone );
        System.out.println("Phone: "+Address );
        if(experience != null) experience.Out();
        if(fresher != null) fresher.Out();
        if(Intern != null) Intern.out();
    }
    @Override
    public String toString() {
        return "candidates{" + "Id=" + Id + ", Firstname=" + Firstname + ", lastname=" 
                + lastname + ", BirthDate=" + BirthDate + ", Address=" + Address + ", Phone=" + Phone +
                ", experience="  + experience + ", fresher=" + fresher + ", Intern=" + Intern + '}';
    }
    
}
