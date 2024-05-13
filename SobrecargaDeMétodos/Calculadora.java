public class Calculadora{
    // Sobrecarga de métodos ou polimorfismo estático (estático = feito pelo computador)
    public int somar(int a, int b){
        return a+b ;
    }
    // public int somar(int v1, int v2){
    //     return v1 + v2 ;
    // }    ESSE CARA É IGUAL AO DE CIMA E POR ISSO O COMPILADOR N COMPILA 
    public float somar(float a, float b){
        return a+b ;
    }
    public double somar(double a, double b){
        return a+b ;
    }
    public int somar(String a, String b){
        return  Integer.parseInt(a) + Integer.parseInt(b);
    }
    public int somar(String a, int b){
        return somar(Integer.parseInt(a), b);
    }
    public int somar(int a, String b){
        return somar(a, Integer.parseInt(b));
    }
    public int somar(int a, int b, int c){
        return somar(a, somar(b, c));
    }

}