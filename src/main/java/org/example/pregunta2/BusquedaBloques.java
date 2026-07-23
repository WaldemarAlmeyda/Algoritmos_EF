package org.example.pregunta2;

import java.util.Scanner;

public class BusquedaBloques {
    static void main() {
        int[][] bloques = {

                {101,205},
                {310,450},
                {520}

        };


        Scanner teclado = new Scanner(System.in);


        System.out.print("Ingrese codigo del producto: ");
        int codigo = teclado.nextInt();


        boolean encontrado = false;


        for(int i = 0; i < bloques.length; i++){


            System.out.println("Buscando en bloque " + (i+1));


            for(int j = 0; j < bloques[i].length; j++){


                if(bloques[i][j] == codigo){

                    encontrado = true;

                    break;

                }

            }


            if(encontrado)
                break;

        }


        if(encontrado)
            System.out.println("Producto encontrado");

        else
            System.out.println("Producto no existe");
    }
}
