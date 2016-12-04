/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1610.myrepository.hometasks.mainconstructions;

import java.util.Random;

/**
 *
 * @author Valery
 */
public class Task5 {
    public static void main(String[] args) {
        Random random =  new Random();
        int[][] array = new int [5][6];
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                array1[j] = random.nextInt(20);
//            System.out.print(array[i][j] + " ");
            }
//            System.out.println("");
        }
//        System.out.println("");
        print(array);
        printStr(array);
        printCol(array);
        printSum(array);
        printCom(array);
    }
    static void print(int arr[][]){
        for (int[] arr1 : arr) { 
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = arr.length-1; i>= 0; i--){
            for(int j = arr[i].length-1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void printStr(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 1){
                for(int j = 0; j < arr[i].length; j++){
                    if(arr[i][j]%2 == 0){
                        System.out.print(arr[i][j] + " ");
                    }
                    else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    
    static void printCol(int arr[][]){
        for (int i = 0; i < arr.length;){
            for (int j = 0; j < arr[i].length; j++) {
                if ((j%2 == 0) && (arr[i][j]% 2 == 1)) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            i++; 
            System.out.println();
        }
        System.out.println();
    }
    
    static void printSum(int arr[][]){
        int sum = 0;
        for(int i = 1; i < arr.length; i += 2){
//            if(i%2 == 1){ 
                for(int j = 0; j < arr[i].length; j++){
                    if(arr[i][j]%7 == 0){
                        sum += arr[i][j];
//                        System.out.print(sum + " ");
                    }
                }
//            }
        }System.out.print(sum + " ");
        System.out.println();
        System.out.println();
    }
    
    static void printCom(int arr[][]){
        int c = 1;
        for(int i = 0; i < arr.length; i += 2){
//            if(i%2 == 0){ 
                for(int j = 0; j < arr[i].length; j++){
                    if(arr[i][j]%3 == 0){
                        c *= arr[i][j];
                    }
                }
//            }
        }System.out.print(c + " ");
        System.out.println("");
    }
}
