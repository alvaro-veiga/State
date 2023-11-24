package org.example;

public abstract class ControleRemotoEstado {
    public abstract String getEstado();

    public boolean ligar(ControleRemoto controleremoto) {
        return false;
    }
    public boolean desligar(ControleRemoto controleremoto) {
        return false;
    }
    public boolean pausar(ControleRemoto controleremoto) {
        return false;
    }
    public boolean reproduzir(ControleRemoto controleremoto) {
        return false;
    }
}
