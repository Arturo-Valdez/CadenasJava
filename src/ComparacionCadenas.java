public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de cadenas (Pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparacion de cadenas (==) compara la referencia en memoria
        System.out.print("Cadena1 es igual en referencia a cadena2 = ");
        System.out.println(cadena1 == cadena2);
        System.out.print("Cadena1 es igual en referencia a cadena3 = ");
        System.out.println(cadena1 == cadena3);

        System.out.print("Cadena 1 es igual en el contenido a cadena3 = ");
        var comparacion = cadena1.equals(cadena3);
        System.out.println("comparacion = " + comparacion);
    }
}
