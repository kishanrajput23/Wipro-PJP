public class Q_11 {
    public static void main(String[] args) {
        int[] arr = {1,4,1,4,2};
        Boolean flag = true;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==1 || arr[i] == 4) {
                flag = true;
            }
            else {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    
}
