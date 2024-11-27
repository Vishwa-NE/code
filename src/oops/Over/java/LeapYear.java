package oops.Over.java;

import java.util.Scanner;
//find the 15 leap year from given year
public class LeapYear {
    public static void main(String[] args) {
        int []arr=new int[15];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int year=sc.nextInt();
        int count=0;
        while(count<15){
            if(isLeapYear(year)){
                arr[count]=year;
                count++;
            }
            year++;
        }
        for(int n:arr) {
            System.out.println(n);
        }
    }
    public static boolean isLeapYear(int num) {

        if (num % 4 == 0 && (num%100 !=0 || num%400==00)) {
            return true;
        }
        return false;
    }
}