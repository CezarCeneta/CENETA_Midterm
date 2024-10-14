//Base Class for the subclasses Student and Instructor
class Person {
    String name;
    int age;

    //Constructor for the Person base class
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method for displaying the Name and Age
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + "yrs old");
    }
}

//Subclass and implement to the base class Person
class Student extends Person {
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;

    //Constructor for the Student subclass
    Student(String name, int age, String studentID, String course, int units) {
        super(name, age); //Calls the base class constructor
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    //Method for calculating the total fee based from amount units and fee per unit
    double calculateFees() {
        return units * feePerUnit; 
    }

    @Override //Override the base class method and input the subclass parameters to be displayed
    void displayInfo() {
        System.out.println("Student Name: " + name + "\nAge: " + age + "yrs old" +   "\nStudent ID: " + studentID + "\nCourse: " + course + "\nUnits: " + units + "\nTotal Fee: P " + calculateFees() + " Pesos" + "\n");
    }
}

//Subclass and inherit to the base class Person
class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

    //Constructor for the Instructor sub-class
    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); //Calls the base class constructo
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    @Override //Override the base class method and add the subclass parameters to be displayed
    void displayInfo() {
        System.out.println("Instructor Name: " + name + "\nAge: " + age + "yrs old" + " \nEmployee ID: " + employeeID + "\nDepartment: " + department + "\nSalary: " + salary + " Pesos" + "\n");
    }
}

public class UniversityEnrollmentSystem {
    //Method for displaying the details of the Person base class
    static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {

        //Calling out the classes with implements for the methods 
        Student student1 = new Student("John Cezar Ceneta", 20, "231000322", "Computer Engineering", 4);
        Student student2 = new Student("John Benedict", 19, "231001730", "Computer Science", 5);
        Instructor instructor1 = new Instructor("Mrs. Sarahlyn", 45, "E001", "Physics", 75000);
        Instructor instructor2 = new Instructor("Ms. Tanya Carmela", 22, "E002", "Data Structure and Algorithms", 100000);
        
        //Displaying the details with the implemented arguments by the set subclasses students and instructors
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}
