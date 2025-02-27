import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry"};
        //Converting Array into an ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("ArrayList: " + arrayList);

        String[] myArray = arrayList.toArray(new String[0]);

    }
}
