class Scratch {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();

        cat.cats();
        dog.dogs();
    }
}

abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals{


    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {

    }
}

class Dogs extends Animals{


    @Override
    void cats() {

    }

    @Override
    void dogs() {
        System.out.println("Dogs bark");
    }
}