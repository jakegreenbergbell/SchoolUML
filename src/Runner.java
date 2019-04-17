public class Runner {

    public static void main(String[] args) {
        School SCHOOL =new School("Berkeley High");
        Section math = new Section("Math");
        Section bio = new Section("Biology");
        Section compSci = new Section("Computer Science");
        Teacher albi = new Teacher("Albi");
        Teacher teacher1 = new Teacher("Teacher2");
        Teacher teacher2 = new Teacher("Teacher3");
        Student me = new Student("Me");
        Student friend1 = new Student("Friend 1");
        Student friend2 = new Student("Friend 2");
        Student friend3 = new Student("Friend 3");
        Student friend4 = new Student("Friend 4");
        Student friend5 = new Student("Friend 5");

        math.setTeacher(albi);
        bio.setTeacher(teacher1);
        compSci.setTeacher(teacher2);
        math.addStudent(me);
        math.addStudent(friend1);
        compSci.addStudent(friend2);
        compSci.addStudent(friend3);
        bio.addStudent(friend4);
        bio.addStudent(friend5);

        System.out.print(compSci.toString());
    }

}
