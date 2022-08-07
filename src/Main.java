public class Main {
    public static void main(String[] args) {
        int[] sales = { 10, 45, 599, 432, 23 };
        SalesManager manager = new SalesManager(sales);
        System.out.println("Максимум: " + manager.max());
    }
}
