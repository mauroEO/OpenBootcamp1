public class Tarea {


    public static void main(String[] args) {
        int primero = 10;
        int segundo = 20;
        int tercero = 30;

      int resultado =  suma(primero,segundo,tercero);
      System.out.println(resultado);


      Coche coche = new Coche();
      coche.sumaPuerta();
      coche.cantidadPuerta();
    }

    static public int suma(int a, int b, int c){
        return a+b+c;
    }

}
    class Coche{
        int puerta = 0;

        public void sumaPuerta(){
            puerta++;
        }
        public void cantidadPuerta(){
            System. out. println( puerta);
        }
}
