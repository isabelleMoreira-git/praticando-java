package DataeHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args){
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusão compra: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(
                ZoneId.of("America/New_York"));
        System.out.println("Data conclusão compra NY: " + dataCompraNy);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toHours() +
                " horas e " + duracao.toMinutesPart() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());

    }
}
// todo: resolver pro getDays retornar 30 e não 17


/*
*
* LocalDate para trabalhar com data;
* LocalTime para trabalhar somente com hora e
* LocalDateTime para trabalhar com data e hora completas.
*
* Para todos esses tipos, há métodos para atribuir valores e criar datas:
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
* Podemos formatar a data usando DateTimeFormatter para criar o formato no padrão brasileiro.
* Por exemplo, abaixo dos prints, podemos criar um DateTimeFormatter chamado formato,
* usando DateTimeFormatter.ofPattern("dd/MM/yyyy"),
* onde dd/MM/yyyy define o padrão dia/mês/ano.
* Utilizamos MM maiúsculo para definir meses, pois mm minúsculo define os minutos.
*
*
* */