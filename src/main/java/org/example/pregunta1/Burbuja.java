package org.example.pregunta1;

public class Burbuja {
    static void main() {
        int[] precios = {18, 8, 6, 15, 4};

        for (int i = 0; i < precios.length - 1; i++) {

            for (int j = 0; j < precios.length - i - 1; j++) {

                if (precios[j] > precios[j + 1]) {

                    int aux = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = aux;

                }

            }

        }

        for (int precio : precios) {

            System.out.println(precio);

        }
    }
}
