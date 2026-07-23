package org.example.pregunta4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GrafosDirigidos {
    public static void main(String[] args){


        HashMap<String, List<String>> rutas =
                new HashMap<>();



        rutas.put(
                "Almacen",
                Arrays.asList(
                        "Tienda Centro",
                        "Tienda Norte"
                )
        );



        rutas.put(
                "Tienda Centro",
                Arrays.asList(
                        "Cliente"
                )
        );


        rutas.put(
                "Tienda Norte",
                Arrays.asList(
                        "Cliente"
                )
        );



        for(String origen :
                rutas.keySet()){


            System.out.println(
                    origen + " dirige hacia:"
            );


            for(String destino :
                    rutas.get(origen)){


                System.out.println(
                        " -> " + destino
                );


            }


        }


    }

}
