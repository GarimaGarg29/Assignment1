import java.util.*;

public class animal {
    static int c = 1;

    static void display() {
        System.out.println("This is Animal Class");
    }

    void check() {
        System.out.println("Function without static in Animal");
    }
}

public class cat extends animal {
    static int c = 4;

    static void display() {
        System.out.println("This is cat class");
    }

    void check() {
        System.out.println("Function without static in cat class");
    }
}

public class demo {
    public static void main(String args[]) {
        cat obj1 = new cat();
        animal obj2;// reference of base class
        obj2 = obj1;// referring to object class
        obj2.check();// giving priority to Child class
        obj2.display();/*
                        * giving priority to Parent class bcoz static methods are resolved using type
                        * of variable and type of variable is pointing to parent class
                        */
        System.out.println(obj2.c);// gives output 1
        System.out.println(obj1.c);// gives output 4
    }

}
