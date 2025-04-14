package com.example.scaanalysis.vuln;

public class AlphaComponent_CR {

    // Método reachable que simula una funcionalidad demo (anteriormente "crítica")
    public static void trigger() {
        System.out.println("Executing AlphaComponent_CR");
        remediate();
    }

    private static void remediate() {
        System.out.println("Rem AlphaComponent_CR.");
    }
}

