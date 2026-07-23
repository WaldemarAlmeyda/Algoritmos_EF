package org.example.pregunta1;

public class Insercion {
    static void main() {
        int[] precios = {18, 8, 6, 15, 4};

        for (int i = 1; i < precios.length; i++) {

            int actual = precios[i];
            int j = i - 1;

            while (j >= 0 && precios[j] > actual) {

                precios[j + 1] = precios[j];
                j--;

            }

            precios[j + 1] = actual;

        }

        for (int precio : precios) {

            System.out.println(precio);

        }
    }
}
