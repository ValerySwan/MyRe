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
public class Task1 {
    public static void main(String[] args) {
        int sum2 = 0;
        for(int i = 0; i <= 100;)
        {
            if((i%2 == 0)){
                sum2 +=  i;
                System.out.print(i + " ");
            }
            i++;
        }System.out.println(); 
        System.out.println("Сумма чисел кратных двум равна " + sum2);
        int sum3 = 0;
        for(int j = 0; j <= 100;)
        {
            if((j%3 == 0)){
                sum3 +=  j;
                System.out.print(j + " ");
            }
            j++;
        }System.out.println(); 
        System.out.println("Сумма чисел кратных трем равна " + sum3);
        int sum5 = 0;
        for(int t = 0; t <= 100;)
        {
            if((t%5 == 0)){
                sum5 +=  t;
                System.out.print(t + " ");
            }
            t++;
        }System.out.println(); 
        System.out.println("Сумма чисел кратных пяти равна " + sum5);
        int sum7 = 0;
        for(int h = 0; h <= 100;)
        {
            if((h%7 == 0)){
                sum7 +=  h;
                System.out.print(h + " ");
            }
            h++;
        }System.out.println(); 
        System.out.println("Сумма чисел кратных семи равна " + sum7);
        int dif;
        System.out.println("Разность сумм чисел кратных семи и двум равна " + (dif = sum7 - sum2));
        double del = (double)(sum5)/sum3;
        System.out.printf("Отношение сумм чисел кратных пяти и семи равна " + "%.4f", del);
    }
}
