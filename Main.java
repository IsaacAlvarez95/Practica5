public class Main {
    public static void main(String[] args) {

        //Carta carta = new Carta(Carta.Figura.CORAZON, 13);
        //Posicion p = new Posicion(0, 0);
        //Visualizador visualizador = new Visualizador(carta, p);
        //carta = new Carta(Carta.Figura.DIAMANTE, 7);
        //p = new Posicion(100, 0);
        //Visualizador visualizador2 = new Visualizador(carta, p);
        //carta = new Carta(Carta.Figura.TREBOL, 14);
        //p = new Posicion(200, 0);
        //Visualizador visualizador3 = new Visualizador(carta, p);
        //carta = new Carta(Carta.Figura.PICA, 3);
        //p = new Posicion(300, 0);
        //Visualizador visualizador4 = new Visualizador(carta, p);

        Cuadrado cuadro = new Cuadrado("red",150,150,10);
        Circulo circulo = new Circulo("yellow",160,180,25);
        Triangulo triangulo = new Triangulo("blue",220,140,25, 70);
        Trebol trebol = new Trebol(200, 250);
        Diamante diamante = new Diamante(240, 250);
        Pica pica = new Pica(280,250);
        Corazon corazon = new Corazon(320, 250);

        Carta carta = new Carta(Carta.Figura.CORAZON, 13);
        Posicion posicion = new Posicion(0,0);
        CartaVisual cartita = new CartaVisual(posicion, carta);
        cartita.drawCarta(posicion);

        carta = new Carta(Carta.Figura.DIAMANTE, 7);
        posicion = new Posicion(100,0);
        CartaVisual cartita2 = new CartaVisual(posicion, carta);
        cartita2.drawCarta(posicion);

        carta = new Carta(Carta.Figura.TREBOL, 14);
        posicion = new Posicion(200,0);
        CartaVisual cartita3 = new CartaVisual(posicion, carta);
        cartita3.drawCarta(posicion);

        carta = new Carta(Carta.Figura.PICA, 3);
        posicion = new Posicion(300,0);
        CartaVisual cartita4 = new CartaVisual(posicion, carta);
        cartita4.drawCarta(posicion);
    }
}
