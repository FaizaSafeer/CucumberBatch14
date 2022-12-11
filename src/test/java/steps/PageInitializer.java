package steps;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeListPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static AddEmployeePage addEmployee;
    public static DashboardPage dashboard;
    public static EmployeeListPage employeeList;
    public static void intializePageObjects(){
        login = new LoginPage();
        dashboard=new DashboardPage();
        addEmployee =new AddEmployeePage();
    employeeList=new EmployeeListPage();
    }
}
