/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unittest;

/**
 *
 * @author skubjana
 */
public class User {
    
    public static boolean checkUsername(String Username)
    {
        return Username.contains("_") && Username.length() < 6;
        
    }
    
    public static int sum(int a, int b)
    {
              
        return a + b;

    }
}
