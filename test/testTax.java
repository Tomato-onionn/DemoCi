/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import static lab03.TaxCal.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
public class testTax {

    @Test
    public void UTCID01() {
        assertEquals(13250000, fncPersonalIncomeTax(100000000, 5000000, 2), 0.00001f);
    }

    @Test
    public void UTCID02() {
        assertEquals(-1, fncPersonalIncomeTax(-10, 0, 0), 0.00001f);
    }

    @Test
    public void UTCID03() {
        assertEquals(0, fncPersonalIncomeTax(1, 1, 1), 0.00001f);
    }
    
    @Test
    public void UTCID04() {
        assertEquals(250000, fncPersonalIncomeTax(100000000, 50000000, 9), 0.1f);
    }
    
    @Test
    public void UTCID05() {
        assertEquals(350000, fncPersonalIncomeTax(100000000, 5000000, 20), 0.00001f);
    }
    
    @Test
    public void UTCID06() {
        assertEquals(1200000, fncPersonalIncomeTax(100000000, 50000000, 7), 0.2f);
    }
    
    @Test
    public void UTCID07() {
        assertEquals(4750000, fncPersonalIncomeTax(100000000, 20000000, 9), 0.00001f);
    }

    @Test
    public void UTCID08() {
        assertEquals(9550002, fncPersonalIncomeTax(100000000, 5000000, 0), 0.00001f);
    }

    @Test
    public void UTCID09() {
        assertEquals(-1, fncPersonalIncomeTax(100000000, -10, 2), 0.00001f);
    }
    
    @Test
    public void UTCID010() {
        assertEquals(-1, fncPersonalIncomeTax(100000000, 5000000, -1), 0.00001f);
    }
}
