
package basicjavafinal;

import java.util.Scanner;

public class BioData {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
        
    int year;
        System.out.print("enter a year: ");
        year=input.nextInt();
        
        String str;
       str =((year%400==0) || (year%4==0 && year%100!=0))? year+" = leap year" : year+" = is not leap year";
          System.out.print(str);  
       }
       }
