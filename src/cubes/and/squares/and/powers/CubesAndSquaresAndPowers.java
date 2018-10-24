/*
 *Jessica Qiao
 *24/10/2018
 */

package cubes.and.squares.and.powers;
import java.util.Scanner;

/**
 *
 * @author shqia0005
 */
public class CubesAndSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        int choice = 0;
        int usernum;
        int userchoice;
        double userpower;
        double usernumber;
        
        
        System.out.println("------Cube and squares and powers------");
        do{
            System.out.println("Please enter your chiice from 1 to 4");
        userchoice = keyedInput.nextInt();
        
        
            if(userchoice == 1)
            {
             System.out.println("Please enter a number");
             usernum = keyedInput.nextInt();
             
             {
              System.out.println("The squared of the number is " + usernum * usernum);
             }
            }
            if(userchoice == 2)
            {
             System.out.println("Please enter a number");
             usernum = keyedInput.nextInt();
             
             {
              System.out.println("The cubed of the number is " +(usernum * usernum * usernum));
             }
            }
            if(userchoice == 3)
            {
             System.out.println("Please enter a number");
             usernumber = keyedInput.nextInt();
             System.out.println("Please enter power");
             userpower = keyedInput.nextInt();
             {
              System.out.println("the number to the power is " + java.lang.Math.pow(usernumber, userpower));
             }
            }  
            if(userchoice == 4)
            {
             System.out.println("YOU GOT EXIT!");
            }
            
        }while (userchoice != 4)
            
         
        
        
        
        
        
            
            
            
        
            
        
    
    }
    
}
