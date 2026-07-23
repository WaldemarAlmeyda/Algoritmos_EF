package org.example.pregunta4;

public class Backtracking {
    static int[] precios = {
            5,
            3,
            2
    };


    static boolean buscar(
            int posicion,
            int suma){



        if(suma == 10){

            return true;

        }



        if(posicion == precios.length
                || suma > 10){

            return false;

        }



        // Elegir producto

        if(buscar(
                posicion + 1,
                suma + precios[posicion]
        )){

            return true;

        }



        // No elegir producto

        return buscar(
                posicion + 1,
                suma
        );


    }



    public static void main(String[] args){


        if(buscar(0,0))

            System.out.println(
                    "Combinacion encontrada"
            );

        else

            System.out.println(
                    "No existe combinacion"
            );


    }
}
