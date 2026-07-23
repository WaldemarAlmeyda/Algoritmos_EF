package org.example.pregunta3;

public class QuickSort {
    static void quickSort(
            int[] datos,
            int inicio,
            int fin){


        if(inicio < fin){


            int pivote =
                    datos[fin];


            int i=inicio-1;


            for(int j=inicio;j<fin;j++){


                if(datos[j]<pivote){


                    i++;


                    int aux=datos[i];

                    datos[i]=datos[j];

                    datos[j]=aux;

                }

            }


            int aux=datos[i+1];

            datos[i+1]=datos[fin];

            datos[fin]=aux;



            quickSort(datos,inicio,i);

            quickSort(datos,i+2,fin);


        }


    }



    public static void main(String[] args){


        int[] codigos =
                {520,101,450,205,310};


        quickSort(
                codigos,
                0,
                codigos.length-1
        );


        for(int c:codigos){

            System.out.println(c);

        }


    }
}
