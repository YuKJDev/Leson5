public class Person {

    //  * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    private String fullName;
    private String position;
    private String email;
    private String tel;
    private double salary;
    private int age;

    // * Конструктор класса должен заполнять эти поля при создании объекта;
    Person(String fullName, String position, String email, String tel, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void person() {
        System.out.println(fullName + ", " + position + ", " + email + ", " + tel + ", " + salary +
                ", " + age);
    }

}
