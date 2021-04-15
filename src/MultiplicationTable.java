public class MultiplicationTable {
    public static void main(String[] args) {
        for(int rows = 1; rows <= 9; rows++){
            for(int col = 1; col <=9; col++){
                System.out.printf("%4d",rows*col);
            }
            System.out.println();
        }
    }
}
