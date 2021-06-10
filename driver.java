import java.util.*;

public class driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String s1 = sc.nextLine();
        System.out.println("Enter specialization");
        String s2 = sc.nextLine();
        Doctor obj = new Doctor(s1, s2);
        System.out.println(obj.displayDetails());
    }
}
