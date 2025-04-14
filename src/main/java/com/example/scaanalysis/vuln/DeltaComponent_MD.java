package com.example.scaanalysis.vuln;

public class DeltaComponent_MD {

    // Método reachable que simula una funcionalidad demo (anteriormente "moderada")
    public static void trigger() {
        System.out.println("Executing DeltaComponent_MD.");
        remediate();
    }

    private static void remediate() {
        System.out.println("Rem DeltaComponent_MD.");
    }
}

