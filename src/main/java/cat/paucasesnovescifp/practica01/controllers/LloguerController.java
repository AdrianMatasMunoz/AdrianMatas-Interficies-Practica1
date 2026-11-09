package cat.paucasesnovescifp.practica01.controllers;

import cat.paucasesnovescifp.practica01.exceptions.EmptyNameException;
import cat.paucasesnovescifp.practica01.exceptions.OutOfStockException;
import cat.paucasesnovescifp.practica01.exceptions.WrongFormatException;
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
                    new Usuari("John User", "johnuser@gmail.com"),
                    new Videojoc("DELTARUNE", "Toby Fox", 5, List.of(Platform.PS5, Platform.SWITCH2)),
                    Platform.SWITCH2,
                    LocalDate.now().minusDays(20),
                    LocalDate.now().minusDays(10)
            ));
            
            lloguers.add(new Lloguer(
                    new Usuari("Jane Client", "janeclient@gmail.com"),
                    new Videojoc("JoJo's Bizarre Adventure: All Star Battle R", "CyberConnect2", 5, List.of(Platform.XBOX, Platform.PC)),
                    Platform.PC,
                    LocalDate.now().minusDays(15),
                    LocalDate.now().minusDays(5)
            ));
        } catch(EmptyNameException | WrongFormatException ex) {
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
    
    public String[][] toTableData() {
        String[][] data = new String[lloguers.size()][6];
        
        for(int i = 0; i < lloguers.size(); i++) {
            data[i][0] = lloguers.get(i).usuari().getNom();
            data[i][1] = lloguers.get(i).videojoc().getNom();
            data[i][2] = lloguers.get(i).plataforma().toString();
            data[i][3] = lloguers.get(i).dataInicial().toString();
            data[i][4] = lloguers.get(i).dataPrevista().toString();
            data[i][5] = lloguers.get(i).dataPrevista().isBefore(LocalDate.now()) ? "Fora de Termini" : "Retornat";
        }
        
        return data;
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
