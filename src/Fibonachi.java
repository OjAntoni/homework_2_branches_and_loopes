public class Fibonachi {
    public static void main(String[] args) {
        int prev = 0;
        int next = 1;
        System.out.print(prev+" ");
        for(int i = 0;i < 11; i++){
            System.out.print(next+" ");
            int tmp = prev;
            prev = next;
            next = tmp + next;
        }
    }
}
