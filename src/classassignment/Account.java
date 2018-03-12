/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classassignment;
import java.util.Scanner;
/**
 *
 * @author 15-0110
 */
public class Account {
    private static int initialBalance = 10000;
    static Scanner scanner =  new Scanner(System.in);
    public static  void Debit(int amount){
        int new_amount;
        
        if(amount>initialBalance){
            System.out.println("Debit amount exceeded account balance");
            return;
        }else{
            new_amount = initialBalance- amount;
            System.out.println("You Have Withdrawn " + amount);
            System.out.println("Your New Balance is " + new_amount);
        }
    }
    public static void main(String [] args){
        int amount;
        System.out.println("Enter Amount To Withdraw");
        amount = scanner.nextInt();
        Debit(amount);
        
    }
    
}
