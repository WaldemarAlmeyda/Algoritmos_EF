package org.example.pregunta3;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] datos){


        if(datos.length < 2)
            return;



        int mitad =
                datos.length/2;



        int[] izquierda =
                Arrays.copyOfRange(
                        datos,
                        0,
                        mitad
                );


        int[] derecha =
                Arrays.copyOfRange(
                        datos,
                        mitad,
                        datos.length
                );



        mergeSort(izquierda);

        mergeSort(derecha);



        combinar(
                datos,
                izquierda,
                derecha
        );


    }



    public static void combinar(
            int[] datos,
            int[] izquierda,
            int[] derecha){


        int i=0,j=0,k=0;



        while(i<izquierda.length &&
                j<derecha.length){


            if(izquierda[i]
                    < derecha[j]){


                datos[k++]=izquierda[i++];


            }else{


                datos[k++]=derecha[j++];

            }

        }



        while(i<izquierda.length){

            datos[k++]=izquierda[i++];

        }



        while(j<derecha.length){

            datos[k++]=derecha[j++];

        }


    }



    public static void main(String[] args){


        int[] stock =
                {20,15,10,8,30};


        mergeSort(stock);



        for(int s:stock){

            System.out.println(s);

        }


    }
}
