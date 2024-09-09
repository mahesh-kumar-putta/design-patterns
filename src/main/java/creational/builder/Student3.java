package creational.builder;

public class Student3 {

    private String name;

    private String address;

    private String college;

    private int age;

    public static Builder getBuilder(){
        return new Builder();
    }

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
        private Student3 student3;

        public Builder(){
            student3 = new Student3();
        }


        public Builder setName(String name) {
            student3.name = name;
            return this;
        }


        public Builder setAddress(String address) {
            student3.address = address;
            return this;
        }


        public Builder setCollege(String college) {
            student3.college = college;
            return this;
        }


        public Builder setAge(int age) {
            student3.age = age;
            return this;
        }

        public Student3 build(){
             return student3;
        }
    }
}
