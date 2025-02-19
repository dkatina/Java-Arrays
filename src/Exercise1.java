import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {
        int[] nums = {3,7,1,9,5};
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 2]);



        int large2 = 0;
        int largest = 0;
        for(int num: nums){
            if(num > largest){
                large2 = largest;
                largest = num;

            }

        }
        System.out.println(large2);
    }
}
