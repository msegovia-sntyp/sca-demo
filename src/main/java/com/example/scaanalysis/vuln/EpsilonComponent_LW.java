package com.example.scaanalysis.vuln;

public class EpsilonComponent_LW {

    // Método reachable que simula una funcionalidad demo (anteriormente "baja")
    public static void trigger() {
        System.out.println("Executing EpsilonComponent_LW.");
        remediate();
    }

    private static void remediate() {
        System.out.println("Rem on EpsilonComponent_LW.");
    }
}

