public class TesteCalculadora {
    public static void main(String[] args) {
        System.out.println("Começando...");
        Calculadora casio = new Calculadora();
        casio.somar(2, 3);
        casio.dividir(4, 2);
        casio.subtrair(2, 3);
        System.out.println("Terminando...");
    }
}

