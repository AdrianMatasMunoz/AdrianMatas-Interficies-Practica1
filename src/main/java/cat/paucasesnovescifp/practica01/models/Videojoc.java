package cat.paucasesnovescifp.practica01.models;

import cat.paucasesnovescifp.practica01.exceptions.EmptyNameException;
import cat.paucasesnovescifp.practica01.utils.Platform;
import java.util.HashMap;
import java.util.Map;

public class Videojoc {
    private String nom;
    private String creador;
    private final Map<Platform, Integer> unitatsDisponibles;
    
    public Videojoc(String nom, String creador, int unitatsInicials) throws EmptyNameException {
        setNom(nom);
        setCreador(creador);
        unitatsDisponibles = new HashMap<>();
        for(Platform platform : Platform.values()) {
            unitatsDisponibles.put(platform, unitatsInicials);
        }
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String value) throws EmptyNameException {
        if(value.length() == 0) {
            throw new EmptyNameException("L'atribut nom de la classe Videojoc no pot ser buit.");
        }
        
        nom = value;
    }
    
    public String getCreador() {
        return creador;
    }
    
    public void setCreador(String value) throws EmptyNameException {
        if(value.length() == 0) {
            throw new EmptyNameException("L'atribut creador de la classe Videojoc no pot ser buit.");
        }
        
        creador = value;
    }
}
