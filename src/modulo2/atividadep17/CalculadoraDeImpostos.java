
public class CalculadoraDeImpostos {

    private double valorIss, valorIof, valorIr;

    // metodo utilizado para calculo do ISS
    public double calcularISS(double valorBase, double aliquota){
        //calculo ISS é o preco do servico * a aliquota praticada
        valorIss = valorBase * (aliquota/100);
        return valorIss;
    }
    
    // metodo utilizado para calculo do IOF
    public double calcularIOF(double valorBase, double taxaIof){
        //calculo IOF é o valor * a taxa de iof aplicada
        valorIof = valorBase * (taxaIof/100); 
        return valorIof;
    }
    
    // metodo utilizado para calculo do IR
    public double calcularIR(double valorBase){
        //sera realizado a deducao de IR com a base de calculo anual
        //foi utilizada a tabela de IR do ano base 2020
        
        if(valorBase<=22847.76){
            valorIr = 0;
        }else if(valorBase > 22847.76 && valorBase <= 33919.80){
            valorIr = valorBase * (7.5/100);
        }else if(valorBase > 33919.80 && valorBase <= 45012.60){
            valorIr = valorBase * (15/100);
        }else if(valorBase > 45012.60 && valorBase <= 55976.16){
            valorIr = valorBase * (22.5/100);
        }else if(valorBase > 55976.16){
            valorIr = valorBase * (27.5/100);
        } 
             
        return valorIr;
    }
}