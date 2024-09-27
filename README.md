## Explicação do Algoritmo
**Estrutura do Projeto**

O projeto foi desenvolvido em Java e contém três classes principais:

- `Resistor` - Representa um resistor individual.
- `Circuito` - Contém métodos para cálculos de resistência.
- `Main` - A classe principal onde o programa é executado.

**Classe `Resistor`:**
Esta classe representa um resistor com um valor de resistência específico.

```java
public class Resistor {
    private double resistencia;

    // Construtor que inicializa a resistência do resistor
    public Resistor(double resistencia) {
        this.resistencia = resistencia;
    }

    // Método getter para obter o valor da resistência
    public double getResistencia() {
        return resistencia;
    }
}
```

**Explicação**

- Atributo `resistencia` - Armazena o valor da resistência do resistor.
- Construtor: Inicializa o resistor com um valor de resistência fornecido.
- Método `getResistencia` - Retorna o valor da resistência do resistor.

**Classe `Circuito`:** Esta classe contém métodos para calcular a resistência equivalente em configurações de circuitos.

  ```java
  public class Circuito {
    // Método estático para calcular a resistência equivalente de dois resistores em paralelo
    public static double calcularParalelo(double R1, double R2) {
        return (R1 * R2) / (R1 + R2);
    }
  }
```

**Explicação**

- Método `calcularParalelo` - Calcula a resistência equivalente de dois resistores em paralelo utilizando a fórmula `Req_paralelo = (R2 * R3) / (R2 + R3)`.

**Classe `Main`:** A classe principal onde a execução do programa ocorre.

```java
public class Main {
    public static void main(String[] args) {
        // Definindo os valores dos resistores conforme a descrição do circuito (associação mista)
        Resistor R1 = new Resistor(15.0);  // Resistor 1 em série com o paralelo de R2 e R3
        Resistor R2 = new Resistor(30.0);  // Resistor 2 em paralelo com R3
        Resistor R3 = new Resistor(60.0);  // Resistor 3 em paralelo com R2
        Resistor R4 = new Resistor(5.0);   // Resistor 4 em série

        // Indicando que os valores dos resistores estão associados em uma configuração mista
        System.out.println("Valores dos resistores (associação mista):");
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
```

**Explicação**

- Definição dos Resistores: Quatro resistores são criados com valores de resistência específicos.
- Exibição dos Valores dos Resistores: Os valores dos resistores são exibidos no terminal.
- Cálculo da Resistência Equivalente Paralela: A resistência equivalente dos resistores R2 e R3 em paralelo é calculada e exibida.
- Cálculo da Resistência Equivalente Total em Série: A resistência equivalente total do circuito (R1 em série com o paralelo de R2 e R3, e R4 em série) é calculada e exibida.
- Exibição Final: Os resultados dos cálculos intermediários e o valor final da resistência equivalente total são exibidos.

## Como o Algoritmo Funciona?

**Simples**

- Inicialização dos Resistores: Quatro resistores são inicializados com valores específicos de resistência.
- Exibição dos Valores dos Resistores: Os valores dos resistores são exibidos para clareza.
- Cálculo da Resistência Equivalente em Paralelo: Utiliza-se a fórmula `Req_paralelo = (R2 * R3) / (R2 + R3)` para calcular a resistência equivalente dos resistores em paralelo.
- Exibição do Cálculo Intermediário: Mostra-se como o cálculo foi realizado.
- Cálculo da Resistência Equivalente Total: Soma-se a resistência de R1, a resistência equivalente do paralelo (R2 e R3) e a resistência de R4.
- Exibição dos Resultados: Exibe-se o cálculo intermediário e o resultado final da resistência equivalente total do circuito.

**Fim**

Isso é tudo!

## Cálculo

**Valores dos Resistores**

```java
 R1 = 15 ohms
 R2 = 30 ohms
 R3 = 60 ohms
 R4 = 5 ohms
```

**Fórmula para calcular resistência equivalente de R2 e R3 (paralelo)**

```java
Req_paralelo = (R2 * R3) / (R2 + R3)
```

**Cálculo e valor da resistência equivalente paralelo (R2 e R3)**

```java
Req_paralelo (R2 e R3) = (30 * 60) / (30 + 60) = 20 ohms
```

**Cálculo da resistência equivalente total em série**
```java
R1 + Req_paralelo + R4 = 15 + 20 + 5 = 40 ohms
```

**Resistência equivalente total**

```java
Req_total = 40 ohms
```


![Captura de tela 2024-09-27 100029](https://github.com/user-attachments/assets/59fc7003-aef6-414c-8997-833423e948d8)

