/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.cursojee.taller3;

/**
 *
 * @author DiazOspina
 */
public class Punto1 {

    private char esHexadecimalValido(String numero) {
        String validos = "0123456789ABCDEF";
        for (char c : numero.toCharArray()) {
            if (validos.indexOf(c) == -1) {
                return c;
            }
        }
        return '\0';
    }

    private boolean esHexadecimalValido1(String numero) {
        for (char c : numero.toCharArray()) {
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public Long convertirHexadecimalADecimal(String numero) throws FormatoHexadecimalErroneoException {
        final char caracter = esHexadecimalValido(numero);
        if (caracter != '\0') {
            throw new FormatoHexadecimalErroneoException("El caracter '" + caracter + "' no es válido");
        }

        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Punto1 p = new Punto1();
        try {
            Long convertirHexadecimalADecimal = p.convertirHexadecimalADecimal("AJ");
            System.out.println("El numero hexadecimal es: " + convertirHexadecimalADecimal);
        } catch (FormatoHexadecimalErroneoException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
