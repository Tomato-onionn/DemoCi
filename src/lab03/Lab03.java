/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Scanner;
import static lab03.TaxCal.fncPersonalIncomeTax;

/**
 *
 * @author Admin
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        float salary = scanner.nextFloat();

        System.out.print("Enter tax-exempt amount: ");
        float taxExempt = scanner.nextFloat();

        System.out.print("Enter number of dependents: ");
        int dependents = scanner.nextInt();

        float tax = fncPersonalIncomeTax(salary, taxExempt, dependents);
        System.out.printf("Personal Income Tax: %.2f\n", tax);

        scanner.close();
    }
    
}
