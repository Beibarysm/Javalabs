import java.util.*;

public class Ugadai {
    public static void main(String[] args) {
        int x = 0;
        int n;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("введите число от 1 до 10:");

        n = rand.nextInt(10)+1;
        for ( int i=0;i<2;i++) {
            x = in.nextInt();

            if (x < n) {
                System.out.print("ваше число меньше:");
            }
            if (x > n) {
                System.out.print("ваше число больше:");
            }
            if (x==n){
                System.out.print("вы выиграли");
                break;
            }

        }
        x = in.nextInt();
        if (n!=x){
            System.out.println("вы проиграли, загаданное число " + n);
        }
        if (n==x){
            System.out.println("вы выиграли");
        }
    }
}
