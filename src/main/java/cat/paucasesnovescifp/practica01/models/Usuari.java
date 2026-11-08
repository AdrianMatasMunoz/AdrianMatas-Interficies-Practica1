package cat.paucasesnovescifp.practica01.models;

import cat.paucasesnovescifp.practica01.exceptions.EmptyNameException;

public class Usuari {
    private String nom;
    private String contacte;
    
    public Usuari(String nom, String contacte) throws EmptyNameException {
        setNom(nom);
        this.contacte = contacte;
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
    
    public void setContacte(String value) {
        contacte = value;
    }
}
