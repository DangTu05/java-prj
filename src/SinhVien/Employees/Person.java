//package Employes;
package Employees;

class Person extends Human{
    public String  name;
    public int age;
    //phuong thuc khoi tao khong co tham so
    public Person() {
       super();
       name = "";
       age = 0;
    }
    // Phwowng thuc khoi tao co tham so
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
// Phuong thuc truy nhap thuoc tinh name and age 
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Phuong thuc khai bao nap chong
    public void show()
    {
       System.out.println(name +  " da "  +  age  + " tuoi duong lich");
    }      
    }
