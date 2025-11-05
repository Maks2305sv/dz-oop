public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("ошибка");
            return;
        }
        this.age = age;
    }

    void Introduce() {
        System.out.println(String.format(
                "Привет, меня зовут %s и мне %d лет",
                name, age
        ));
    }


}


