import java.util.*;

public class constructoroverloading {
    int a, b, c;

    constructoroverloading() {
        System.out.println("Default");
    }

    constructoroverloading(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parameterized Constructor");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    constructoroverloading(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Parameterized Constructor");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    constructoroverloading(int a) {
        this.a = a;
        System.out.println("Parameterized Constructor");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }
}

public class demoo {
    public static void main(String args[]) {
        constructoroverloading obj = new constructoroverloading();
        constructoroverloading obj2 = new constructoroverloading(3);
        constructoroverloading obj3 = new constructoroverloading(1, 2, 3);
        constructoroverloading obj4 = new constructoroverloading(8, 9);
    }
}
