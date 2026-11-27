/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gonzales;

/**
 *
 * @author student
 */
public class Gonzales_MethodActivity {
    static int calculate(int x, int y){
        return x + y;
        
    }
    static double calculate (double  x, double y , char operator){
        switch(operator){
            case '+':
                return x + y;
            case '-':
                return x -y;
            case '*':
                return x*y ;
            case '/':
                return  x/y;
                
               default:
                 throw new IllegalArgumentException("Invalid!!!!!");
        }
        
    }
    
    
    public static void main(String[] args) {
        System.out.println(String.format("%.2f",calculate(10, 9,'+')));
        System.out.println(String.format("%.2f",calculate(10, 9,'-')));
        System.out.println(String.format("%.2f",calculate(10, 9,'*')));
        System.out.println(String.format("%.2f",calculate(10, 9,'/')));
	System.out.println("Welcomeeeee");
       
        
     
        
    }
}
