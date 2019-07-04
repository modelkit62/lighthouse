package lambdas;

public class App {

    // Dos mismas formas de implementar un Functional interface :)
    iDog iDog_1 = new iDog() {
        @Override
        public boolean test(Dog dog) {
            return dog.getAge() > 9;
        }
    };

    iDog iDog_2 = dog -> dog.getAge() > 9;

    // Multiples statements
    iDog iDog_3 = dog -> {
        System.out.println("Este es el puto chucho " + dog);
        return dog.getAge() > 9;
    };
}
