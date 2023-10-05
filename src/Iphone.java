public class Iphone {

    ReprodutorMusical reprodutorMusical;
    AparelhoTelefonico aparelhoTelefonico;
    NavegadorInternet navegadorInternet;

    public Iphone(){
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.reprodutorMusical.tocar();
    }
    
}
