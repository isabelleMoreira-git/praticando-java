package DataeHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args){
        String relatorio;
        LocalDate dataTarefa = LocalDate.now();
        LocalTime horaTarefa = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        Scanner leitura = new Scanner(System.in);

        System.out.println("Sistema de Relatórios");
        System.out.println("Insira o seu relatório diário:");
        relatorio = leitura.nextLine();

        System.out.println("O seu relatório foi criado!");
        System.out.println("Relatório: " + relatorio);
        System.out.println("Data formatada: " + dataTarefa.format(formatoData));
        System.out.println("Hora formatada: " + horaTarefa.format(formatoHora));

    }
}
