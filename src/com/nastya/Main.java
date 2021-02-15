package com.nastya;

public class Main {

    public static void main ( String[] args ) throws MyArraySizeException, MyArrayDataException {
    String[][] arr = new String[][]{{"2", "5", "1", "hh"}, {"1", "2", "3", "4"}, {"0", "0", "0", "0"}, {"99", "98", "97", "96"}};
    newArray (arr);
       int sum =newArray (arr) ;
                System.out.println (sum);


    }
    public static   int newArray ( String[][] arr ) throws MyArraySizeException , MyArrayDataException {
        int sum= 0;
        if (arr.length != 4) {
            System.out.println("Неверный размер массива.");
            throw new MyArraySizeException ();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[ i ].length != 4) {
                System.out.println("Неверный размер массива.");
                throw new MyArraySizeException ();
            }
            for (int j = 0; j < arr[ i ].length; j++) {
                try {
                    sum = sum + Integer.parseInt (arr[ i ][ j ]);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка данных в ячейке: [" + i + "].[" + j+"].");
                    throw new MyArrayDataException ();

                }
            }

        }
        return sum;
    }

}