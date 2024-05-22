public class Gato extends Animal {
    public Gato(String nome){
        super(nome);
    }
    // Fazer barulho personalizado (sobreescrita (override))
    // Personalizar o funcionamento desse método
    public void fazerBarulho(){
        System.out.println("Miau");
    }
}
