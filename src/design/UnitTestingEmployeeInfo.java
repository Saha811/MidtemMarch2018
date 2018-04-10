package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(100000,7), 100000);
        Assert.assertEquals(EmployeeInfo.calculateEmployeePension(7000000), 700000.0);


        //Write Unit Test for all the methods has been implemented in this package.

        Assert.assertEquals(10000,200000000);

    }
}
