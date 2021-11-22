package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray2D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ievadiet masīva rindu skaitu robežās no 5-15: ");

        while (!scan.hasNextInt()) {
            System.out.println("1 Ievaidet veselu skaitli no 5 līdz 15!");
            scan.next();
            continue;
        }

        int rowCnt = scan.nextInt();

        while ( 15 < rowCnt || 5 > rowCnt ) {
            System.out.println("2 Ievaidet veselu skaitli no 5 līdz 15!");
            rowCnt = scan.nextInt();
            continue;
        }

        Random rnd = new Random();
        int colCnt = rnd.nextInt(15 - 4) + 4;

        int[][] array = new int[rowCnt][colCnt];

        // fill array values
        Random rnd2 = new Random();

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                array[i][j] = rnd2.nextInt(999 - 100 ) + 100;
            }
        }

        // Output result
        for( int i = 0; i < array.length; i++)
        {
            for( int j = 0; j < array[i].length; j++)
            {
                System.out.printf("%-8d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println();
        System.out.println("Masīva rindu vērtības sakārtotas dilstošā secībā:");

        // Output result where each row sorted desc
        for( int i = 0; i < array.length; i++)
        {
            for( int j = 0; j < array[i].length; j++)
            {
                for( int n = j + 1; n < array[i].length; n++) {
                    if(array[i][j] < array[i][n]) {
                        int tmp = array[i][j];
                        array[i][j] = array[i][n];
                        array[i][n] = tmp;
                    }
                }

                System.out.printf("%-8d", array[i][j]);
            }
            System.out.println();
        }

        //swap first and last rows
        int[] firstRow = array[0];
        int[] lastRow = array[array.length - 1];
        array[0] = lastRow;
        array[array.length - 1] = firstRow;

        System.out.println();
        System.out.println("Pirmā un pēdējā rindas samainītas vietām:");

         //Output swapped array rows result
        for( int i = 0; i < array.length; i++)
        {
            for( int j = 0; j < array[i].length; j++)
            {
                System.out.printf("%-8d", array[i][j]);
            }
            System.out.println();
        }
    }
}
