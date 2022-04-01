public class Q_10 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,3,3,2};
        int countE = 0;
        int countO = nums.length-1;
        int[] array = new int[nums.length];    
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
        
            array[countE] = nums[i];
            countE++;
            }
            else {
                array[countO] = nums[i];
                countO--;
            }
        }
        for (int j=0; j<array.length; j++) {
            System.out.print(array[j] + ", ");
        }
    }
}