public class CadastroDePessoas {
    public static void main(String[] args) {
        
        //Criando um array do tipo pessoa com 5 posicoes
        PessoaFisica[] pessoasFisicas = new PessoaFisica[5];

        // Criacao do objeto do tipo pessoa : N1
        PessoaFisica p1 = new PessoaFisica();
        p1.setCodigo(1);
        p1.setNome("Mike");
        p1.setSobrenome("Ross");
        p1.setIdade((byte)30);
        p1.setRg("1111111");
        p1.setCpf("11111111111");

        // Criacao do objeto do tipo pessoa : N2
        PessoaFisica p2 = new PessoaFisica();
        p2.setCodigo(2);
        p2.setNome("Rachel");
        p2.setSobrenome("Zane");
        p2.setIdade((byte)29);
        p2.setRg("2222222");
        p2.setCpf("22222222222");

        // Criacao do objeto do tipo pessoa : N3
        PessoaFisica p3 = new PessoaFisica();
        p3.setCodigo(3);
        p3.setNome("Jessica");
        p3.setSobrenome("Pearson");
        p3.setIdade((byte)49);
        p3.setRg("3333333");
        p3.setCpf("33333333333");

        // Criacao do objeto do tipo pessoa : N4
        PessoaFisica p4 = new PessoaFisica();
        p4.setCodigo(4);
        p4.setNome("Donna");
        p4.setSobrenome("Paulsen");
        p4.setIdade((byte)35);
        p4.setRg("4444444");
        p4.setCpf("44444444444");

        // Criacao do objeto do tipo pessoa : N5
        PessoaFisica p5 = new PessoaFisica();
        p5.setCodigo(5);
        p5.setNome("Harvey");
        p5.setSobrenome("Specter");
        p5.setIdade((byte)37);
        p5.setRg("5555555");
        p5.setCpf("555555555555");

        //Atribuindo cada objeto em uma posicao do array
        pessoasFisicas[0]=p1;
        pessoasFisicas[1]=p2;
        pessoasFisicas[2]=p3;
        pessoasFisicas[3]=p4;
        pessoasFisicas[4]=p5;
    }
}
