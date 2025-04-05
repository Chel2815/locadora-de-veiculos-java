import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    void testCalcularCusto_DiasPositivos() {
        Veiculo veiculo = new Veiculo("Cobalt", 50.0);
        assertEquals(150.0, veiculo.calcularCusto(3));
    }

    @Test
    void testCalcularCusto_ZeroDias() {
        Veiculo veiculo = new Veiculo("Kwid", 40.0);
        assertEquals(0.0, veiculo.calcularCusto(0));
    }

    @Test
    void testCalcularCusto_DiasNegativos() {
        Veiculo veiculo = new Veiculo("Tracker", 70.0);
        assertThrows(IllegalArgumentException.class, () -> veiculo.calcularCusto(-2));
    }
}
