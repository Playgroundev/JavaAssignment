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
public class Invoice {
    private String partNumber;
    private String partDescription;
    private static int quantity;
    private static double price;
    static Scanner scanner = new Scanner(System.in);
    public Invoice(String partNo,String partDescr,int quant,double price_){
        
    }
    public Invoice(){
        this.quantity=0;
        this.price=0.0;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
        //Sets the value of the PartNumber
    }
    public String getPartNumber(){
        return partNumber;
        //This returns a String value (partNumber)
    }
    public void setDescription(String partDescription){
        this.partDescription= partDescription;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(double price){
        this.price= price;
    }
    public double getPrice(){
        return price;
    }
    
    public double getInvoiceAmount(){
        return price * quantity;
    }
    public static void main(String [] args){
        Invoice invoice = new Invoice();
        System.out.println("Enter Price & Quantity");
        price=scanner.nextDouble();
        quantity= scanner.nextInt();
        if(price<0.0 || quantity <0){
            System.out.println("Cannot Compute Negative Values");
            return;
        }
        invoice.setPrice(price);
        invoice.setQuantity(quantity);
        invoice.getPrice();
        invoice.getQuantity();
        System.out.println("You Have To Pay: "+invoice.getInvoiceAmount());
    }
    
}
