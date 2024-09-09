package creational.builder;

public class Main {
    public static void main(String[] args) {
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder();
        studentBuilder.setAddress("AP");
        studentBuilder.setAge(26);
        studentBuilder.setCollege("SVU");
        studentBuilder.setName("Mahesh");

        Student student = studentBuilder.build();
        System.out.println(student);
    }
}
