/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20zadanie3;

import java.util.Scanner;

/**
 *
 * @author ArTIK
 */
public class SPTV20Zadanie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите имя человека: ");
        String name = scanner.nextLine();
        
        System.out.println("Введите фамилию человека: ");
        String surname = scanner.nextLine();
        
        System.out.println("Введите день рождения: ");
        int daybirth = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Введите месяц рождения (в словах): ");
        String month = scanner.nextLine();
        
        System.out.println("Введите год рождения: ");
        int year = scanner.nextInt();
        
        System.out.println(name + " " + surname + " Родился " + daybirth + " " + month + " в " + year + " Году");
    }
    
}
