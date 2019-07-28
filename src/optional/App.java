package optional;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable(null);

        System.out.println(stringOptional);
    }
}
