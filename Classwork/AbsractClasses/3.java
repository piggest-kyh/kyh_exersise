class Scratch {
    public static void main(String[] args) {
        A a = new A(99,45,38);
        B b = new B(34,21,56,23);

        System.out.println(a.getPercentage() + b.getPercentage());
    }

}

abstract class Marks{
    abstract String getPercentage();
}

class A extends Marks {

    int sub1;
    int sub2;
    int sub3;

    public A (int sub1, int sub2, int sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    

    @Override
    String getPercentage() {
        int percentage = (sub1 + sub2 + sub3) / 3;
        return ("Percentage of marks for student A is " + percentage + "%\n");
    }
}

class B extends Marks {

    int sub1;
    int sub2;
    int sub3;
    int sub4;

    public B (int sub1, int sub2, int sub3, int sub4){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    String getPercentage() {
        int percentage = (sub1 + sub2 + sub3+sub4) / 4;
        return ("Percentage of marks for student B is " + percentage + "%\n");
    }
}

