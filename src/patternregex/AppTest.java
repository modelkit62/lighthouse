package patternregex;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {


    @Test
    public void comprueba(){
        // App app2 = new App("Robledo");
        // assertNotNull(app2);
        assertThrows(RuntimeException.class, () -> { App app2 = new App("Robl3edo" ); } );
    }

}