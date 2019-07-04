package lambdas;

public class DogsPlay {

    iDog iDog;

    public DogsPlay(lambdas.iDog iDog) {
        this.iDog = iDog;
    }

    public boolean doQuery(Dog dog){
        return iDog.test(dog);
    }
}
