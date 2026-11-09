package cat.paucasesnovescifp.practica01.models;

import cat.paucasesnovescifp.practica01.utils.Platform;
import java.time.LocalDate;

public record Lloguer(Usuari usuari, Videojoc videojoc, Platform plataforma, LocalDate dataInicial, LocalDate dataPrevista) {}