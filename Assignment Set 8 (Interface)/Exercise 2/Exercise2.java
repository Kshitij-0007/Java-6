/*
   	- Define an interface Person having method speak() . 
	- Define another interface student extends person which is having method study().
    - Define a class CollegeStudent implements student.
    - Create an object in the main method and call both methods.
 */
interface Person {

    void speak();
}

interface Student extends Person {

    void study();
}

class CollegeStudent implements Student {

    @Override
    public void study() {
        System.out.println("The Student is studying");
    }

    @Override
    public void speak() {
        System.out.println("The Student is speaking");
    }
}

public class Exercise2 {

    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();

        s.speak();
        s.study();
    }
}
