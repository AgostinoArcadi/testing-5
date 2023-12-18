import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class OperazioniDateTest {

    private final OperazioniDate testing = new OperazioniDate();
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void change_date() {
        OffsetDateTime result = testing.changeDate(date);
        OffsetDateTime expected = OffsetDateTime.parse("2024-02-08T13:00:00Z");
        assertEquals(expected, result, "Il risultato dovrebbe essere 2022-02-08T13:00:00Z");
    }

    @Test
    void change_date_null() {
        OffsetDateTime result = testing.changeDate(null);
        assertNull(result, "Il risultato dovrebbe essere null");
    }

    @Test
    void format_italy() {
        String result = testing.formatItaly(date);
        assertEquals("01/03/2023", result, "Il risultato dovrebbe essere 01/03/2023");
    }

    @Test
    void format_italy_null() {
        String result = testing.formatItaly(null);
        assertNull(result, "Il risultato dovrebbe essere null");
    }
}