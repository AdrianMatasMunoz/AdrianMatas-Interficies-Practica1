package cat.paucasesnovescifp.practica01.models;

import cat.paucasesnovescifp.practica01.exceptions.EmptyNameException;
import cat.paucasesnovescifp.practica01.exceptions.WrongFormatException;
import java.util.regex.Pattern;

public class Usuari {
    private static final Pattern EMAIL_REGEX = Pattern.compile("^\\w+@\\w+\\.\\w+$", Pattern.MULTILINE);
    
    private String nom;
    private String contacte;
    
    public Usuari(String nom, String contacte) throws EmptyNameException, WrongFormatException {
        setNom(nom);
        setContacte(contacte);
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String value) throws EmptyNameException {
        if(value.length() == 0) {
            throw new EmptyNameException("L'atribut nom de la classe Usuari no pot ser buit.");
        }
        
        nom = value;
    }
    
    public String getContacte() {
        return contacte;
    }
    
    public void setContacte(String value) throws EmptyNameException, WrongFormatException {
        if(value.length() == 0) {
            throw new EmptyNameException("L'atribut contacte de la classe Usuari no pot ser buit.");
        } else if(!EMAIL_REGEX.matcher(value).find()) {
            throw new WrongFormatException("L'atribut contacte de la classe Usuari ha de seguir el format d'un correu electrònic.");
        }
        
        contacte = value;
    }
}
