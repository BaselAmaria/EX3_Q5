package Question_5.EX3_Question_5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Question_5.EX3_Question_5.statusClass.Status;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void test_A() {
    	boolean result = true;
    	statusClass.Status st = Status.gold;
    	double c = 3000.00;
    	int ct = 200;
    	assertEquals(true, App.checkOut(c, ct, st));
    }
    
    @Test
    public void test_B() {
    	boolean result = true;
    	statusClass.Status st = Status.gold;
    	double c = 5000.00;
    	int ct = 900;
    	assertEquals(true, App.checkOut(c, ct, st));
    }
    
    @Test
    public void test_C() {
    	boolean result = true;
    	statusClass.Status st = Status.gold;
    	double c = 5533.00;
    	int ct = 350;
    	assertEquals(false, App.checkOut(c, ct, st));
    }
    
    @Test
    public void test_D() {
    	boolean result = true;
    	statusClass.Status st = Status.silver;
    	double c = 1500.00;
    	int ct = 355;
    	assertEquals(true, App.checkOut(c, ct, st));
    }
    
    @Test
    public void test_E() {
    	boolean result = true;
    	statusClass.Status st = Status.silver;
    	double c = 3200.00;
    	int ct = 1000;
    	assertEquals(true, App.checkOut(c, ct, st));
    }
    
    @Test
    public void test_F() {
    	boolean result = true;
    	statusClass.Status st = Status.silver;
    	double c = 3500.00;
    	int ct = 600;
    	assertEquals(false, App.checkOut(c, ct, st));
    }
    
    @Test
    public void test_G() {
    	boolean result = true;
    	statusClass.Status st = Status.other;
    	double c = 750.00;
    	int ct = 600;
    	assertEquals(true, App.checkOut(c, ct, st));
    }
    
    @Test
    public void test_H() {
    	boolean result = true;
    	statusClass.Status st = Status.other;
    	double c = 2000.00;
    	int ct = 900;
    	assertEquals(true, App.checkOut(c, ct, st));
    }
    
    @Test
    public void test_I() {
    	boolean result = true;
    	statusClass.Status st = Status.other;
    	double c = 2000.00;
    	int ct = 100;
    	assertEquals(false, App.checkOut(c, ct, st));
    }
}
