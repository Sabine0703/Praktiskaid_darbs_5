package com.company;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        Random rnd = new Random();
        int rndNr = rnd.nextInt(6 - 3 + 1) + 3;
        //System.out.println("Array size is: " + rndNr);

        int[][] array = new int[rndNr][rndNr];

        Scanner scan = new Scanner(System.in);

        System.out.println("Kā aizpildīt masīvu?");
        System.out.println("Manuāli - ievadiet 1");
        System.out.println("Automātiski - ievadiet 2");
        while( !scan.hasNextInt() )
        {
            System.out.println("Ievaidet skaitli 1 vai 2!");
            scan.next();
            continue;
        }

        int option = scan.nextInt();

        switch(option){
            case 1:
                for(int i = 0; i< array.length; i++)
                {
                    for(int j = 0; j < array[i].length; j++)
                    {
                        System.out.println("Ievadīt " + i + " " + j + " elementu:");

                        while(!scan.hasNextInt() )
                        {
                            System.out.println("Ievadiet skaitli robežās no 5 līdz 10");
                            scan.next();
                            continue;
                        }
                        int nextInteger = scan.nextInt();

                        if( nextInteger < 10 && nextInteger > 5 )
                        {
                            array[i][j] = nextInteger;

                        }
                        else
                        {
                            System.out.println("Ievadiet skaitli robežās no 5 līdz 10");
                            j--;
                            continue;
                        }
                    }
                }
                break;
            case 2:
                Random r = new Random();

                for(int i = 0; i< array.length; i++)
                {
                    for(int j = 0; j < array[i].length; j++) {
                        array[i][j] = r.nextInt(100 - 1) + 1;
                    }
                }
                break;
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
        System.out.println("Diagonāles matrice:");

        for( int n = 0; n < array.length; n++)
        {
            for( int k = 0; k < array[n].length; k++)
            {
                if( n != k )
                {
                    array[n][k] = 0;
                }
                System.out.printf("%-8d", array[n][k]);
            }
            System.out.println();
        }

    }
}
