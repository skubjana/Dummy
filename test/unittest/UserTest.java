/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unittest;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skubjana
 */
public class UserTest {
    
    public UserTest() {
    }

    /**
     * Test of checkUsername method, of class User.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername method");
        String Username = "Sam_";
        boolean expResult = true;
        boolean result = User.checkUsername(Username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }


    /**
     * Test of sum method, of class User.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 12;
        int b = 3;
        int expResult = 15;
        int result = User.sum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
