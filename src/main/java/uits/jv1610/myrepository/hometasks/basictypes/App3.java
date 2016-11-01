/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1610.myrepository.hometasks.basictypes;

import java.util.Scanner;

/**
 *
 * @author Valery
 */
public class App3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double p = 3.14;
       double R = 0;
       double r = 0;
       double h = 0;
       
       int D = 0;
       
       int apar = 0;
       int bpar = 0;
       int cpar = 0;
       
       int atetr = 0;
       int x = 3;
       int x1 = 2;
         
        System.out.println("Рассчитаем площадь боковой поверхности цилиндра, объем цилиндра и полого цилиндра");
       while (R <= 0)
       {
            System.out.println("Введите радиус: ");
            R = scanner.nextDouble(); 
            if(R <= 0)
            {
               System.out.println("Введено неверное число: R > 0");
            }
        }
        
        while((R <= r) || (r <= 0)) 
        { 
            System.out.println("Введите внутренний радиус: ");
            r = scanner.nextDouble();
            if((r >= R) || (r <= 0))
            {
                System.out.println("Введено неверное число: r < R, r > 0");
            }      
        }
        
        while (h <= 0)
        {
            System.out.println("Введите высоту: ");
            h = scanner.nextDouble(); 
            if(h <= 0)
            {
               System.out.println("Введено неверное число: R > 0");
            }
        }
        double voldrum = p*Math.pow(R,2)*h;
        double sdrum = 2*p*R*h; 
        double vol2drum = h*p*(Math.pow(R,2) - Math.pow(r,2));
         System.out.println("Объем цилиндра " + voldrum);
         System.out.println("Объем полого цилиндра равен " +  vol2drum); 
         System.out.println("Площадь боковой поверхности равна " + sdrum);
         
         System.out.println("Рассчитаем объем и площадь поверхности шара");
        while (D <= 0)
        {
            System.out.println("Введите диаметр: ");
            D = scanner.nextInt(); 
            if(D <= 0)
            {
               System.out.println("Введено неверное число: D > 0");
            }
        }
        double volball = p*(Math.pow(D,3))/6;
        double sball = p*Math.pow(D,2);
        System.out.println("Объем шара равен " + volball);
        System.out.println("Площадь поверхности шара равна " + sball);
         
        System.out.println("Рассчитаем объем и площадь поверхности пряумоугольного параллелепипеда"); 
        while((apar <= 0)||(bpar <= 0)||(cpar <= 0))
        {
            System.out.println("Введите стороны и высоту пряумоугольного параллелепипеда");
            apar = scanner.nextInt();
            bpar = scanner.nextInt();
            cpar = scanner.nextInt();
            if((apar <= 0)||(bpar <= 0)||(cpar <= 0))
            {
               System.out.println("Введено неверное число: a,b,c > 0"); 
            }
        }
        
        int volpar = apar*bpar*cpar;
        int spar = 2*(apar*bpar + bpar*cpar + apar*cpar);
        System.out.println("Объем пряумоугольного параллелепипеда " + volpar);
        System.out.println("Площадь пряумоугольного параллелепипеда" + spar);
        
        System.out.println("Рассчитаем объем и площадь поверхности тетраэдра");
        while (atetr <= 0)
        {
            System.out.println("Введите сторону основания: ");
            atetr = scanner.nextInt(); 
            if(atetr <= 0)
            {
               System.out.println("Введено неверное число: а > 0");
            }
        }
        
        double voltetr = (Math.pow(atetr,3)*Math.sqrt(x1))/12;
        double stetr = Math.pow(atetr,2)*Math.sqrt(x);
        System.out.println("Объем тетраэдра равен " + voltetr);
        System.out.println("Площадь тетраэдра равна " + stetr);
    }
}
