package org.example.pregunta1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MezclaDirecta {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> precios = new ArrayList<>();

        Scanner a = new Scanner(new File("ventas1.txt"));

        while (a.hasNextInt())
            precios.add(a.nextInt());

        Scanner b = new Scanner(new File("ventas2.txt"));

        while (b.hasNextInt())
            precios.add(b.nextInt());

        Collections.sort(precios);

        System.out.println(precios);

    }
}
