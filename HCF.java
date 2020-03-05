
/**
 *
 * @author Asim
 */
import java.util.Scanner;

public class HCF 
{

    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input two numbers to calculate HCF :");
        int number_1,number_2,remainder;
        number_1=scan.nextInt();
        number_2=scan.nextInt();
        remainder=number_1%number_2;
        while(remainder!=0)
        {
            number_1=number_2;
            number_2=remainder;
            remainder=number_1%number_2;
        }
        System.out.println(number_2);
    }
    
}
