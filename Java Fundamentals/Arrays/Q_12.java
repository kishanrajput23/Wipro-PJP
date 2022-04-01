public class Q_12 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int c[] = new int[2];
        c[0] = a[1];
        c[1] = b[1];
        System.out.println(c[0] + ", " + c[1]);
    }
}