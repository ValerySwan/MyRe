/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1610.myrepository.hometasks.mainconstructions;

import java.util.Scanner;

/**
 *
 * @author Valery
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while(num > 99 || num < 0){
            System.out.println("Enter your number:");
            num = scanner.nextInt();
            if(num < 0 || num > 99){
                System.out.println("Wrong number, try again");
            }
        }
        switch(num){
            case 11:{
                System.out.println("Одиннадцать");
            }break;
            case 12:{
                System.out.println("Двенадцать");
            }break;
            case 13:{
                System.out.println("Тринадцать");
            }break;
            case 14:{
                System.out.println("Четырнадцать");
            }break;
            case 15:{
                System.out.println("Пятнадцать");
            }break;
            case 16:{
                System.out.println("Шестнадцать");
            }break;
            case 17:{
                System.out.println("Семнадцать");
            }break;
            case 18:{
                System.out.println("Восемнадцать");
            }break;
            case 19:{
                System.out.println("Девятнадцать");
            }break; 
            default:{
                    int a = num/10;    
                    if (a > 0){
                    switch(a){
                        case 1:{
                            System.out.print("Десять ");
                        }break;
                        case 2:{
                            System.out.print("Двадцать ");
                        }break;
                        case 3:{
                            System.out.print("Тридцать ");
                        }break;
                        case 4:{
                            System.out.print("Сорок ");
                        }break;
                        case 5:{
                            System.out.print("Пятьдесят ");
                        }break;
                        case 6:{
                            System.out.print("Шестьдесят ");
                        }break;
                        case 7:{
                            System.out.print("Семьдесят ");
                        }break;
                        case 8:{
                            System.out.print("Восемьдесят ");
                        }break;
                        case 9:{
                            System.out.print("Девяносто ");
                        }break;
                    }
               }
                        int b = num%10;
                        if(b > 0){
                        switch(b){
                        case 0:{
                            System.out.println("Ноль");
                        }break;
                        case 1:{
                            System.out.println("Один");
                        }break;
                        case 2:{
                            System.out.println("Два");
                        }break;
                        case 3:{
                            System.out.println("Три");
                        }break;
                        case 4:{
                            System.out.println("Четыре");
                        }break;
                        case 5:{
                            System.out.println("Пять");
                        }break;
                        case 6:{
                            System.out.println("Шесть");
                        }break;
                        case 7:{
                            System.out.println("Семь");
                        }break;
                        case 8:{
                            System.out.println("Восемь");
                        }break;
                        case 9:{
                            System.out.println("Девять");
                        }break;
                    }        
                } 
            }
        }    
    }
}
