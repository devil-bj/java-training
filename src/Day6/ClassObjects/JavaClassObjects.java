package Day6.ClassObjects;

public class JavaClassObjects {
    // this examples shows the multiple number of classes and their objects.
    public static void main(String []args) {
        Student student = new Student(); // instantiating object of the class.
        Teachers teachers = new Teachers();
        teachers.information();
        student.information();
    }
}
