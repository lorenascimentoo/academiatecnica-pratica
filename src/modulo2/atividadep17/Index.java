public class Index {
    public static void main(String[] args) {
        //inicializacao de um objeto calculadora para acesso as metodos
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos();

        //chamando o metodo calculo do iss passando o valor do servico e o valor inteiro de % aliquota
        double iss = calc.calcularISS(1300, 5);

        //fazendo o teste de calculo de iof de uma compra no exterior com cartao de credito
        //chamando o metodo calculo do iof passando o valor da compra e o valor fixo de 6,38% da taxa
        double iof = calc.calcularIOF(1100, 6.38);

        // == CALCULO DE IR COM BASE ANUAL ==
        // fazendo o teste com cada caso de aliquota de IR
        // chamando o metodo calculo do ir passando o valor base de renda anual
        double irIsento = calc.calcularIRAnual(20596.74);
        double ir7e5 = calc.calcularIRAnual(25596.74);
        double ir15 = calc.calcularIRAnual(40596.74);
        double ir22e5 = calc.calcularIRAnual(50596.74);
        double ir27e5 = calc.calcularIRAnual(690596.74);

        System.out.println("O valor calculado de ISS é: "+iss);
        System.out.println();

        System.out.println("O valor calculado de IOF é: "+iof);
        System.out.println();

        System.out.println("O valor calculado de salario com aliquota isenta de IR é: "+irIsento);
        System.out.println("O valor calculado de salario com aliquota de 7,5% IR é: "+ir7e5);
        System.out.println("O valor calculado de salario com aliquota de 15% IR é: "+ir15);
        System.out.println("O valor calculado de salario com aliquota de 22,5% IR é: "+ir22e5);
        System.out.println("O valor calculado de salario com aliquota de 27,5% IR é: "+ir27e5);
    }
}
