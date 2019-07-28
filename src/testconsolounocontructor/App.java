package testconsolounocontructor;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class App {


    /*private String name;

    // Si incluyo un @Test en la misma clase solo puede tener un Contructor sin parametros la Clase!!!
    public App() {
    }

    public App(String name) {
        this.name = name;
    }
*/
    @Test
    public void comprueba(){
        App app = new App();
        assertNotNull(app);
    }
}
