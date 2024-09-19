import java.util.*;

public final class Mazo {

    //Atributos
    ArrayList<Carta> baraja = new ArrayList<>();
    ArrayList<Carta> pila = new ArrayList<>();

    //Metodo constructor
    public Mazo(){
        resetMazo();
    }

    //Reinicia el mazo
    public void resetMazo(){
        Carta carta = new Carta(Carta.Figura.PICA, 2);
        for(int i = 2; i <= 14; i++){
            for(int j = 1; j <= 4; j++){
                switch(j){
                    case 1 -> carta = new Carta(Carta.Figura.PICA, i);
                    case 2 -> carta = new Carta(Carta.Figura.TREBOL, i);
                    case 3 -> carta = new Carta(Carta.Figura.DIAMANTE, i);
                    case 4 -> carta = new Carta(Carta.Figura.CORAZON, i);
                }
                baraja.add(carta);
            }
        }
    }

    //Rehace el mazo desde la pila
    public void redoMazo(){
        Carta carta;
        int size = pila.size();
        for(int i = 0; i < size; i++){
            carta = getFromPila();
            baraja.add(carta);
        }
    }

    //Mezcla la baraja
    public void shuffleMazo(){
        Collections.shuffle(baraja);
    }

    //Da una mano
    public ArrayList<Carta> giveMano(int manoSize){
        Carta carta;
        ArrayList<Carta> mano = new ArrayList<>();
        for(int i = 1; i <= manoSize ;i++){
            carta = baraja.get(0);
            baraja.remove(0);
            mano.add(carta);
        }
        return mano;
    }

    //Da una carta del mazo
    public Carta getFromMazo(){
        Carta carta = baraja.get(0);
        baraja.remove(0);
        return carta;
    }

    //Manda una carta a la pila
    public void toPila(Carta carta){
        pila.add(carta);
    }

    //Obtiene una carta de la pila
    public Carta getFromPila(){
        Carta carta = baraja.get(0);
        pila.remove(0);
        return carta;
    }

    //Muestra las cartas que hay en mazo y en pila
    public String mazoStatus(){
        String status = "Mazo : ["+baraja.size()+"]\nPila : ["+pila.size()+"]\n";
        return status;
    }

}

