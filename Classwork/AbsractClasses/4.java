class Scratch {
    public static void main(String[] args) {

        SubClass subClass = new SubClass();

        subClass.nonAbstractMethod();
        subClass.a_method();
    }
}

abstract class AbstractClass {
    AbstractClass(){
        System.out.println("This is constructor of abstract Class");
    }

    abstract void a_method();

    void nonAbstractMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}

class  SubClass extends AbstractClass{

    @Override
    void a_method() {
        System.out.println("This is abstract method");
    }
}