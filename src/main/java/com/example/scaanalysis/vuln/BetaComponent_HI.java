package com.example.scaanalysis.vuln;

public class BetaComponent_HI {

    // Método reachable que simula una funcionalidad demo (anteriormente "alta")
    public static void trigger() {
        System.out.println("Executing BetaComponent_HI.");
        remediate();
    }

    private static void remediate() {
        System.out.println("Rem BetaComponent_HI.");
    }
}
