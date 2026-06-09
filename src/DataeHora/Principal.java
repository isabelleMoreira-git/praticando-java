package DataeHora;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args){
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);
    }
}

/*
*
* LocalDate para trabalhar com data;
* LocalTime para trabalhar somente com hora e
* LocalDateTime para trabalhar com data e hora completas.
*
* Para todos esses tipos, há métodos para atribuir valores e criar datas, que veremos na prática:
* of(), que recebe o ano, mês e dia, ou, no caso de hora, a hora e o minuto;
* parse(), que recebe uma string no formato ISO e a converte;
* now(), que retorna o momento exato atual, seja a data, o horário ou ambos.
*
* plusWeeks(), plusMonths() e plusYears(), que servem para adicionar;
* minusDays(), minusWeeks(), minusMonths() e minusYears(), que servem para subtrair.
*
*
* Além de adicionar e subtrair datas, podemos fazer verificações,
* como se uma data é antes ou depois de outra com os seguintes métodos:
* isBefore();
* isAfter();
* isEqual().
*
*
* */