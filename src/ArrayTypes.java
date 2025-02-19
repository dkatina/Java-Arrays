import java.util.Arrays;

public class ArrayTypes {

    public static void main(String[] args) {
        //arrays are of a set size
        int[] nums = new int[5]; //creating a new array called nums of size 5

        for(int i = 0; i < nums.length; i++){
            nums[i] = i;

        }
        System.out.println(Arrays.toString(nums));

        //All of the following are valid declarations of an array
        //int[] nums
        //String [] strs
        //boolean bools[]
        //int nums2 []

        //can also define arrays with initial values
        int[] nums2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums2));
    }
}
