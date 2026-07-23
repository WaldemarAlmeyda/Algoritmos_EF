package org.example.pregunta3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Multilistas {
    static void main() {
        HashMap<String, List<String>> productos =
                new HashMap<>();


        productos.put("Arroz",
                      Arrays.asList(
                              "Granos",
                              "Canasta Basica"
                      ));


        productos.put("Leche",
                      Arrays.asList(
                              "Lacteos",
                              "Refrigerados"
                      ));



        for(String producto :
                productos.keySet()){


            System.out.println(
                    producto + " pertenece a:"
            );


            for(String categoria :
                    productos.get(producto)){


                System.out.println(
                        "- " + categoria
                );


            }


        }
    }
}
