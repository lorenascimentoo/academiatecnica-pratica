
public class index {
    public static void main(String[] args) {
 
        //Construcao do primeiro objeto
        Pessoa pessoa1 = new Pessoa();
        //Preenchimento dos valores do objeto um
        pessoa1.nome = "Donna";
        pessoa1.sobrenome = "Paulsen";
        pessoa1.idade = 37;
 
        //Construcao do segundo objeto
        Pessoa pessoa2 = new Pessoa();
        //Preenchimento dos valores do objeto dois
        pessoa2.nome = "Harvey";
        pessoa2.sobrenome = "Specter";
        pessoa2.idade = 38;

        imprimir("A primeira pessoa é:", pessoa1);
        imprimir("A segunda pessoa é:", pessoa2);
    }

    static void imprimir(String msg,Pessoa pessoa){
            System.out.print(msg);
            System.out.printf(" %s %s, %d anos de idade.\n", pessoa.nome, pessoa.sobrenome, pessoa.idade);
    }
    
}