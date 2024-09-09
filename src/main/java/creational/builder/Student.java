package creational.builder;

public class Student {

    private String name;

    private String address;

    private String college;

    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", college='" + college + '\'' +
                ", age=" + age +
                '}';
    }

    public static class StudentBuilder{
        private String name;

        private String address;

        private String college;

        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCollege() {
            return college;
        }

        public void setCollege(String college) {
            this.college = college;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Student build(){
            Student student = new Student();
            student.address = this.address;
            student.name = this.name;
            student.age = age;
            student.college = college;
            return student;
        }
    }
}
