public class VetoresDinamicos {
    int [] elementos;
    int quantidade;
    int capacidade;
    
    //construtor
    VetoresDinamicos(){ //Executa qunado vc fala "new"
        elementos = new int[4];
        quantidade = 0;
        capacidade = elementos.length;
    }
    void adicionar(int e){
        elementos[quantidade] = e;
        quantidade ++;
        if(quantidade == elementos.length){
            //Uma hora, os elementos vão lotar, a gnt terá que usar uma nova array.
            
        }
    }    

}
