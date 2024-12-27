public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres Especiales
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // '\n' -> Salto de linea
        var cadena2 = "Hola \n Mundo";
        System.out.println("cadena2 = " + cadena2);
        
        // '\t' -> Tabulacion
        var cadena3 = "\tHola \tMundo";
        System.out.println("cadena3 = " + cadena3);

        // '\'' -> agregar comilla simple
        var cadena4 = "Hola \'Mundo \'";
        System.out.println("cadena4 = " + cadena4);

        // '\"' -> agregar comilla doble
        var cadena5 = "Hola \"Mundo\"";
        System.out.println("cadena5 = " + cadena5);

        // '\\' -> caracter de diagonal invertirda
        var cadena6 = "Hola  \\Mundo";
        System.out.println("cadena6 = " + cadena6);
    }
}
