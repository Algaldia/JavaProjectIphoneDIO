import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {

    private boolean pausado = true;
    private List<String> playList = new ArrayList<String>();
    private String musicaSelecionada;


    public ReprodutorMusical(){
        playList.add("Musica 1");
        playList.add("Musica 2");
        playList.add("Musica 3");
    }

    public void tocar(){
        if (pausado == true){
            pausado = false;
            System.out.println("Tocando música " + musicaSelecionada);
        }
    }

    public void pausar(){
        if (pausado == false){
            pausado = true;
            System.out.println("Pausando música " + musicaSelecionada);
        }
    }

    public void selecionarMusica(String musica){
        for (String m : playList){
            if(musica.equalsIgnoreCase(m)){
                musicaSelecionada = m;
            }
        }
        System.out.println("Música " + musicaSelecionada + " Selecionada.");
    }
    
}
