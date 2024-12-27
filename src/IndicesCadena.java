public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de indices en una cadena
        var cadena1 = "Hola mundo";


        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        //Recuperar el ultimo caracter (en posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        //Recuperar el valor "M" del string siendo posicion 5
        var caracterM = cadena1.charAt(5);
        System.out.println("caracterM = " + caracterM);

        //Interar e imprimir los valores del string
        for(int i = 0; i<cadena1.length(); i++){
            var caracteres = cadena1.charAt(i);
            System.out.println("caracteres = " + caracteres);
        }
    
    }
    
}
