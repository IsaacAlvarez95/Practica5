import java.util.ArrayList;

public class Diamante {
    ArrayList<Triangulo> triangulos = new ArrayList<>();

    public Diamante(){
    }
    public Diamante(int x, int y){
        generarDiamante(x, y);
    }

    public void generarDiamante(int x ,int y){
        for(Triangulo triangulo : triangulos){
            triangulo.makeInvisible();
        }
        triangulos.clear();
        Triangulo triangulo = new Triangulo("red", x+5, y+10, 10, 10);
        triangulos.add(triangulo);

        triangulo = new Triangulo("red", x+15, y+10, 10, 10);
        triangulos.add(triangulo);
        
        triangulo = new Triangulo("red", x+10, y, 10, 10);
        triangulos.add(triangulo);
    }

    public void borrarDiamante(){
        for(Triangulo triangulo : triangulos){
            triangulo.makeInvisible();
        }
        triangulos.clear();
    }
}
