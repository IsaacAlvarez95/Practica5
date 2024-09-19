
import java.util.*;

public class Juego{
    public static void main(String Args[]){
        //Crea el mazo y lo barajea
        Mazo mazo = new Mazo();
        mazo.shuffleMazo();
        System.out.println(mazo.mazoStatus());
        
        //Crea los jugadores
        Jugador jugador;
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 4; i++){
            System.out.println("Jugador "+ i +" :");
            jugador = new Jugador(sc.nextLine());
            jugadores.add(jugador);
        }

        //Da las manos
        for(int i = 0; i < jugadores.size(); i++){
            jugadores.get(i).getMano(mazo.giveMano(5));
            System.out.println(mazo.mazoStatus());
            System.out.println(jugadores.get(i).infoJugador()+"\n");
        }
        
        //Antes de tomar una carta
        System.out.println(mazo.mazoStatus());
        System.out.println(jugadores.get(0).infoJugador()+"\n");
        System.out.println("Elige una carta a descartar: \n");

        //Descarta una carta y la pone en la pila
        mazo.toPila(jugadores.get(0).discardCarta(sc.nextInt()));
        jugadores.get(0).getCarta(mazo.getFromMazo());
        System.out.println(mazo.mazoStatus());
        System.out.println(jugadores.get(0).infoJugador()+"\n");
        
        //Pone las pila en el mazo
        mazo.redoMazo();
        System.out.println(mazo.mazoStatus());
    }
}