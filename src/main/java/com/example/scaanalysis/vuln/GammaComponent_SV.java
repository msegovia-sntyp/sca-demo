package com.example.scaanalysis.vuln;

public class GammaComponent_SV {

    // Método reachable que simula una funcionalidad demo (anteriormente "severa")
    public static void trigger() {
        System.out.println("Executing GammaComponent_SV.");
        remediate();
    }

    private static void remediate() {
        System.out.println("Rem GammaComponent_SV.");
    }
}

