public class varargsexa {
    public static void main(String args[]) {
        plant obj = new plant();
        rose obj2 = new rose();
        obj = obj2;
        obj.type("red-rose");
    }
}
