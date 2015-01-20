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
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = Power.myPow(2, 3);
        System.out.println(number);
        int number1 = Power.myPow(2, 5);
        System.out.println(number1);
    }
    public static int myPow(int x, int y){
        if(y == 0){
            return 1;
        }
        else{
            int result = myPow(x, y-1);
            return x * result;
        }
    }
}
