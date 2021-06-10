import java.util.*;

public class ani {
}

public class monkey extends ani {
}

public class test2 {
    public void method(ani a) {
        System.out.println("animal");
    }

    public void method(monkey m) {
        System.out.println("monkey");
    }

    public static void main(String args[]) {
        test2 objf = new test2();
        ani obj = new ani();
        objf.method(obj);
        monkey obj2 = new monkey();
        objf.method(obj2);
        obj = obj2;
        /*
         * gives output animal bcoz in overloading method resolution is always based on
         * reference type and runtime object won't play any role in overloading
         */
        objf.method(obj);
    }
}
