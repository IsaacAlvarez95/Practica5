import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Visualizador {
    
    private Posicion p;
    private boolean isVisible;
    private Carta carta;

    public Visualizador(Carta carta, Posicion p){
        this.carta = carta;
        this.p = p;
        makeVisible();
    }

    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this square invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the square to a x position.
     */
    public void setX(int x)
    {
        erase();
        p.x = x;
        draw();
    }

    /**
     * Move the square to a y position.
     */
    public void setY(int y)
    {
        erase();
        p.y = y;
        draw();
    }
    
    /**
     * Move the square a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the square a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the square a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the square a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the square horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        p.x += distance;
        draw();
    }

    /**
     * Move the square vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        p.y += distance;
        draw();
    }

    /**
     * Slowly move the square horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            p.x += delta;
            draw();
        }
    }

    /**
     * Slowly move the square vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            p.y += delta;
            draw();
        }
    }

    /**
     * Draw the square with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, "grey",
                        new Rectangle(p.x,p.y, 60, 100));
            canvas.wait(10);
            switch(carta.getPalo()){
                //CORAZON
                case Carta.Figura.CORAZON:
                    Circle circle;
                    for(int i = 1; i <= carta.getNumero(); i++){
                        circle = new Circle("red");
                        if(carta.getNumero() == 14){
                            circle.moveHorizontal(p.x+18);
                            circle.moveVertical(p.y+38);
                            circle.changeSize(20);
                            break;
                        }else if(i%2 == 1){
                            circle.moveHorizontal(p.x+10);
                        }else{
                            circle.moveHorizontal(p.x+40);
                        }
                        circle.moveVertical(6+((Integer)(i-1)/2)*12);
                    }break;
                //DIAMANTE
                case Carta.Figura.DIAMANTE:
                    Square square;
                    for(int i = 1; i <= carta.getNumero(); i++){
                        square = new Square("blue");
                        if(carta.getNumero() == 14){
                            square.moveHorizontal(p.x+18);
                            square.moveVertical(p.y+38);
                            square.changeSize(20);
                            break;
                        }else if(i%2 == 1){
                            square.moveHorizontal(p.x+10);
                        }else{
                            square.moveHorizontal(p.x+40);
                        }
                        square.moveVertical(6+((Integer)(i-1)/2)*12);
                    }break;
                //TREBOL
                case Carta.Figura.TREBOL:
                    for(int i = 1; i <= carta.getNumero(); i++){
                        circle = new Circle("green");
                        if(carta.getNumero() == 14){
                            circle.moveHorizontal(p.x+18);
                            circle.moveVertical(p.y+38);
                            circle.changeSize(20);
                            break;
                        }else if(i%2 == 1){
                            circle.moveHorizontal(p.x+10);
                        }else{
                            circle.moveHorizontal(p.x+40);
                        }
                        circle.moveVertical(6+((Integer)(i-1)/2)*12);
                    }break;
                //PICA
                case Carta.Figura.PICA:
                    Triangle triangle;
                    for(int i = 1; i <= carta.getNumero(); i++){
                        triangle = new Triangle("black");
                        if(carta.getNumero() == 14){
                            triangle.moveHorizontal(p.x+30);
                            triangle.moveVertical(p.y+38);
                            triangle.changeSize(20, 20);;
                            break;
                        }else if(i%2 == 1){
                            triangle.moveHorizontal(p.x+15);
                        }else{
                            triangle.moveHorizontal(p.x+45);
                        }
                        triangle.moveVertical(6+((Integer)(i-1)/2)*12);
                    }break;
                
            }
        }
    }

    /**
     * Erase the square on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
            Circle circle = new Circle("");
            circle.makeInvisible();
        }
    }

    
}


