/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author Michael
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = Fibonacci.nonRecursive(6);
        System.out.println("nonRecursive: "+number);
        
        int number2 = Fibonacci.recursive(6);
        System.out.println("recursive: "+ number2);
    }
    public static int nonRecursive(int n){
        if(n == 0){
            return  0;
        }
        else if(n <= 2){
            return 1;
        }
        else{
            int x = 1;
            int y = 1;
            int z = x + y;
            
            for(int i = 3;i < n;i ++){
                x = y;
                y = z;
                z = x+y;
            }
            return z;
        }
        
    }
    public static int recursive(int n){
        if(n == 0){
            return  0;
        }
        else if(n <= 2 ){
            return  1;
        }
        else{
            int fn = recursive(n-1) + recursive(n-2);
            return fn;
        }
    }
}
