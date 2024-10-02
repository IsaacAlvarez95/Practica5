public class Cuadrado extends Square {
    //Constructor que cambia las coordenadas, color y tamaño del cuadrado
    public Cuadrado(String color, int x, int y, int size){
        super(color);
        moveHorizontal(x);
        moveVertical(y);
        changeSize(size);
    }

}