import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControleRemotoTest {

    ControleRemoto controleremoto;

    @BeforeEach
    public void setUp() {
        controleremoto = new ControleRemoto();
    }

    //TV desligada

    @Test
    public void naoDeveDesligarTv() {
        controleremoto.setEstado(ControleRemotoEstadoDesligado.getInstance());
        assertFalse(controleremoto.desligar());
    }
    @Test
    public void deveLigarTvDesligada() {
        controleremoto.setEstado(ControleRemotoEstadoDesligado.getInstance());
        assertTrue(controleremoto.ligar());
        assertEquals(ControleRemotoEstadoLigado.getInstance(), controleremoto.getEstado());
    }
    @Test
    public void naoDevePausarTvDesligada() {
        controleremoto.setEstado(ControleRemotoEstadoDesligado.getInstance());
        assertFalse(controleremoto.pausar());
    }
    @Test
    public void naoDeveReproduzirTvDesligada() {
        controleremoto.setEstado(ControleRemotoEstadoDesligado.getInstance());
        assertFalse(controleremoto.reproduzir());
    }

    //TV ligada

    @Test
    public void naoDeveLigarTv() {
        controleremoto.setEstado(ControleRemotoEstadoLigado.getInstance());
        assertFalse(controleremoto.ligar());
    }
    @Test
    public void deveDesligarTvLigada() {
        controleremoto.setEstado(ControleRemotoEstadoLigado.getInstance());
        assertTrue(controleremoto.desligar());
        assertEquals(ControleRemotoEstadoDesligado.getInstance(), controleremoto.getEstado());
    }
    @Test
    public void devePausarTvLigada() {
        controleremoto.setEstado(ControleRemotoEstadoLigado.getInstance());
        assertTrue(controleremoto.pausar());
        assertEquals(ControleRemotoEstadoPausado.getInstance(), controleremoto.getEstado());
    }
    @Test
    public void naoDeveReproduzirTvLigada() {
        controleremoto.setEstado(ControleRemotoEstadoLigado.getInstance());
        assertFalse(controleremoto.reproduzir());
    }
}
