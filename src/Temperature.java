import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = Integer.parseInt(scanner.nextLine());

        if(temp>-5.0)
            System.out.println("Тепло");
        else if (temp<=-5.0 && temp >-20)
            System.out.println("Нормально");
        else if (temp<=-20)
            System.out.println("холодно");
    }
}
