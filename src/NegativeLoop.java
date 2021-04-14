public class NegativeLoop {
    public static void main(String[] args) {
        for(int i = 0,j = 0; i < 10; i++,j+=5)
            System.out.println((-1)*j);
    }
}
