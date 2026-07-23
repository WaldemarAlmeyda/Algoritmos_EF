package org.example.pregunta2;

import java.util.Scanner;

public class BusquedaIndices {
    static void main() {
        int[] indices = {

                101,
                310,
                520

        };


        int[][] productos = {

                {101,205},
                {310,450},
                {520}

        };


        Scanner teclado = new Scanner(System.in);


        System.out.print("Codigo a buscar: ");

        int codigo = teclado.nextInt();


        int posicion = -1;


        for(int i = 0; i < indices.length; i++){


            if(codigo >= indices[i]){

                posicion = i;

            }

        }


        boolean encontrado=false;


        if(posicion!=-1){


            for(int producto: productos[posicion]){


                if(producto == codigo){

                    encontrado=true;

                }

            }

        }



        if(encontrado)

            System.out.println("Producto encontrado");

        else

            System.out.println("Producto no encontrado");
    }
}
