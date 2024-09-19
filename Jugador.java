import java.util.*;

public class Jugador{

    //Atributos
    private final ArrayList<Carta> mano = new ArrayList<>();
    public String jugador;

    //Metodo Constructor
    public Jugador(String jugador){
        this.jugador = jugador;
    }
    
    //Recibe la mano del mazo
    public void getMano(ArrayList<Carta> mano){
        for(Carta carta: mano){
            this.mano.add(carta);
        }
    }

    //Recibe una sola carta del mazo
    public void getCarta(Carta carta){
        mano.add(carta);
    }

    //Descarta una sola carta
    public Carta discardCarta(int posCarta){
        int size = mano.size();
        if(posCarta <= 0){
            posCarta = 1;
        }else if(posCarta >= size){
            posCarta = size;
        }
        Carta carta = mano.get(posCarta - 1);
        mano.remove(posCarta - 1);
        return carta;
    }

    //Obtiene el tamaño de la mano
    public int getManoSize(){
        return mano.size();
    }

    //Obtiene la informacion del jugador
    public String infoJugador(){
        String cartas = "";
        for(Carta carta : mano){
            cartas = cartas + carta.getCarta() + " ";
        }
        return jugador + " cartas : " + getManoSize() + "\n" + cartas;
    }

}
