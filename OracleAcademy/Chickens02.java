public class Chickens02 {
    public static void main(String[] args) {
        int totalDeOvos = 0;
        double totalDeLucro, dailyAverage, monthlyAverage;
        totalDeOvos += 100;
        totalDeOvos += 121;
        totalDeOvos += 117;
        dailyAverage = totalDeOvos/3.0;
        monthlyAverage = dailyAverage * 30;
        totalDeLucro = monthlyAverage * 0.18;
        System.out.println(dailyAverage);
        System.out.println(monthlyAverage);
        System.out.println(totalDeLucro);
    }
}
