public class Main {
    public static void main(String[] args) {
        // instanciando um objeto do tipo Computador
        Computador comp1 = new Computador();
        // atribuindo valores ao objeto do tipo Computador
        comp1.marca = "DELL";
        comp1.memoria_ram = "4GB";
        comp1.disco_rigido = "1TB";
        comp1.processador = "Intel Celeron";

        // instanciando um objeto do tipo Notebook
        Notebook note1 = new Notebook();
        // atribuindo valores ao objeto do tipo Notebook
        note1.bateria = "6 Celulas - 3h";
        note1.velocidade_wifi= "200 mbps";
        note1.versao_bluetooth = "5";
        // atribuindo valores herdados da classe Computador
        note1.marca = "ACER";
        note1.disco_rigido = "256 GB SSD";
        note1.memoria_ram = "8GB";
        note1.processador = "INTEL CORE I7";

        // instanciando um objeto do tipo Desktop
        Desktop dsktp = new Desktop();
        // atribuindo valores ao objeto do tipo Desktop
        dsktp.fonte = "650 WATTS";
        dsktp.monitor_externo = "23\"8 POLEGADAS";
        dsktp.tamanho_gabinete = "438mm x 360mm x 208mm";
        // atribuindo valores herdados da classe Computador
        dsktp.marca = "HP";
        dsktp.disco_rigido = "512GB SSD";
        dsktp.memoria_ram = "16 GB";
        dsktp.processador = "RYZEN 7";

        // Criacao de um objeto a partir de computador
        Object objComp = comp1;

        // Criacao de um objeto a partir de notebook
        Object objNote = note1;

        // Criacao de um objeto a partir de desktop
        Object objDesk = dsktp;

        // Conversao de um object em computador
        Computador compObj = (Computador) objComp;

        // Conversao de um object em notebook
        Notebook noteObj = (Notebook) objNote;

        // Conversao de um object em desktop
        Desktop deskObj = (Desktop) objDesk;

        //impressao dos dados do objeto computador convertido
        System.out.println(compObj);
        System.out.println("\n -- \n");
        //impressao dos dados do objeto notebook convertido
        System.out.println(noteObj);
    }
}
