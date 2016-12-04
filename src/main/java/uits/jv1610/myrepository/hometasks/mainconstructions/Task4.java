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
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        print(array);
        printDel(array);
        printSum(array);
        printCom(array);
    }
    static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void printDel(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.print(arr[i] + " ");
            }  
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 1){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    static void printSum(int arr[]){
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            if((arr[i]%7) == 0){
                x += arr[i];
            }
        }
        System.out.println(x);
    }
    static void printCom(int arr[]){
        int c = 1;
        for(int i = 0; i < arr.length; i++){
            if((arr[i]%3) == 0){
                c *= arr[i];
            }
        }
        System.out.println(c);
    }
}
