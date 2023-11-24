package org.example;

public class ControleRemoto {

    private ControleRemotoEstado estado;
    public ControleRemoto() {
        this.estado = ControleRemotoEstadoDesligado.getInstance();
    }
    public void setEstado(ControleRemotoEstado estado) {
        this.estado = estado;
    }

    public boolean ligar() {
        return this.estado.ligar(this);
    }
    public boolean desligar() {
        return this.estado.desligar(this);
    }
    public boolean pausar() {
        return this.estado.pausar(this);
    }
    public boolean reproduzir() {
        return this.estado.reproduzir(this);
    }
    public String getNomeEstado() {
        return estado.getEstado();
    }
    public ControleRemotoEstado getEstado() {
        return estado;
    }
}
