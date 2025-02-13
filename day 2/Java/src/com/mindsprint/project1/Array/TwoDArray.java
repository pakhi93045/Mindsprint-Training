package com.mindsprint.project1.Array;

public class TwoDArray {
    public static void main(String[] args) {
       // int[][] arr = new int[3][];

        int[][] array = {{1,2,3},{4,5,6}};
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){ //index of internal array is given
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Access using for Each");
        for(int[] a: array){
            for(int num:a){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }
}
