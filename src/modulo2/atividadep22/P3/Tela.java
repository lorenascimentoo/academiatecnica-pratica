package P3;

public class Tela {
    public static void main(String[] args) {
        // instanciando um objeto do calculadora
        Calculadora c = new Calculadora();

        // chamando cada metodo do objeto e atribuindo o valor a uma variavel
        int rInt = c.soma(5, 3);
        double rDouble = c.soma(15.0, 23.5);
        float rFloat = c.soma(2.5f, 1.45f, 20f);
        long rLong = c.soma(25, 36, 45);

        // impressao dos resultados
        System.out.println(" O valor de soma de inteiros é: "+rInt);
        System.out.println(" O valor de soma de double é: "+rDouble);
        System.out.println(" O valor de soma de float é: "+rFloat);
        System.out.println(" O valor de soma de long é: "+rLong);
    }
}
