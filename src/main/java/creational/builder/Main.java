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

        Student2 student2 = new Student2.Builder()
                .setAddress("AP")
                .setAge(26)
                .setCollege("SVU")
                .setName("Mahesh").build();
        System.out.println(student2);


    }
}
