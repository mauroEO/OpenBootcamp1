public class Tarea {


    public static void main(String[] args) {
        int firstN = 10;
        int secondN = 20;
        int thirdN = 30;

        int result = suma(firstN, secondN, thirdN);
        System.out.println(result);


        Coche coche = new Coche();
        coche.addPuerta();
        coche.cantidadPuerta();
    }

    static public int suma(int firstValue, int secondValue, int thirdValue) {
        return firstValue + secondValue + thirdValue;
    }

}

class Coche {
    private int puerta = 0;
    public void addPuerta() {
        puerta++;
    }
    public void cantidadPuerta() {
        System.out.println("cantidad de puertas: " + puerta);
    }
}
