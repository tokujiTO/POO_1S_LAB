//generics (jva5+)
public class VetoresDinamicos <Tipo>{
    private Tipo [] elementos;
    private int quantidade;
    private int capacidade;

    // construtor
    VetoresDinamicos() { // Executa qunado vc fala "new"
        elementos = (Tipo[]) new Object[4];
        quantidade = 0;
        capacidade = elementos.length;
    }

    public void adicionar(Tipo e) {
        if (estaCheio()) {
            // Uma hora, os elementos vão lotar, a gnt terá que usar uma nova array.
            redimencionar();
        }
        elementos[quantidade] = e;
        quantidade++;
    }

    private boolean estaCheio(){
        return quantidade == capacidade;
    }

    // escrever um metodo que diz se o vetor dinâmico está vazio
    private boolean estaVazio() {
        return quantidade == 0;
    }

    public String trueString() {
        var sb = new StringBuilder("");
        sb.append("Quantidade: ").append(quantidade).append("\n");
        sb.append("Capacidade: ").append(capacidade).append("\n");
        if (!estaVazio()) {
            sb.append("Itens: ").append("\n");
            // for each
            // for (int e : elementos) {
            //     sb.append(e).append(" ");
            // }
            for (int i = 0 ; i < quantidade ; i++){
                sb.append(elementos[i]).append(" ");
            }
        }
        return sb.toString();
    }

    private void redimencionar() {
        // dobrar a capacidade
        capacidade *= 2;
        // alocar um vetor de ints chamado aux com essa nova capacidade
        var aux = (Tipo[]) new Object[capacidade];
        // copiar todo mundo de elementos para aux
        for(int c = 0; c < quantidade; c++){
            aux[c] = elementos[c];
        }
        // fazer com q elementos referencie o msmo vetor referenciado por aux
        elementos = aux;
    }
}
