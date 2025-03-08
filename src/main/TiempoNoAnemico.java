package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TiempoNoAnemico {
    private LocalDate fecha;

    public TiempoNoAnemico() {
        this.fecha = LocalDate.now();
    }

    public String mostrarLargo() {
        return fecha.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public String mostrarCorto() {
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
