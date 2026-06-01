public class Pattern_matching {

    // Method to check object type
    static void checkType(Object obj) {

        if (obj instanceof Integer) {

            System.out.println(obj + " is an Integer");

        } else if (obj instanceof String) {

            System.out.println(obj + " is a String");

        } else if (obj instanceof Double) {

            System.out.println(obj + " is a Double");

        } else {

            System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args) {

        checkType(10);
        checkType("Hello");
        checkType(25.5);
    }
}