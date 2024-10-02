import java.util.*;
public class Trebol {

    ArrayList<Cuadrado> cuadrados = new ArrayList<>();
    
    public Trebol(){
    }
    public Trebol(int x, int y){
        generarTrebol(x, y);
    }

    public void generarTrebol(int x ,int y){
        for(Cuadrado cuadrado : cuadrados){
            cuadrado.makeInvisible();
        }
        cuadrados.clear();
        Cuadrado cuadrado = new Cuadrado("black", x, y+10, 10);
        cuadrados.add(cuadrado);

        cuadrado = new Cuadrado("black", x+10, y+10, 10);
        cuadrados.add(cuadrado);

        cuadrado = new Cuadrado("black", x+5, y, 10);
        cuadrados.add(cuadrado);
    }

    public void borrarTrebol(){
        for(Cuadrado cuadrado : cuadrados){
            cuadrado.makeInvisible();
        }
        cuadrados.clear();
    }

}