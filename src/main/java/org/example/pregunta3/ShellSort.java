package org.example.pregunta3;

public class ShellSort {
    static void main() {
        int[] precios =
                {18,6,15,12,4};



        int salto =
                precios.length/2;



        while(salto>0){


            for(int i=salto;i<precios.length;i++){


                int aux=precios[i];

                int j=i;


                while(j>=salto &&
                        precios[j-salto]>aux){


                    precios[j]=precios[j-salto];

                    j-=salto;

                }


                precios[j]=aux;

            }


            salto/=2;

        }



        for(int precio:precios){

            System.out.println(precio);

        }
    }
}
