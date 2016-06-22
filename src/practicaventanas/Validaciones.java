/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaventanas;

/**
 *
 * @author AdminFull
 */
public class Validaciones {
    
    public static boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
    public static boolean isFloat(String string) {
        try {
            Float.parseFloat(string);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
    public static boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
