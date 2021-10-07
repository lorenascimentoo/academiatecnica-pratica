package P1;

public class Tela {
    public static void main(String[] args) {
        
        // Instanciando um objeto do tipo aluno
        Aluno a1 = new Aluno();
        // atribuindo os valores com os metodos setters
        a1.setNome_completo("Natasha Zapata");
        a1.setIdade((byte)18);
        a1.setMatricula(1);

        // Instanciando um objeto do tipo aluno
        Aluno a2 = new Aluno();
        // atribuindo os valores com os metodos setters
        a2.setNome_completo("Rich DotCom");
        a2.setIdade((byte)30);
        a2.setMatricula(10211);

        System.out.println("============= DADOS DO ALUNO =============");
        System.out.println(a1);
        System.out.println("==========================================");
        
        System.out.println();
        
        System.out.println("============= DADOS DO ALUNO =============");
        System.out.println(a2);
        System.out.println("==========================================");
    }
}
