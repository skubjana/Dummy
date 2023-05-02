/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unittest;
import java .util.Scanner;
/**
 *
 * @author skubjana
 */
public class UnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Username");
        String name = s.next();
        
        User.checkUsername(name);
    }
    
}
