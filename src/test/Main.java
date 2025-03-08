package test;

import main.TiempoAnemico;
import main.TiempoNoAnemico;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        TiempoNoAnemico tiempoNoAnemico = new TiempoNoAnemico();

        System.out.println("La fecha corta en forma no anemica: " + tiempoNoAnemico.mostrarCorto());
        System.out.println("La fecha larga en forma no anemica: " + tiempoNoAnemico.mostrarLargo());
        System.out.println("La fecha larga en forma  anemica: " + tiempoAnemico.getFecha().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("La fecha corta en forma  anemica: " + tiempoAnemico.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
}