import java.util.Scanner;

public class IntSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());
        if (end > 0) {
            int sum = 0;
            for(int i = 1; i <= end; i++) sum += i;
            System.out.println(sum);
        }
        else System.out.println("Only positive numbers are acceptable");
    }
}
