import java.util.ArrayList;

public class ArrayListLesson {


    public static void main(String[] args) {

        //ArrayLists are a dynamically sized class that work more similarly to JS and Python arrays.
        ArrayList<String> myList = new ArrayList<>();
        //Creates a new arraylist of strings


        //add elements
        myList.add("apple");
        myList.add("banana");
        System.out.println((myList));

        //Arraylist Methods

        //.set(index,replacement)
        myList.set(1,"blueberry");
        System.out.println(myList);

        //,isEmpty() returns bool T/F if list is empty
        System.out.println(myList.isEmpty());

        //.size() == len()
        System.out.println(myList.size());

        // .contains(element) returns T/F depeneding on if item in array
        System.out.println(myList.contains("blueberry"));

        //.clear() remove all elements form list

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        System.out.println((myList));
        list2.set(1,"blueberry");

        //Checks if two lists have same contents in same order
        System.out.println(myList.equals(list2));

        // .remove(index)
        list2.remove(0);
        System.out.println(list2);

        // .remove(element)
        list2.remove("blueberry");
        System.out.println(list2);
    }
}
