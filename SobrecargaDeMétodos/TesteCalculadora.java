public class TesteCalculadora {
    public static void main(String[] args) {
        var calc = new Calculadora();
        var r = calc.somar(2, 3);
        System.out.println(r);
        var r2 = calc.somar(3f, 2f);
        System.out.println(r2);
        var r3 = calc.somar(2d, 4d);
        System.out.println(r3);
        var r4 = calc.somar("2", "3");
        System.out.println(r4);
        var r5 = calc.somar(2, "3");
        System.out.println(r5);
        var r6 = calc.somar("2", 3);
        System.out.println(r6);
    }
}
