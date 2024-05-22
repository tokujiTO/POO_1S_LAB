public class AnimalOld{
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    private int tipo;

    public AnimalOld(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    // 1 : GATO
    // 2 : CACHORRO
    public void fazerBarulho(){
        if (tipo == 1)
            System.out.println("Miau");
        else if (tipo == 2)
            System.out.println("Au");
        else if (tipo == 3)
            System.out.println("Quack");
    }
}
