import java.util.*;

public class HCF {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter count of numbers to be taken HCF of: ");
        int n = keyboard.nextInt();

        while (n <= 0) {
            System.out.println("PLEASE ENTER A VALID VALUE");
            System.out.println("enter count of numbers to be taken HCF of: ");
            n = keyboard.nextInt();
        }

        List<int> numbers = new ArrayList<>();

        int hcf = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("enter a number: ");
            numbers.add(keyboard.nextInt());
        }

        hcf = calc_hcf(numbers.get(0), numbers.get(1));

        for (int j = 2; j < n; j++) {
            hcf = calc_hcf(hcf, numbers.get(j));
        }

        System.out.println(number_2);
        keyboard.close();
    }

    int calc_hcf(int n1, int n2) {
        if (n2 != 0)
            return calc_hcf(n2, n1 % n2);
        else
            return n1;
    }
}