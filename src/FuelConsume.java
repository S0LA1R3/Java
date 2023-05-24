/* Desenvolva um aplicativo Java que receba como entrada os quilômetros
dirigidos e os litros de gasolina consumidos (ambos como inteiros) para
cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro
para cada viagem e imprimir a quilometragem total e a soma total de litros
de combustível consumidos até esse ponto para todas as viagens. Todos os
cálculos de média devem produzir resultados de ponto flutuante. Utilize classe
Scanner e repetição controlada por sentinela para obter os dados do usuário. */

import java.util.Scanner;

public class FuelConsume
{
    public static void main(String[] args)
    {
        int km = -1;
        int totalKm = 0;
        int fuel = 0;
        int totalFuel = 0;
        int travels = 0;
        boolean condition = Boolean.FALSE;

        Scanner input = new Scanner(System.in);

        while (km != 0)
        {
            travels += 1;
            totalKm += km;
            totalFuel += fuel;

            while (condition == Boolean.FALSE)
            {
                System.out.printf("Enter the km for %d° travel (0 for exit): ", travels);
                km = input.nextInt();
                if (km >= 0)
                {
                    condition = Boolean.TRUE;
                }
                System.out.println();
            }
            if (km > 0)
                condition = Boolean.FALSE;
            while (condition == Boolean.FALSE)
            {
                System.out.printf("Enter the fuel for %d° travel (0 for exit): ", travels);
                fuel = input.nextInt();

                if (fuel >= 0)
                {
                    condition = Boolean.TRUE;
                }

                System.out.println();
            }

            if (fuel > 0)
                condition = Boolean.FALSE;

            double consume = (double) km/fuel;

            if (km > 0)
                if (fuel > 0)
                    System.out.printf("%nThe %d° travel has an consume of %.2f km/l%n%n", travels, consume);

        }

        System.out.printf("The total km for the travel was %dkm and the total fuel consumed was %dl.",
                totalKm, totalFuel);

    }
}
