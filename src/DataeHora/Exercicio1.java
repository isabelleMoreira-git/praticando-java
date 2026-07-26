package DataeHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){
        String tarefa;
        LocalDate dataTarefa = LocalDate.now();
        LocalTime horaTarefa = LocalTime.now();

        Scanner leitura = new Scanner(System.in);

        System.out.println("Sistema de Gerenciamento de Tarefas");
        System.out.println("Insira a tarefa que deseja criar:");
        tarefa = leitura.nextLine();

        System.out.println("Tarefa criada!");
        System.out.println("Tarefa: " + tarefa);
        System.out.println("Data atual: " + dataTarefa);
        System.out.println("Hora atual: " + horaTarefa);

        }
    }

