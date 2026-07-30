import java.util.Scanner;

public class prime_no {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=1) {
            System.out.println("Not prime");
            return;
        }

        for(int i=2;i<num;i++) {
            if (num % i ==0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
