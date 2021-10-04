public class TelaPrincipalLoja {
    public static void main(String[] args) {
        //Instanciando um novo objeto do tipo produto
        Produto p = new Produto();
        // atribuindo o valor de codigo do objeto p 
        p.setCodigo(01);
        // atribuindo o valor de nome do objeto p
        p.setNome("Mochila");
        // atribuindo o valor de descricao do objeto p
        p.setDescricao("Capacidade para notebook de 15.6 polegadas");
        // atribuindo o valor de descricao do objeto p
        p.setValor(206.10);

        //Acessando os valores atraves dos metodos para impressao dos resutados
        System.out.println("========== PRODUTO ==========");
        System.out.printf("-- CODIGO: %d || NOME: %S \n",p.getCodigo(),p.getNome());
        System.out.println("-- DESCRICAO: "+p.getDescricao());
        System.out.printf("-- VALOR: %.2f\n",p.getValor());
        System.out.println("=============================");
    }
}
