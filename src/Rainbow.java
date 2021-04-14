import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int color = Integer.parseInt(scanner.nextLine());

        switch(color){
            case 1:
                System.out.println("red");
                break;
            case 2:
                System.out.println("orange");
                break;
            case 3:
                System.out.println("yellow");
                break;
            case 4:
                System.out.println("green");
                break;
            case 5:
                System.out.println("blue");
                break;
            case 6:
                System.out.println("dark blue");
                break;
            case 7:
                System.out.println("purple");
                break;
            default:
                System.out.println("Only numbers from 1 to 7 are acceptable");
        }
    }
}
