public class Calculadora{
    //tipo de retorno, nome, lista de parâmetros e corpo
    //Há metodos q produzem um valor e o disponibilizam e outros q causam um efeito colateral
    int somar(int a, int b){ //void, int, string, double, etc = tipo de retorno
        //int resultado = a + b;
        return(a + b);
    } 
    void dividir(int a, int b){
        int c = a / b;
        System.out.println(c);
    }
    void subtrair(int a, int b){
        int c = a - b;
        System.out.println(c);
    }
}
