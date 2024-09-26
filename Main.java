public class Main {
    public static void main(String[] args) {

        Carta carta = new Carta(Carta.Figura.CORAZON, 13);
        Posicion p = new Posicion(0, 0);
        Visualizador visualizador = new Visualizador(carta, p);
        carta = new Carta(Carta.Figura.DIAMANTE, 7);
        p = new Posicion(100, 0);
        Visualizador visualizador2 = new Visualizador(carta, p);
        carta = new Carta(Carta.Figura.TREBOL, 14);
        p = new Posicion(200, 0);
        Visualizador visualizador3 = new Visualizador(carta, p);
        carta = new Carta(Carta.Figura.PICA, 3);
        p = new Posicion(300, 0);
        Visualizador visualizador4 = new Visualizador(carta, p);
    }
}
