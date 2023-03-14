public class TiposVariaveis {
    public static void main(String[] args) {

        //estudar a classe String que representa texto na aplicação.

        String meuNome = "Sara";


        //Tipos Primitivo: int, byte, short, long, float, doule, boolean e char.

        /* PRIMITIVO - WRAPPER CLASS - TAMANHO
            boolean  -  Boolean      -  1 bit
            byte     -  Byte         -  1 byte
            Char     -  Character    -  1 byte
            double   -  Double       -  8 bytes
            float    -  Float        -  4 bytes
            int      -  Integer      -  4 bytes
            long     -  Long         -  8 bytes
            short    -  Short        -  2 bytes
                     -  String       -  1 byte/cada
         */

        // Exemplos:

        double salarioMinimo = 2500.44;

        short numeroCurto = 1;

        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Cast

        int numero = 5;

        final double VALOR_DE_PI = 3.14; // sintaxe de uma Constante

        System.out.println(numero);

    }
}
