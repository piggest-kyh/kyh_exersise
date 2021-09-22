class Scratch {
    public static void main(String[] args) {

        Person pr = new Person("Denis", 1989);
        System.out.println(pr.toString());

        Student st = new Student("Bob", 1993, "Juridic");
        System.out.println(st.toString());

        Instructor inst = new Instructor("Anna", 1970, 10000);
        System.out.println(inst.toString());
    }

}

class Person{
    String name;
    Integer yearOfBirth;

    public Person(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String toString(){
        return ("The person name is " + name + " and year of birth is "+ yearOfBirth);
    }
}


class Student extends Person {

    String major;

    public Student(String name , int yearOfBirth, String major) {
        super(name , yearOfBirth);
        this.major = major;
    }

    @Override
    public String toString() {
        return (super.toString() + ". Person is a student with major "+ major);
    }
}

class Instructor extends Person{

    int salary;
    public Instructor(String name , int yearOfBirth, int salary ) {
        super(name , yearOfBirth);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return (super.toString() + ". Person is a instructor with salary = " +  salary);
    }
}