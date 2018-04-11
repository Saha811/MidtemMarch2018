package parser;
import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        Student student = new Student();

        Assert.assertEquals(student.getFirstName(), "Lebron" );
        Assert.assertEquals(student.getLastName(), "Kobe");



        //Apply Unit Test into all the methods in this package.

    }
}
