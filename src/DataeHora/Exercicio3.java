/*Você é responsável pelo controle de tempo em projetos dentro de uma
agência de desenvolvimento. Você precisa monitorar o tempo gasto em cada
tarefa para garantir que os projetos sejam executados dentro do prazo.

Para isso, crie um programa que:

Receba dois horários representando o início e o término de uma atividade.
Calcule a diferença em horas e minutos entre esses dois horários.
Exiba o resultado formatado.
Saída esperada:

Se o primeiro horário for 14:30:00 e o segundo horário for 16:45:00, a saída deve ser:

Diferença de tempo: 2 horas e 15 minutos*/


package DataeHora;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int hora = 0;
        int minuto = 0;
        LocalTime primeiroHorario = LocalTime.of(hora, minuto);
        LocalTime segundoHorario = LocalTime.of(hora, minuto);
        int i = 0;

        Scanner leitura = new Scanner(System.in);

        while (i < 2) {
            i++;
            String horarioInformado;
            String primeiroOuSegundo;

            if (i == 1) {
                primeiroOuSegundo = "primeiro";
                primeiroHorario = LocalTime.of(hora, minuto);
            } else {
                primeiroOuSegundo = "segundo";
                segundoHorario = LocalTime.of(hora, minuto);
            }

            System.out.println("Sistema de Controle de Tempo");
            System.out.println("Insira o " + primeiroOuSegundo + " horário, no formato (hora:minuto)");
            horarioInformado = leitura.nextLine();
            String[] splitHorario = horarioInformado.split(":");

            hora = Integer.parseInt(splitHorario[0]);
            minuto = Integer.parseInt(splitHorario[1]);

        }

        Duration duracao = Duration.between(primeiroHorario, segundoHorario);
        System.out.println("A diferença entre o primeiro e segundo horário é: " + duracao);
    }
}