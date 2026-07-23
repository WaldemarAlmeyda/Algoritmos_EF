package org.example.pregunta4;

import java.util.Scanner;

public class BusquedaLineal {
    public static void main(String[] args) {


        int[] productos = {
                101,
                205,
                310,
                450,
                520
        };


        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese codigo del producto: ");

        int codigo = sc.nextInt();


        boolean encontrado = false;


        for(int i = 0; i < productos.length; i++){


            if(productos[i] == codigo){

                encontrado = true;

                break;

            }

        }


        if(encontrado)

            System.out.println("Producto encontrado");

        else

            System.out.println("Producto no encontrado");


    }
}
