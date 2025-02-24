//package Employes;
package Employees;

class EmployeeMain {

    public static void main(String args[]) {
        // Su dung lop person
        Person myperson = new Person("HVNH", 25);
        myperson.show();
        Employee newEmployee = new Employee("Tran Anh Hoang", 31, 300f);
        newEmployee.show();
        // tang luong theo mac dinh
        newEmployee.addSalary();
        newEmployee.show();
        /// tang luong len 50$
        newEmployee.addSalary(50f);
        newEmployee.show();
        /// tang luong len 500$
        newEmployee.addSalary(500f);
        newEmployee.show();
    }
}
