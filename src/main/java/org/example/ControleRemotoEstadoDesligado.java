package org.example;

public class ControleRemotoEstadoDesligado extends ControleRemotoEstado{

    private ControleRemotoEstadoDesligado() {};

    private static ControleRemotoEstadoDesligado instance = new ControleRemotoEstadoDesligado();

    public static ControleRemotoEstadoDesligado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "desligado";
    }

    public boolean ligar(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoLigado.getInstance());
        return true;
    }
    public boolean pausar(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoPausado.getInstance());
        return false;
    }
    public boolean reproduzir(ControleRemoto controleremoto) {
        controleremoto.setEstado(ControleRemotoEstadoReproduzindo.getInstance());
        return false;
    }
}
