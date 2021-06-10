import java.util.*;

public class tyres {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tyres");
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 2) {
            bike obj = new bike();
            obj.display();
        } else if (n == 4) {
            car obj = new car();
            obj.display();
        } else {
            vehicle obj = new vehicle();
            obj.display();
        }
    }
}
