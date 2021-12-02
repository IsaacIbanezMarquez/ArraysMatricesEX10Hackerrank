

import java.io.*;
import java.util.*;


// Pangrama_:

/* Un Pangrama és un text que utilitza totes les lletres de l'alfabet. Aquí en teniu més informació: Pangrama

Donat un text, dir si utilitza totes les lletres de l'alfabet.

Alfabet:

abcdefghijklmnopqrstuvwxyz
Input Format

Text d'entrada fins a final de línia.

Constraints

No n'hi ha.

Output Format

{TRUE | FALSE}

Sample Input 0

Aixo no es un Pangrama
Sample Output 0

FALSE
Sample Input 1

The quick brown fox jumps over the lazy dog
Sample Output 1

TRUE

 */




public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;
        char [] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


        boolean [] contador = new boolean [alfabeto.length];

        frase =sc.nextLine();
        frase = frase.toLowerCase();

        for ( int j = 0; j < frase.length(); j++)
        {
            char c = frase.charAt(j);
            boolean caracterEncontrado = false;
            for (int i = 0; i < alfabeto.length && !caracterEncontrado; i++)
            {
                if (alfabeto[i] == c)
                {
                    contador[i] = true;
                    caracterEncontrado = true;
                }
            }
        }

        boolean todoTrue = true;
        for (int i=0; i <contador.length && todoTrue;i++)
        {
            if(contador[i] == false)
            {
                todoTrue = false;
            }
        }
        if (todoTrue)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
}
