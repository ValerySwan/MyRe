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
public class App2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double p = 3.14;
       double R = 0;
       double r = 0;
       
       int at = 0;
       int bt = 0;
       int ct = 0;
       
       int ar = 0;
       int br = 0;
         
        System.out.println("Рассчитаем площадь кольца, длину и площадь окружности");
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
            System.out.println("Введите внутренний радиус кольца: ");
            r = scanner.nextDouble();
            if((r >= R) || (r <= 0))
            {
                System.out.println("Введено неверное число: r < R, r > 0");
            }      
        }
        
        //площадь окружности расчитывается по формуле S = π*R^2
        double area1 = p*Math.pow(R,2);
        //длина окружности расчитывается по формуле L = 2*π*R
        double longitude = 2*p*R; 
        //площадь кольца расчитывается по формуле S = π*(R^2 - r^2)
        double area2 = p*(Math.pow(R,2) - Math.pow(r,2));
         System.out.println("Площадь окружности равна " + area1);
         System.out.println("Длина окружности равна " +  longitude); 
         System.out.println("Площадь кольца равна " + area2);
         
         System.out.println("Рассчитаем периметр и площадь треугольника");
        while((at <= 0)||(bt <= 0)||(ct <= 0))
        {
            System.out.println("Введите стороны треугольника");
            at = scanner.nextInt();
            bt = scanner.nextInt();
            ct = scanner.nextInt();
            if((at <= 0)||(bt <= 0)||(ct <= 0))
            {
               System.out.println("Введено неверное число: a,b,c > 0"); 
            }
        }
        
        int Pt = at + bt + ct;
        double St = Pt/2*r;
        System.out.println("Периметр треугольника равен " + Pt);
        System.out.println("Площадь треугольника равна" + St);
        
        System.out.println("Рассчитаем периметр и площадь прямоугольника");
        while((ar <= 0)||(br <= 0))
        {
            System.out.println("Введите стороны прямоугольника");
            ar = scanner.nextInt();
            br = scanner.nextInt();
            if((at <= 0)||(bt <= 0))
            {
               System.out.println("Введено неверное число: a,b > 0"); 
            }
        }
        
        int Pr = (ar + br)* 2;
        int Sr = ar*br;
        System.out.println("Периметр прямоугольника равен " + Pr);
        System.out.println("Площадь прямоугольника равна " + Sr);
    }
}
