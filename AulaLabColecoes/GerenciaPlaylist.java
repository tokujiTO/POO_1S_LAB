import java.util.*;
import javax.swing.*;
public class GerenciaPlaylist {
    public static void main(String[] args) {
        List <Musica> musicas = new ArrayList<>();
        var menu = "[0] Sair\n[1] Cadastrar\n[2] Avaliar\n[3] Listar";
        int opt;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opt){
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Até logo!");
                    break;
                case 1:{
                    var titulo = JOptionPane.showInputDialog("Titulo?");

                    //construir um objeto musicas
                    var m1 = new Musica();

                    //Atribuir o titulo usando o método setter
                    m1.setTitulo(titulo);

                    //Adicionar a música à coleção
                    musicas.add(m1);

                    //Exibir uma mensagem de confirmação 
                    JOptionPane.showMessageDialog(null, "Sua música foi adicionada com sucesso!");
                    break;
                }
                case 2:{
                    //Pegar o titulo da musica a ser avaliado junto ao usuario
                    var titulo = JOptionPane.showInputDialog("Titulo?");

                    // //Verificar se a musica existe na coleção
                    var musica = new  Musica();
                    musica.setTitulo(titulo);
                    var indice = musicas.indexOf(musica);
                    if (indice >= 0){
                        //Se existir pegar a avaliação de 1 a 5 com o usuario
                        var avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Avaliação?"));

                        //Atribuir a avaliação a musica selecionada
                        musicas.get(indice).setAvaliacao(avaliacao);
                        
                        //Confirmar q a avaliação foi realizada
                        JOptionPane.showMessageDialog(null, "Musica avaliada com sucesso!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Esse título não foi adicionado!");
                    }
                    break;
                }
                case 3:{
                    var sb = new StringBuilder("");
                    for (Musica e : musicas){
                        sb.append(e.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;
                }
            }
        } while (opt != 0);
    }
}
