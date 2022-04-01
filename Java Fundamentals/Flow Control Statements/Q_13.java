public class Q_13 {
    public static void main(String args[]) {
        for (int i=10; i<=99; i++) {
            Boolean isPrime = true;
            for (int j=2; j<=i/2; ++j) {
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + " ");
        }
    }
}
