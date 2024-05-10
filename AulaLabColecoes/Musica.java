public class Musica {
    private String titulo;
    private int avaliacao;

    //GETTERS
    public int getAvaliacao() {
        return avaliacao;
    }
    public String getTitulo() {
        return titulo;
    }

    //SETTERS
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean equals (Object o){
        var m = (Musica) o;
        return m.titulo.equals(this.titulo);
    }

    public String toString(){
        var sb = new StringBuilder("");
        sb.append("Título: ").append(titulo);
        sb.append("|").append("Avaliação: ").append(avaliacao);
        return sb.toString();
    }
}
