import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
        var v = new VetoresDinamicos();
        var gerador = new Random();
        while(true){
            var valor = gerador.nextInt(6) + 1;
            v.adicionar(valor);
            System.out.println(v.trueString());
            System.out.println("***************************************************");
            Thread.sleep(1000);
        }
    }
}
