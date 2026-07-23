package org.example.pregunta3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ListaInvertida {
    static void main() {
        HashMap<String, ArrayList<String>> categorias = new HashMap<>();


        categorias.put("Granos",
                       new ArrayList<>(Arrays.asList(
                               "Arroz",
                               "Fideos"
                       )));


        categorias.put("Lacteos",
                       new ArrayList<>(Arrays.asList(
                               "Leche",
                               "Queso"
                       )));



        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese categoria: ");

        String categoria = sc.nextLine();



        if(categorias.containsKey(categoria)){


            System.out.println(
                    "Productos encontrados:"
            );


            for(String producto :
                    categorias.get(categoria)){


                System.out.println(producto);

            }


        }else{


            System.out.println(
                    "Categoria no encontrada"
            );

        }
    }
}
