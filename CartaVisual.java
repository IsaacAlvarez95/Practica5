import java.awt.*;
import java.util.*;

public class CartaVisual {
    Posicion p;
    Carta carta;
    ArrayList<Circulo> numero = new ArrayList<>();
    Pica pica = new Pica();
    Trebol trebol = new Trebol();
    Corazon corazon = new Corazon();
    Diamante diamante = new Diamante();
    public CartaVisual(Posicion posicion, Carta carta){
        this.carta = carta;
        this.p = posicion;
    }

    public void drawCarta(Posicion posicion){
        this.p = posicion;
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
        canvas = Canvas.getCanvas();
            canvas.draw(this, "grey",
                        new Rectangle(p.x, p.y, 60, 100));
            canvas.wait(0);
        pica.borrarPica();
        trebol.borrarTrebol();
        corazon.borrarCorazon();
        diamante.borrarDiamante();
        switch(carta.getPalo()){
            case Carta.Figura.TREBOL:
                trebol.generarTrebol(p.x+2, p.y+2);
                break;
            case Carta.Figura.DIAMANTE:
                diamante.generarDiamante(p.x+2, p.y+2);
                break;
            case Carta.Figura.PICA:
                pica.generarPica(p.x+2, p.y+2);
                break;
            case Carta.Figura.CORAZON:
                corazon.generarCorazon(p.x+2, p.y+2);
                break;
        }
        for(Circulo circulo : numero){
            circulo.makeInvisible();
        }
        numero.clear();
        Circulo circulo;
        for(int i = 1; i <= carta.getNumero(); i++){
            if(i%2 == 1){
                circulo = new Circulo("black", p.x + 18, 24 + ((Integer)(i-1)/2)*10, 10);
            }else{
                circulo = new Circulo("black", p.x + 36, 24 + ((Integer)(i-1)/2)*10, 10);
            }
             
        }
    }

    public void eraseCarta(){
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
        pica.borrarPica();
        trebol.borrarTrebol();
        corazon.borrarCorazon();
        diamante.borrarDiamante();
        for(Circulo circulo : numero){
            circulo.makeInvisible();
        }
        numero.clear();
    }
}
