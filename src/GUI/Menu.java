package GUI;

import java.util.Scanner;

public class Menu {
    private static Scanner p = new Scanner(System.in);

    static void ShowMenu() {
        System.out.println("-------------< Menu >---------------");
        System.out.println("1. Input the list of employees");
        System.out.println("2. Output the list of employees");
        System.out.println("3. Find the information of an employees");
        System.out.println("4. Insert the information of an employees");
        System.out.println("5. Delete the information of an employees");
        System.out.println("6. Modify the information of an employees");
        System.out.println("7. Compute slary of an employees");
        System.out.println("8. Quit!!!");
        System.out.print("Choose 1..8: ");
    }

    static void choiceMenu() {
        int choice;
        do {    
            ShowMenu();
            choice = p.nextInt();
            switch (choice) {
                case 1:
                    InputEmployees.Input();
                   break;
                        
                case 2:
                    OutputEmployees.Output();
                    break;
                    
                case 3:
                    Find.ChoiceMenu();
                    break;
                        
                case 4:
                    Insert.InsertEmployees();
                    break;	
                        
                case 5: 
                   break;

                case 6: 
                   break; 
                
                case 7: 
                   break;   
    
                case 8:
                    System.out.println("Goodbye. See you again <3!!!");
                    break;
    
                default:
                    System.out.println("Please choose 1..8!!!");
                    break;
            }
        } while (choice != 8);
    }
    
}
