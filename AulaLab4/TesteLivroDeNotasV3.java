public class TesteLivroDeNotasV3 {
    public static void main(String[] args) {
        var livro = new LivroDeNotas();

        // livro.nomeDaDisciplina = "POO"; -- A partir do momento que colocamos o private na classe LivroDeNotas, ela n pode mais acessar o nomeDaDisciplina

        livro.setNomeDisciplina("POO");

        livro.exibirMensagem();
        System.out.println("O nome da disciplina é" + livro.getNomeDaDisciplina());
    }
}
