public class ReprodutorMusical extends iPhone {
    public static void tocar() {
        System.out.println("A música está sendo reproduzida...");
    }

    public static void pausar() {
        System.out.println("A música está sendo pausada...");
    }

    public static void selecionarMusica(String musica) {
        System.out.println("Você selecionou a música " + musica);
    }
}