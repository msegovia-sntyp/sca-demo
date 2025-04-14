package com.example.scaanalysis;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ScanAnalysisApp {

    public static void main(String[] args) {
        // Generar un ID de 10 dígitos
        String id = generateRandomId();
        String message = "Scan analysis - ID: " + id;

        // Generate text file
        String fileName = "scan_analysis.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(message);
            System.out.println("Archivo generado: " + fileName);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }

        // Llamadas a los componentes (de demo)
        com.example.scaanalysis.vuln.AlphaComponent_CR.trigger();
        com.example.scaanalysis.vuln.BetaComponent_HI.trigger();
        com.example.scaanalysis.vuln.GammaComponent_SV.trigger();
        com.example.scaanalysis.vuln.DeltaComponent_MD.trigger();
        com.example.scaanalysis.vuln.EpsilonComponent_LW.trigger();
    }

    private static String generateRandomId() {
        Random random = new Random();
        // Genera un número entre 1000000000 y 1999999999 (10 dígitos)
        int number = 1000000000 + random.nextInt(1000000000);
        return String.valueOf(number);
    }
}
