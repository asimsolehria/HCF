
/**
 *
 * @author Asim
 */
import java.util.Scanner;

public class HCF {


    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input two numbers for calculating HCF:");
        int number_1=scan.nextInt();
        int number_2=scan.nextInt();
        
        while (number_1%number_2!=0) 
        {            
            int temp;
            temp=number_1;
            number_1=number_2;
            number_2=temp;
        }
        System.out.println("HCF of "+number_1+" and "+number_2+" is "+number_2);
        
    }
    
}
