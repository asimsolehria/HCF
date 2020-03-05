
/**
 *
 * @author Asim
 */
import java.util.Scanner;

public class GCD {


    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input two numbers for calculating Greatest Common Divisor:");
        int number_1=scan.nextInt();
        int number_2=scan.nextInt();
        
        while (number_1%number_2!=0) 
        {            
            int temp;
            temp=number_1;
            number_1=number_2;
            number_2=temp;
        }
        System.out.println("GCD of "+number_1+" and "+number_2+" is "+number_2);
        
    }
    
}
