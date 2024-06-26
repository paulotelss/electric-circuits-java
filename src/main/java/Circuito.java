public class Circuito {
    // Método para calcular a resistência equivalente de resistores em paralelo
    public static double calcularParalelo(double R1, double R2) {
        return (R1 * R2) / (R1 + R2);
    }
}
