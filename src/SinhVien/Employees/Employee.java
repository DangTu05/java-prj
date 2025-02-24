//package Employees_new;
package Employees;

class Employee extends Person {
  private float salary;

  // Khoi tao khong co tham so
  public Employee() {
    super();
    salary = 0f;
  }

  // Phuong thuc khoi tao co tham so
  public Employee(String name, int age, float salary) {
    super(name, age);
    this.salary = salary;
  }

  // Phuong thuc truy nhap thuoc salary
  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  // Khai bao nap chong
  public void show() {
    System.out.println(getName() + " co tuoi la : " + getAge() +
        " Co luong la: " + salary + "/thang");
  }

  /* Phuong thuc tang luong */
  public void addSalary() {
    salary = salary * 1.5f;
  }

  public void addSalary(float addition) {
    salary += addition;
  }
}
