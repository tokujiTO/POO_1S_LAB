import java.util.ArrayList;
import java.util.List;

public class TesteColecao {
  public static void main(String[] args) {
    Animal a1 = new Gato("Neko");
    Animal a2 = new Cachorro("Hiro");
    Animal a3 = new Pato("Prince");
    Animal a4 = new Ganso("Patinho feio");
    // a1.fazerBarulho();
    // a2.fazerBarulho();
    // a3.fazerBarulho();
    List<Animal> animais = new ArrayList<>();
    animais.add(a1);
    animais.add(a2);
    animais.add(a3);    
    animais.add(a4);
    for (Animal a : animais){
      // essa decisão eh tomada em tempo de decisao
      // ou seja a JVM toma essa decisao
      // polimorfimso dinâmico
      a.fazerBarulho();
    }
  }
}
