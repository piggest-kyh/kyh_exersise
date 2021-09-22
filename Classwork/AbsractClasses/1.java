class Scratch {
    public static void main(String[] args) {


        FirstChild first = new FirstChild();
        SecondChild secondChild = new SecondChild();

        first.message();
        secondChild.message();
    }
}

abstract class Parent {
    abstract void message();
}

class FirstChild extends Parent{

    void message() {
System.out.println("This is first subclass");
    }
}

class SecondChild extends Parent{

    void message() {
        System.out.println("This is second subclass");
    }
}