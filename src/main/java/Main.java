public class Main {
    public static void main(String[] args) {
        // Definindo os valores dos resistores conforme a descrição do circuito (associação mista)
        Resistor R1 = new Resistor(15.0);  // Resistor 1 em série com o paralelo de R2 e R3
        Resistor R2 = new Resistor(30.0);  // Resistor 2 em paralelo com R3
        Resistor R3 = new Resistor(60.0);  // Resistor 3 em paralelo com R2
        Resistor R4 = new Resistor(5.0);   // Resistor 4 em série

        // Indicando que os valores dos resistores estão associados em uma configuração mista
        System.out.println("Valores dos resistores (associação mista):");

        // Exibindo os valores dos resistores
        System.out.println("R1 = " + R1.getResistencia() + " ohms");
        System.out.println("R2 = " + R2.getResistencia() + " ohms");
        System.out.println("R3 = " + R3.getResistencia() + " ohms");
        System.out.println("R4 = " + R4.getResistencia() + " ohms");

        // Mensagem explicativa da fórmula para calcular resistência equivalente de R2 e R3 (paralelo)
        System.out.println("\nFórmula para calcular resistência equivalente de R2 e R3 (paralelo):");
        System.out.println("Req_paralelo = (R2 * R3) / (R2 + R3)");

        // Calculando a resistência equivalente do paralelo (R2 e R3)
        double Req_paralelo = Circuito.calcularParalelo(R2.getResistencia(), R3.getResistencia());

        // Exibindo cálculo e valor da resistência equivalente do paralelo (R2 e R3)
        System.out.println("\nCálculo e valor da resistência equivalente paralelo (R2 e R3):");
        System.out.println("Req_paralelo (R2 e R3) = (" + R2.getResistencia() + " * " + R3.getResistencia() +
                           ") / (" + R2.getResistencia() + " + " + R3.getResistencia() + ") = " + Req_paralelo + " ohms");

        // Calculando a resistência equivalente total em série (R1 + Req_paralelo + R4)
        double Req_total = R1.getResistencia() + Req_paralelo + R4.getResistencia();

        // Exibindo cálculo da resistência equivalente total em série
        System.out.println("\nCálculo da resistência equivalente total em série:");
        System.out.println("R1 + Req_paralelo + R4 = " + R1.getResistencia() + " + " + Req_paralelo + " + " + R4.getResistencia() +
                           " = " + Req_total + " ohms");

        // Exibindo a resistência equivalente total
        System.out.println("\nResistência equivalente total: " + Req_total + " ohms");
    }
}
