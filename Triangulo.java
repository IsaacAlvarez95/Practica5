public class Triangulo extends Triangle {
    
    public Triangulo(String color, int x, int y, int altura, int base){
        super(color);
        moveHorizontal(x);
        moveVertical(y);
        changeSize(altura,base);
    }
}
