/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balance;
import java.util.*;
/**
 *
 * @author Jared Moodley
 */
public class Balance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner keyboard = new Scanner(System.in)) {
            int generatedBalances[] = new int[2];
            Random rand = new Random();
            generatedBalances[0] = rand.nextInt(100);
            generatedBalances[1] = rand.nextInt(100);
            System.out.println("1. Display checking account balance");
            System.out.println("2. Display savings account balance");
            System.out.print("Your choice: ");
            int choice = keyboard.nextInt();
            
            
            if (choice == 1) {
                if (generatedBalances[0] < 10) {
                    System.out.println("Checking account balance is low");
                } else {
                    System.out.println("Checking account balance is: " + "R"+ generatedBalances[0]);
                }
            } else if (choice == 2){
                
                if (generatedBalances[1] < 10) {
                    System.out.println("Savings account balance is low");
                } 
                
                else {
                    System.out.println("Savings account balance is: " + "R"+ generatedBalances[1]);
                }
            }
        }
    }
    
}
