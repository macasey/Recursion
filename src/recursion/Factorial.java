/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//This is my first change to it
package recursion;

/**
 *
 * @author Michael
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int number = Factorial.factorial(3);
        System.out.println(number);
    }
    public static int factorial(int n){
        if(n ==0){
            return 0;
        }
        else if(n ==1){
            return 1;
        }
        else{
            return n * factorial(n -1);
        }
    } 
}
