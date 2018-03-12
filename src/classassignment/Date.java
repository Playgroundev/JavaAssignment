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
public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(int month,int day, int year){
        this.month = month;
        this.day= day;
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void displayDate(){
        System.out.println(this.getMonth()+"/"+this.getDay()+"/"+this.getYear());
        
    }
    public static void main(String[] args){
        Date date = new Date(4,5,2012);
        date.displayDate();
    }
    
}
