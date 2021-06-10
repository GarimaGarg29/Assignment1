public class test {
    public static void main(String args[]) {
        method(null);
    }

    public static void method(Object o) {
        System.out.println("Object method");
    }

    public static void method(String s) {
        System.out.println("String method");
    }
    /*
     * Output-String method bcoz Object class is the parent class of all the classes
     * and first preference goes to the child class. If doesn't match with child
     * class and go to parent class i.e. it follows a hierarchy.
     * 
     */
}
