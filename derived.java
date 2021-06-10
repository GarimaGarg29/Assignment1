import java.util.*;

public class derived extends base {
    Scanner sc = new Scanner(System.in);

    derived() {
        System.out.println("Enter the width");
        int w = sc.nextInt();
        // sc.nextLine();
        System.out.println("Enter the height");
        int h = sc.nextInt();
        width = w;
        height = h;
    }

    void display() {
        super.display();
        System.out.println("Area of rectangle=" + (width * height));
    }

    public static void main(String args[]) {
        derived obj = new derived();

        obj.display();
    }
}
