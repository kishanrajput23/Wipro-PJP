public class Q_1 {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }

        double avg = sum / arr.length;

        System.out.println("The sum of an array is " + sum);
        System.out.println("The average of an array is " + avg);
    }
}