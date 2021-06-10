public class plant {
    public void type(String... names) {
        // static int c=0;
        // c++;
        System.out.println("Counting the different varities of plants");
    }

    public void color(String... col) {

        System.out.println("Counting of plants");
    }
}

public class rose extends plant {

    public void type(String... names) {
        // static int c=0;
        // c++;
        System.out.println("Counting the different varities of rose");
    }

    public void color(String... col) {

        System.out.println("Counting for rose");
    }
}

public class varargsexa {
    public static void main(String args[]) {
        plant obj = new plant();
        rose obj2 = new rose();
        obj = obj2;
        obj.type("red-rose");
    }
}