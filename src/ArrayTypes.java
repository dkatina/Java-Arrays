import java.util.Arrays;

public class ArrayTypes {

    public static void main(String[] args) {
        //arrays are of a set size
        int[] nums = new int[5]; //creating a new array called nums of size 5

        for(int i = 0; i < nums.length; i++){
            nums[i] = i;

        }
        System.out.println(Arrays.toString(nums));

        //All the following are valid declarations of an array
        //int[] nums
        //String [] strs
        //boolean bools[]
        //int nums2 []

        //can also define arrays with initial values
        int[] nums2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums2));

        //accessing last index (length of array - 1)
        System.out.println(nums2[nums2.length - 1]);

        //sorting arrays with Arrays.sort()
        int[] num3 = {4,5,1,67,2,4,1};
        System.out.println(Arrays.toString(num3));
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));

        //sorting words in Alphabetic order
        String[] words = {"banana", "apple", "cherry", "date"};

// Print the array before sorting
        System.out.println("Before sorting: " + Arrays.toString(words));

// Sort the array
        Arrays.sort(words);

// Print the array after sorting
        System.out.println("After sorting: " + Arrays.toString(words));
    }
}
