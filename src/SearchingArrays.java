import java.util.Arrays;

public class SearchingArrays {

    public static void main(String[] args) {

        int[] nums = {5,3,7,9,1,90,34,687};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //binary search only works on sorted lists
        int search = 7;
        int indexExisting = Arrays.binarySearch(nums, search);
        System.out.println(indexExisting);

        //Not found
        int search2 = 8;
        int indexExisting2 = Arrays.binarySearch(nums, search2);
        System.out.println(indexExisting2);
        //returns negative value of where the searched item would be in the list -1.
        //8 would be at index 4 so it returned -5
    }
}
