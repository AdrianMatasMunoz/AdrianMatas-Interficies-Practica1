/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.practica01.exceptions;

/**
 *
 * @author Alumne
 */
public class WrongFormatException extends Exception {
    public WrongFormatException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongFormatException: "+this.getMessage();
    }
}
