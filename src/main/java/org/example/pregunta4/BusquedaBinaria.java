package org.example.pregunta4;

import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {


        int[] productos = {
                101,
                205,
                310,
                450,
                520
        };


        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese codigo: ");

        int codigo = sc.nextInt();



        int inicio = 0;

        int fin = productos.length - 1;


        boolean encontrado=false;



        while(inicio <= fin){


            int medio =
                    (inicio + fin) / 2;



            if(productos[medio] == codigo){

                encontrado=true;

                break;

            }


            if(codigo < productos[medio]){

                fin = medio - 1;

            }

            else{

                inicio = medio + 1;

            }


        }



        if(encontrado)

            System.out.println("Producto encontrado");

        else

            System.out.println("Producto no encontrado");


    }
}
