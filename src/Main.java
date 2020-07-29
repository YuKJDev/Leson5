public class Main {
    public static void main(String[] args) {
        //* Создать массив из 5 сотрудников
        Person[] persArray = new Person[5];
        Person person1;

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                30000f, 30);
        persArray[1] = new Person("Petrov Petr", "Programmer", "petropet@mailbox.com", "892412010",
                25000f, 41);
        persArray[2] = new Person("Vasyn Vasiliy", "Motion designer", "vasya1234@mailbox.com", "89203223123",
                30000f, 40);
        persArray[3] = new Person("Bill Gates", "Director", "geek@outlook.com", "+15555555",
                1f, 64);
        persArray[4] = new Person("Putin Vladimir", "President", "putin@kremlin.ru", "[confindential]",
                1000000f, 67);
        // * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i < persArray.length; i++) {
            person1 = persArray[i];
            if (person1.getAge() > 40) {
                person1.person();
            }
        }
    }
}
