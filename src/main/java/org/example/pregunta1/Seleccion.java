package org.example.pregunta1;

public class Seleccion {
    static void main() {
        int[] precios = {18, 8, 6, 15, 4};

        for (int i = 0; i < precios.length - 1; i++) {

            int menor = i;

            for (int j = i + 1; j < precios.length; j++) {

                if (precios[j] < precios[menor]) {
                    menor = j;
                }

            }

            int aux = precios[i];
            precios[i] = precios[menor];
            precios[menor] = aux;
        }

        System.out.println("Precios ordenados:");

        for (int precio : precios) {
            System.out.println(precio);
        }
    }
}
