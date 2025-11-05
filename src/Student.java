public class Student {
    private String name;
    private int age;
    private double grade;



    public Student(String name,int age, double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
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
        if (age<0||age>30){
            System.err.println("ты что-то перепутал");
            return;
        }
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade<0||grade>5){
            System.err.println("неправильно введена оценка");
            return;
        }
        this.grade = grade;
    }

    void getStudentInfo(){
        System.out.println(String.format("Студент %s, возраст: %d, оценка: %f",
                name,age,grade));
    }
}
