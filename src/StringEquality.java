public class StringEquality {

    public static void main(String[] args) {

        String a = "test";
        String b = "test"; //points to same place in mem as a inside the String pool
        String c = new String("test"); //points to different place in mem, separate from the string pool
        System.out.println(a == c); //Looks at location
        System.out.println(a.equals(c)); // looks at just the value
    }
}
