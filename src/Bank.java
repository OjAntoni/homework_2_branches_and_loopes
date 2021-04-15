import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum: ");
        float sum = Float.parseFloat(scanner.nextLine());
        float add = (float) (0.07*sum);
        System.out.println("Enter number of months: ");
        int num = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < num; i++){
            sum += add;
        }

        System.out.println("Your sum will be " + sum);
    }
}
