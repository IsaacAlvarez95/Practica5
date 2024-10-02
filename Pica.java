import java.util.ArrayList;

public class Pica {
    ArrayList<Triangulo> triangulos = new ArrayList<>();

    public Pica(){
    }
    public Pica(int x, int y){
        generarPica(x, y);
    }

    public void generarPica(int x ,int y){
        for(Triangulo triangulo : triangulos){
            triangulo.makeInvisible();
        }
        triangulos.clear();
        Triangulo triangulo = new Triangulo("black", x+5, y+10, 10, 10);
        triangulos.add(triangulo);

        triangulo = new Triangulo("black", x+15, y+10, 10, 10);
        triangulos.add(triangulo);
        
        triangulo = new Triangulo("black", x+10, y, 10, 10);
        triangulos.add(triangulo);
    }

    public void borrarPica(){
        for(Triangulo triangulo : triangulos){
            triangulo.makeInvisible();
        }
        triangulos.clear();
    }
}
