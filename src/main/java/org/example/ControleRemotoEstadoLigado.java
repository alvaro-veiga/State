package org.example;

public class ControleRemotoEstadoLigado extends ControleRemotoEstado {
    private ControleRemotoEstadoLigado() {};

    private static ControleRemotoEstadoLigado instance = new ControleRemotoEstadoLigado();

    public static ControleRemotoEstadoLigado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "ligado";
    }

    public boolean desligar(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoLigado.getInstance());
        return true;
    }
    public boolean pausar(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoPausado.getInstance());
        return true;
    }
    public boolean reproduzir(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoReproduzindo.getInstance());
        return false;
    }
}
