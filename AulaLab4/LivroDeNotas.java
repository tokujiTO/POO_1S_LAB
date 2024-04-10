public class LivroDeNotas {
    
    private String nomeDaDisciplina;
    // Método setter (modificador)
    public void setNomeDisciplina(String nomeDaDisciplina){
        this.nomeDaDisciplina = nomeDaDisciplina;
    }
    public String getNomeDaDisciplina(){
        return this.nomeDaDisciplina;
    }

    void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s!\n", nomeDaDisciplina);
    }
}
