package org.example;

public class ControleRemotoEstadoReproduzindo extends ControleRemotoEstado{

    private static ControleRemotoEstadoReproduzindo instance = new ControleRemotoEstadoReproduzindo();

    public static ControleRemotoEstadoReproduzindo getInstance() {
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
        return false;
    }
    public boolean pausar(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoReproduzindo.getInstance());
        return true;
    }
}
