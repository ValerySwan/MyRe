/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1610.myrepository.hometasks.mainconstructions;

/**
 *
 * @author Valery
 */
public class Task6 {
    public static void main(String[] args) {
        int[][] array = new int[5][];
        array[0] = new int [1];
        array[1] = new int [2];
        array[2] = new int [3];
        array[3] = new int [4];
        array[4] = new int [5];
        
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + " ");
            }
            System.out.println("");
        }
        printG(array);
        printV(array);
        printE(array);
    }
    static void printG(int arr[][]){
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = arr[i].length-1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    static void printV(int arr[][]){
//        int max = arr[arr.length -1].length;
//        for(int i = 0; i < arr.length; i++){
//            for(int t = 0; t < max - arr[i].length; t++){
//                System.out.print("  ");
//            }
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//                System.out.println("");    
//            } 
//            System.out.println("");

           int max = 0;
           for(int i =0; i < arr.length; i++)
           {
               if(arr[i].length > max)
               {
                   max = arr[i].length;
               }
           }
           
           for(int i =0; i < arr.length; i++)
           {
               int n = 0;
               for(int j = 0; j < max; j++)
               {
                   if(j < max - arr[i].length)
                   {
                       System.out.print("  ");
                   }
                   else
                   {
                       System.out.print(arr[i][n] + " ");
                       n++;
                   }
               }
               System.out.println("");
            }
        }
        
    static void printE(int arr[][]){
        int max = 0;
           for(int i = 0; i < arr.length; i++)
           {
               if(arr[i].length > max)
               {
                   max = arr[i].length;
               }
           }
        for(int i = arr.length-1; i >= 0; i--){
            for(int t = 0; t < max - arr[i].length;  t++){
                System.out.print("  ");
            }
            for(int j = arr[i].length - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
                System.out.println("");    
            } 
            System.out.println("");
    }
}    
