public class Calculator {
    double tax = 0.05;
    double tip = 0.15;
    double total;
    public void findTotal ( double originalPrice) {
        total = originalPrice * (1 + tip + tax);
        System.out.println(total%.2f);
    }
}

