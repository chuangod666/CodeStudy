package jicheng.duotai;

public class Test {
    public static void main(String[] args) {
         Administrator admin = new Administrator();
         Student student = new Student();
         Teacher teacher = new Teacher();
         student.setName("a");
         teacher.setName("n");
         admin.setName("s");
         student.setAge(18);
         teacher.setAge(28);
         admin.setAge(38);

         register(student);
         register(teacher);
         register(admin);
    }

    public static void register(Person p) {
       p.getMessage();
    }
}
