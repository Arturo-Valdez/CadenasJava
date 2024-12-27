import java.util.Scanner;

public class EjercicioGeneradorEmail {
    public static void main(String[] args) {
        //Generador de Email

        Scanner consola = new Scanner(System.in);
        System.out.println("*** Generador de Email ***");

        var menu = """
                1.Metodo con todos los nombres y apellidos
                2.Metodo simplificado
                """;

        System.out.println(menu);
        System.out.print("Dame tu metodo: ");
        var respuesta = Integer.parseInt(consola.nextLine());

        if(respuesta == 1) {

            System.out.print("Dame tu nombre completo: ");
            var nombre = consola.nextLine();
            System.out.print("Dame el nombre de empresa: ");
            var nombreEmpresa = consola.nextLine();
            System.out.print("Dame tu nombre de dominio: ");
            var nombreDominio = consola.nextLine();

            System.out.println("\n");

            var nombreNormalizado = nombre.toLowerCase().strip().replace(" ", ".");
            var nombreEmprezaNormalizado = nombreEmpresa.toLowerCase().strip().replace(" ", "");
            System.out.println("Nombre: " + nombre);
            System.out.println("Nombre empresa: " + nombreEmpresa);
            System.out.println("Nombre dominio: " + nombreDominio);

            System.out.println("\n");

            var emaiGenerado = new StringBuffer();
            emaiGenerado.append(nombreNormalizado).append("@").append(nombreEmprezaNormalizado).append(nombreDominio).toString();
            System.out.println("Emai Generado = " + emaiGenerado);


        } else if (respuesta == 2) {
            System.out.print("Dame tus nombres: ");
            var nombres = consola.nextLine();
            System.out.print("Dame tu apellido paterno: ");
            var apellido = consola.nextLine();
            System.out.print("Dame el nombre de empresa: ");
            var nombreEmpresa = consola.nextLine();
            System.out.print("Dame tu nombre de dominio: ");
            var nombreDominio = consola.nextLine();

            System.out.println("\n");

            var nombreNormalizado = nombres.toLowerCase().strip().replace(" ", "").charAt(0);
            var apellidoNormalizado = apellido.toLowerCase().toLowerCase().replace(" ", "");
            var nombreEmprezaNormalizado = nombreEmpresa.toLowerCase().strip().replace(" ", "");
            System.out.println("Nombre: " + nombres);
            System.out.println("Nombre empresa: " + nombreEmpresa);
            System.out.println("Nombre dominio: " + nombreDominio);

            System.out.println("\n");

            var emaiGenerado = new StringBuffer();
            emaiGenerado.append(nombreNormalizado).append(apellidoNormalizado).append("@").append(nombreEmprezaNormalizado).append(nombreDominio).toString();
            System.out.println("Emai Generado = " + emaiGenerado);
        }


    }
}
