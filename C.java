import java.util.*;

public class C implements A, B {
    int x, y;

    public void read() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void sum() {
        System.out.println("Sum=" + (x + y));
    }

    String s;

    public void reads() {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }

    void display() {
        System.out.println("String=" + 8s);
    }

    public static void main(String args[]) {
        C obj = new C();
        obj.read();
        obj.reads();
        obj.sum();
        obj.display();

    }
}
