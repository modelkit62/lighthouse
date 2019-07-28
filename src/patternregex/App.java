package patternregex;


import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class App {


    private String name;

    public App(String name) {
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            this.name = name;
        } else {
            throw new RuntimeException("Invalid name, gilipollas!");
        }
    }

    private String nameRegex = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";;

    /*{
        nameRegex = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
    }*/

    private Pattern pattern = Pattern.compile(nameRegex);





    /*public static void main(String[] args) {

        App app = null;
        try {
            app = new App("Dan3iel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(app.name);
    }*/



}
