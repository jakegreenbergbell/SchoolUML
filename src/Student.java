public class Student extends Person {
    int grade;
    int sectionCount= 0;
    private Section[] studentSection = new Section[10];

    public Student(String name){
        super(name);
    }

    public void addSection(Section s){
        this.studentSection[sectionCount] = s;
        this.sectionCount++;
    }

    public Section[] getSection(){
        return this.studentSection;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }
}
