import java.util.ArrayList;

public class IntArrayLists {
    public static void main(String[] args) {

        //cant use primitive types (int, boolean, char, double)
        //need class version (Integer, Double, Boolean, Character)
//        ArrayList<int> nums = new ArrayList<int>();

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums);

        //removing ints (will look like removing usings index)

        nums.remove(Integer.valueOf(10));
        System.out.println(nums);
    }
}
