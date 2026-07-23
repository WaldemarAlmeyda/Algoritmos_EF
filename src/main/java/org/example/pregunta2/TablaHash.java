package org.example.pregunta2;

import java.util.Hashtable;
import java.util.Scanner;

public class TablaHash {
    static void main() {
        Hashtable<Integer,String> inventario =
                new Hashtable<>();


        inventario.put(101,"Arroz");
        inventario.put(205,"Leche");
        inventario.put(310,"Aceite");
        inventario.put(450,"Azucar");
        inventario.put(520,"Fideos");


        Scanner teclado = new Scanner(System.in);


        System.out.print("Ingrese codigo del producto: ");

        int codigo = teclado.nextInt();



        if(inventario.containsKey(codigo)){


            System.out.println(
                    "Producto encontrado: "
                            + inventario.get(codigo)
            );


        }else{


            System.out.println(
                    "Producto no encontrado"
            );

        }
    }
}
