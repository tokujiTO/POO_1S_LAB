public class Personagem {

  // variáveis de instância(instância é sinônimo de objeto)
  String nome;
  private int energia = 10, fome = 0, sono = 0;

  // GETTER ENERGIA
  public int getEnergia() {
    return energia;
  }

  // GETTER SONO
  public int getSono() {
    return sono;
  }

  // GETTER FOME
  public int getFome() {
    return fome;
  }

  // método de instância
  void cacar() {
    if (energia >= 2) {
      System.out.println(nome + " caçando");
      energia = energia - 2; // energia -= 2;
    } else {
      System.out.printf("%s sem energia para caçar\n", nome);
    }
    fome = Math.min(fome + 1, 10);
    sono = sono == 10 ? sono : sono + 1;
  }

  // método de instância
  void dormir() {
    if (sono >= 1) {
      System.out.println(nome + " dormindo");
      sono = sono - 1;// sono -= 1;// --sono;// sono--;
      energia = Math.min(energia + 1, 10);
    } else {
      System.out.println(nome + " sem sono");
    }
  }

  // método de instância
  void comer() {
    // lógica em queda (fall-through)
    switch (fome) {
      case 0:
        System.out.println(nome + " sem fome");
        break;
      default:
        System.out.println(nome + " comendo");
        --fome;
        energia = energia < 10 ? energia++ : energia;
    }
  }

  // SETTTER ENERGIA
  public void setEnergia(int energia) {
    if (energia >= 0 && energia <= 10)
      this.energia = energia;
  }

  // PRINT STATUS
  public String toString() {
    return String.format(
        "Energia: %d, Fome: %d, Sono: %d", energia, fome, sono);
  }
}
// Princípio da alta coesão => quando a classe só tem um propósito
