import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class OperazioniDate {

    //Aggiunge un anno e 7 giorni, rimuove un mese
    public OffsetDateTime changeDate(OffsetDateTime dateToChange) {
        if(dateToChange == null) {
            return null;
        }
        return dateToChange.plusYears(1).minusMonths(1).plusDays(7);
    }

    public String formatItaly(OffsetDateTime dateToFormat) {
        if(dateToFormat == null) {
            return null;
        }
        return dateToFormat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY));
    }
}
