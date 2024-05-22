public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Hiro");
        Gato g1 = new Gato("Neko");
        Pato p1 = new Pato("Prince");
        // Animal a1 = new AnimalOld("Ryu");

        c1.fazerBarulho();
        g1.fazerBarulho();
        p1.fazerBarulho();
        // a1.fazerBarulho();
    }
}
