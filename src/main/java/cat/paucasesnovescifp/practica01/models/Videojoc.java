package cat.paucasesnovescifp.practica01.models;

import cat.paucasesnovescifp.practica01.exceptions.EmptyNameException;
import cat.paucasesnovescifp.practica01.exceptions.OutOfStockException;
import cat.paucasesnovescifp.practica01.utils.Platform;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Videojoc {
    private String nom;
    private String creador;
    private final Map<Platform, Integer> unitatsDisponibles;
    
    public Videojoc(String nom, String creador, int unitatsInicials, List<Platform> plataformes) throws EmptyNameException {
        setNom(nom);
        setCreador(creador);
        unitatsDisponibles = new HashMap<>();
        for(Platform platform : Platform.values()) {
            unitatsDisponibles.put(platform, plataformes.contains(platform) ? unitatsInicials : 0);
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
    
    public Integer getRemainingUnits(Platform platform) {
        return unitatsDisponibles.get(platform);
    }
    
    public void takeUnit(Platform platform) throws OutOfStockException {
        if(getRemainingUnits(platform) == 0) {
            throw new OutOfStockException("No queden unitats pel videojoc \""+nom+"\" per la plataforma \""+platform.name()+"\".");
        }
        
        unitatsDisponibles.put(platform, getRemainingUnits(platform)-1);
    }
}
