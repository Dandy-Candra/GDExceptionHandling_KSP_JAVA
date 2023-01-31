/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception_guided_ksp;

import exception.ExceptionMerk;
import exception.ExceptionPlatNomor;
import exception.ExceptionWarna;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VICTUS
 */
public class Exception_Guided_KSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Mobil mobil = new Mobil("Avanza", " 3345 SQ","Silver");
            Motor motor = new Motor("Vario", "AB 3347 AQ","Hitam");
            
            mobil.showData();
            
            motor.showData();
        } catch (ExceptionPlatNomor ex) {
            System.err.println(ex.getMessage());
            System.out.println("Masuk sini");
        } catch (ExceptionWarna ex) {
            System.err.println(ex.getMessage());
        } catch (ExceptionMerk ex) {
            System.err.println(ex.getMessage());
        }
        
        
    }
    
}
