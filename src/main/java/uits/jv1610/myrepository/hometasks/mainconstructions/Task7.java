/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1610.myrepository.hometasks.mainconstructions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Valery
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();
        int[][] array = new int [7][9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Введиет число для сдвига: ");
        int k = scanner.nextInt();
        if(k > array.length){
            k = k % array.length;
//            System.out.println(k);
        }
        moveRight(array,k);
        moveLeft(array,k);
        moveUp(array,k);
        moveDown(array,k);
    }
    
    static void moveRight(int[][] arr, int position){
//        for (int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++){
//                int[][] arr1 = new int[arr.length][arr[i].length];
//                System.arraycopy(arr[i], arr.length - position, arr1[i],0, position); 
//                System.arraycopy(arr[i], 0, arr1[i],position, arr.length-position);
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        System.out.println("");
            for (int i = 0; i < arr.length; i++) {
                int[][] arr1 = new int[arr.length][arr[i].length];
                System.arraycopy(arr[i], arr[i].length - position, arr1[i],0, position); 
                System.arraycopy(arr[i], 0, arr1[i],position, arr1[i].length-position);
                for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    static void moveLeft(int[][] arr, int position){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                int[][] arr1 = new int[arr.length][arr[i].length];
                System.arraycopy(arr[i], 0, arr1[i],arr1[i].length-position , position); 
                System.arraycopy(arr[i], position, arr1[i],0,arr1[i].length-position);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    static void moveUp(int[][] arr, int position){
        int[][] arr1 = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            int newLine = i-position;
            if(newLine < 0){
                newLine = arr.length-(-newLine);  
            }
            System.arraycopy(arr[i], 0, arr1[newLine], 0, arr1[i].length);
        }
    
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j< arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");   
    }    
    
    static void moveDown(int[][] arr, int position){
        int[][] arr1 = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            int newLine = i + position;
            if(newLine >= arr.length){
                newLine = newLine-arr.length;  
            }
            System.arraycopy(arr[i], 0, arr1[newLine], 0, arr1[i].length);
        }
    
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j< arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(""); 
    }
}

