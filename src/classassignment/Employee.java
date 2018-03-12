/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classassignment;

/**
 *
 * @author 15-0110
 */
public class Employee {
    private  String firstName;
    private  String lastName;
    private double  monthlySalary;
    
    
    public Employee(String firstName,String lastName,double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    public void setFirstName(String firstName){
        this.firstName= firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName= lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setMonthly(double monthlySalary){
        this.monthlySalary= monthlySalary;
    }
    public double getMonthly(){
        return monthlySalary;
    }
    public static void main(String [] args){
        Employee employeeTest = new Employee("Brian","Kamau",250000);
        Employee employeeTest2 = new Employee("Winny","Kiburu",175000);
        double raise1 =(employeeTest.getMonthly()+(employeeTest.getMonthly()*0.1))*12;
        double raise2 = (employeeTest2.getMonthly()+(employeeTest2.getMonthly()*0.1))*12;
        System.out.println("Yearly Salary For: "+employeeTest.getFirstName()+" is "+ raise1);
        System.out.println("Yearly Salary For: "+employeeTest2.getFirstName()+" is "+ raise2);
    }
    
}
