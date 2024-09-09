package creational.builder;

public class Student2 {

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

    public static class Builder{
        private String name;

        private String address;

        private String college;

        private int age;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getCollege() {
            return college;
        }

        public Builder setCollege(String college) {
            this.college = college;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student2 build(){
            Student2 student = new Student2();
            student.address = this.address;
            student.name = this.name;
            student.age = age;
            student.college = college;
            return student;
        }
    }
}
