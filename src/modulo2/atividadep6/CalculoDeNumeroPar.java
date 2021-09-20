package modulo2.atividadep6;

public class CalculoDeNumeroPar {
    public static void main(String[] args) {

        for (int numero=0; numero<=100;numero++){
            if (numero%2 == 0){
                System.out.printf("Este numero e par! Numero: %d\n",numero);
            }
        }

    }
}
