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
public class GradeBook {
    private String instructorName;
    static Scanner scan = new Scanner(System.in);
    
    public void setname(String instructorName){
        this.instructorName=instructorName;
    }
    public String getName(){
        return instructorName;
    }
    public GradeBook(String courseName,String instName){
        displayMessage(courseName,instName);
    }
    public void displayMessage(String course,String instructor){
        System.out.println("Welcome To: " +course);        
        System.out.println("This Course is Presented By: " +instructor);
        
    }
    public static void main(String [] args){
        String course,instName;
        System.out.println("Enter Course Name");
        course = scan.next();
        System.out.println("Enter Instructor");
        instName= scan.next();
        GradeBook grades = new GradeBook(course,instName);
        
    }
    
}
