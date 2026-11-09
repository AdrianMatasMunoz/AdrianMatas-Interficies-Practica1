package cat.paucasesnovescifp.practica01.controllers;

import cat.paucasesnovescifp.practica01.exceptions.EmptyNameException;
import cat.paucasesnovescifp.practica01.exceptions.OutOfStockException;
import cat.paucasesnovescifp.practica01.models.*;
import cat.paucasesnovescifp.practica01.utils.Platform;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LloguerController {
    public static final LloguerController instance = new LloguerController();
    
    private final ArrayList<Usuari> usuaris;
    private final ArrayList<Videojoc> videojocs;
    public final ArrayList<Lloguer> lloguers;
    
    private LloguerController() {
        usuaris = new ArrayList<>();
        videojocs = new ArrayList<>();
        lloguers = new ArrayList<>();
        
        try {
            lloguers.add(new Lloguer(
                    new Usuari("John User", "123 456 789"),
                    new Videojoc("DELTARUNE", "Toby Fox", 5, List.of(Platform.PS5, Platform.SWITCH2)),
                    Platform.SWITCH2,
                    LocalDate.now().minus(Duration.ofDays(5)),
                    LocalDate.now().plus(Duration.ofDays(5))
            ));
            
            lloguers.add(new Lloguer(
                    new Usuari("Jane Client", "987 654 321"),
                    new Videojoc("JoJo's Bizarre Adventure: All Star Battle R", "CyberConnect2", 5, List.of(Platform.XBOX, Platform.PC)),
                    Platform.SWITCH2,
                    LocalDate.now().minus(Duration.ofDays(15)),
                    LocalDate.now().minus(Duration.ofDays(5))
            ));
        } catch(EmptyNameException ex) {
            System.err.println("Els lloguers inicials llencen errors, per favor corregeix-los abans d'entregar.");
        }
        update();
    }
    
    public final void update() {
        usuaris.clear();
        videojocs.clear();
        
        for(Lloguer lloguer : lloguers) {
            if(!userExists(lloguer.usuari().getNom())) {
                usuaris.add(lloguer.usuari());
            }
            if(!gameExists(lloguer.videojoc().getNom())) {
                videojocs.add(lloguer.videojoc());
            }
            
            Videojoc videojoc = getGameByName(lloguer.videojoc().getNom());
            try {
                videojoc.takeUnit(lloguer.plataforma());
            } catch(OutOfStockException ex) {
                System.err.println("Lloguer invalid:\n"+ex.getMessage());
                lloguers.remove(lloguer);
            }
        }
    }
    
    public Usuari getUserByName(String name) {
        for(Usuari usuari : usuaris) {
            if(usuari.getNom().equals(name)) {
                return usuari;
            }
        }
        return null;
    }
    
    public boolean userExists(String name) {
        return !usuaris.isEmpty() && getUserByName(name) != null;
    }
    
    public Videojoc getGameByName(String name) {
        for(Videojoc videojoc : videojocs) {
            if(videojoc.getNom().equals(name)) {
                return videojoc;
            }
        }
        return null;
    }
    
    public boolean gameExists(String name) {
        return !videojocs.isEmpty() && getGameByName(name) != null;
    }
}
