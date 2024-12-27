public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1+ " "+ cadena2;
        System.out.println("Concatenacion con + = " + cadena3);

        //Metodo concat
        var usarConcat = cadena1.concat(" ").concat(cadena2);
        System.out.println("usarConcat = " + usarConcat);
        
        //StringBuilder
        var constructorCadenas = new StringBuilder();
        //constructorCadenas.append(cadena1);
        //constructorCadenas.append(" ");
        //constructorCadenas.append(cadena2);
        //var resultado = constructorCadenas.toString();

        constructorCadenas.append(cadena1).append(" ").append(cadena2).toString();
        System.out.println("StringBuilder = " + constructorCadenas);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2).toString();
        System.out.println("stringBuffer = " + stringBuffer);

        //Join
        var resultado = String.join(" ", cadena1, cadena2, "Adios");
        System.out.println("Resultado con Join = " + resultado);

    }
}
