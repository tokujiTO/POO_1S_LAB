public class Chiken {
    public static void main(String[] args) {
        int eggsPerChiken = 4;
        int chikenCount = 3;
        int total = 0;

        total = chikenCount * eggsPerChiken;
        chikenCount += 1;
        total += chikenCount * eggsPerChiken;
        chikenCount /= 2;
        total += chikenCount * eggsPerChiken;
        System.out.println(total);

    }
}