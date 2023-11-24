package org.example;

public class ControleRemotoEstadoPausado extends ControleRemotoEstado {
    private ControleRemotoEstadoPausado() {};

    private static ControleRemotoEstadoPausado instance = new ControleRemotoEstadoPausado();

    public static ControleRemotoEstadoPausado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "pausado";
    }

    public boolean desligar(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoLigado.getInstance());
        return true;
    }
    public boolean ligar(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoLigado.getInstance());
        return true;
    }
    public boolean reproduzir(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoReproduzindo.getInstance());
        return false;
    }
}
