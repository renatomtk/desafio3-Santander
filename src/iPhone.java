public class iPhone {

    public static void main(String[] args) {
        ReprodutorMusical.selecionarMusica("Like a Stone");
        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();

        AparelhoTelefonico.ligar("+554299999-9999");
        AparelhoTelefonico.atender();
        AparelhoTelefonico.iniciarCorreioVoz();

        NavegadorInternet.exibirPagina("www.google.com.br");
        NavegadorInternet.adicionarNovaAba();
        NavegadorInternet.atualizarPagina();
    }
}