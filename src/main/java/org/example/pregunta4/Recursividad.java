package org.example.pregunta4;

public class Recursividad {
    public static int sumarStock(
            int[] productos,
            int posicion){


        if(posicion == productos.length){

            return 0;

        }


        return productos[posicion]
                + sumarStock(
                productos,
                posicion + 1
        );


    }



    public static void main(String[] args){


        int[] stock = {
                20,
                15,
                10,
                8
        };


        int total =
                sumarStock(stock,0);



        System.out.println(
                "Total productos: "
                        + total
        );


    }

}
