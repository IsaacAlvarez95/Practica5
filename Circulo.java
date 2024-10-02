public class Circulo extends Circle {
    //Constructor que cambia las coordenadas, color y tamaño del circulo
    public Circulo(String color, int x, int y, int diameter){
        super(color);
        moveHorizontal(x);
        moveVertical(y);
        changeSize(diameter);
    }

}
