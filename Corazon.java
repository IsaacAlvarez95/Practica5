import java.util.*;
public class Corazon {

    ArrayList<Cuadrado> cuadrados = new ArrayList<>();

    public Corazon(){
    }
    public Corazon(int x, int y){
        generarCorazon(x, y);
    }

    public void generarCorazon(int x ,int y){
        for(Cuadrado cuadrado : cuadrados){
            cuadrado.makeInvisible();
        }
        cuadrados.clear();
        Cuadrado cuadrado = new Cuadrado("red", x, y+10, 10);
        cuadrados.add(cuadrado);

        cuadrado = new Cuadrado("red", x+10, y+10, 10);
        cuadrados.add(cuadrado);

        cuadrado = new Cuadrado("red", x+5, y, 10);
        cuadrados.add(cuadrado);
    }

    public void borrarCorazon(){
        for(Cuadrado cuadrado : cuadrados){
            cuadrado.makeInvisible();
        }
        cuadrados.clear();
    }

}