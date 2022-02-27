/**
 * ArrayDictionaryTest
 * program designed to test the array dictonary class
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: 2/25/22
 **/

public class ArrayDictionaryTest {
    public static void main(String[] args) {
        ArrayDictionary a = new ArrayDictionary();
        System.out.println("a.isEmpty() : " + a.isEmpty());
        a.put("One",1);
        a.put("Two",2);
        a.put("Three",3);
        a.put("Four",4);
        System.out.println("a.isEmpty(): "+a.isEmpty());
        System.out.println("a.size() (4 values): "+a.size());
        System.out.println("test.get(\"Three\"): " + a.get("Three"));
        System.out.println("a.contains(\"Two\"): " + a.contains("Two"));
        System.out.println("a.contains(\"Five\") (Five was not addded so should be false) : " + a.contains("Five"));
        System.out.println("a.remove(\"two\") (Should return 2): "+ a.remove("Two"));
        System.out.println("a.put(\"Five\",5);");
        a.put("Five",5);
        System.out.println("a.put(\"Six\",6);");
        a.put("Six",6);
        System.out.println("a.put(\"Seven\",7);");
        a.put("Seven",7);
        System.out.println("a.keys(): " + a.keys());
        System.out.println("a.values(): " + a.values());


    }
}
