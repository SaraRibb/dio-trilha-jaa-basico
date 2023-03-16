public class Operadores {

    public static void main(String[] args) {

        //Operadores Aritméticos

        double soma = 10.5 + 15.7;
        int subtracao = 15 - 4;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double precedencia = (10 * 7) + (20 / 4);

        System.out.println("Operador aritméticos resultado : " + soma);

        // Operadores Unário

        int numero = 5;
        numero = - numero; // Tornando o numero ''5'' em ''-5''( número negativo).

        System.out.println("Impressão do numero negativo:" + numero);

        numero = numero * -1; //essa é a forma de tornar o valor positivo.

        System.out.println("operador Unário: " + numero);

        //Operador Ternário

        int a = 5;
        int b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println("Operador Ternário: " + resultado);

        //Operadores Relacionais

        String nomeUm = "Sara";
        String nomeDois = new String("Sara");

        System.out.println("Operador relacional: " + nomeUm.equals(nomeDois)); //O método 'equals' compara se o contéudo
        // de dois objetos são iguais.

        //Operadores Lógicos

        // && operador lógico "E"
        // || operador lógico "OU"
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && ( 7 > 4)){
            System.out.println("As duas condições são verdadeiras.");
        }
        if ( condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }

    }
}
