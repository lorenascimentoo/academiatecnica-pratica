package modulo2.atividadep6;

public class CalculoInvestimento {
    public static void main(String[] args) {
        System.out.println("==================== CALCULO DE INVESTIMENTO ====================");
        double investimentoInicial = 5000.00, investimento=investimentoInicial, juros=0.0, jurosTotal=0.0, valorfinal;

        for (int i=1; i<=24;i++){
            juros += investimento*0.02;
            jurosTotal += juros;
            investimento += juros;
        }

        System.out.printf("Valor inicial do investimento: %.2f\n",investimentoInicial);
        System.out.printf("Valor de juros: %.2f\n",jurosTotal);
        System.out.printf("Valor final do investimento: %.2f\n", investimento);
    }
}
