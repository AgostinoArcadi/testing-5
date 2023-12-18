import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OperazioniDate operazioni = new OperazioniDate();

        OffsetDateTime dateChanged = operazioni.changeDate(date);

        System.out.println("Data precedente: " + operazioni.formatItaly(date));
        System.out.println("Data cambiata: " + operazioni.formatItaly(dateChanged));
    }
}
