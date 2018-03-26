import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tot, fibo = 1, awalan = 0;

        System.out.print("How much ur input: ");
        tot = in.nextInt();

        if (tot > 0){
            for (int i = 0; i < tot; i++) {
                System.out.print(fibo + ", ");
                int temp = fibo;
                fibo += awalan; //fibo + 0
                awalan = temp; // 0 = temp
            }
        }
    }
}
