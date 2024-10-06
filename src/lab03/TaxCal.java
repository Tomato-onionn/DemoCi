/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Admin
 */
public class TaxCal {
    public static float fncPersonalIncomeTax(float sal, float te, int nod) {
        if (sal < 0 || te < 0 || nod < 0) {
            return -1;
        }

        float ti = sal + te + 9000000 - nod * 4000000;

        if (ti <= 0) {
            return 0;
        }

        if (ti <= 5000000) {
            return 0.05f * ti;
        } else if (ti <= 10000000) {
            return 0.1f * ti - 250000;
        } else if (ti <= 20000000) {
            return 0.15f * ti - 750000;
        } else if (ti <= 40000000) {
            return 0.2f * ti - 2250000;
        } else if (ti <= 80000000) {
            return 0.25f * ti - 6250000;
        } else {
            return 0.3f * ti - 16250000;
        }
    }
    /**
     * @param args the command line arguments
     */
   
}
