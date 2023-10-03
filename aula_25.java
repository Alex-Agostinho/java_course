//entrada de dados parte 1//

/*LER UMA PALAVRA
import java.util.Scanner;

public class aula24 {

    public static void main(String[] args) {   

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();                          <------------ essa declarecao ira ler apenas a primeira pa;avra, para ler a frase, deve-se usar nextLine
        System.out.println("Voce digitou: "+ x);

        sc.close();
    }

}
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/*Ler um numero inteiro nextInt();

import java.util.Scanner;

public class aula25 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        System.out.println("You taped " + x);

        sc.close();
    }
}

*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/*Ler um numero com ponto flutuante (numero real ou double) 

o comando nextDouble();. pega o ponto flutuante do sistema, em ptbr a virgula, em ingles o ponto

para declaram com ponto, importe esse comando antes de executar a declaracao >- Locale.setDefault(Locale.US);

import java.util.Locale;
import java.util.Scanner;

public class aula25 {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("You taped: %.2f%n ", x);

        sc.close();
    }
}

*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/* Esse comando, le apenas a primeira letra digitada 
import java.util.Scanner;

public class aula25 {

    public static void main(String[] args) {   

        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("You taped: " + x);

        sc.close();
    }

    
*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/*PARA LER VARIOS DADOS NA MESMAS LIHA

string x/
int y;
double z;
*/

import java.util.Locale;
import java.util.Scanner;

public class aula_25 {

    public static void main(String[] args) {   

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }

}