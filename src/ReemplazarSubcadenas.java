public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        
        //Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena1.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //Remplazar "Hola" por "Saludos"
        nuevaCadena = cadena1.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
