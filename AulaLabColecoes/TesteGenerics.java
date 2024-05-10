public class TesteGenerics {
    public static void main(String[] args) {
        VetoresDinamicos <String> v1 = new VetoresDinamicos<>();
        v1.adicionar("Ana");
        v1.adicionar("Pedro");
        VetoresDinamicos <Integer> v2 = new VetoresDinamicos<>();
        v2.adicionar(3);
        v2.adicionar(7);
        
    }
}
