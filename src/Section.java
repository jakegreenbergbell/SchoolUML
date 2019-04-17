public class Section {
    private Teacher teacher;
    private Student[] sectionStudent = new Student[50];
    private int currentSize = 0;
    private String name;

    public Section(String name){
        this.name = name;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.sectionStudent;
    }

    public void addStudent(Student s){
        this.sectionStudent[currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String returner = "This " + this.name + " class is taught by " + this.teacher.name + " and has " + this.currentSize  + " students:";
        for(int i=0; i < this.currentSize; i++){
                returner  += " ";
                returner += sectionStudent[i].getName();
        }
        return returner;

    }
}
