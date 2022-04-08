import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class statTest {

    @Test

    public void NumbersOutPlayers() {
        String[] namesAndSpeed = {"Kostya_0", "Rafael_8", "Sasha_6", "Misha_3"};

        String expected = "Rafael";
        int actual = Main.getSurvivorsPlayers(names);
        Assertions.assertEquals(expected, actual);
    }
}

