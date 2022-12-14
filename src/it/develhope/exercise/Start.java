package it.develhope.exercise;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {

    public static void main(String[] args) {

        /*
        Usando LocalDateTime ho formattato come richiesto dall'esercizio con numero del giorno, nome del mese,
        ulitme due cifre dell'anno, ore e minuti
         */
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd-MMM-YY HH:mm")));

        /*
        Usando ZonedDateTime ho stampato la data corrente usando la forma ISO Zoned Date Time

         */
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
