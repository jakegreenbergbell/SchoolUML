public class Teacher extends Person {
    private String subject;
    private int sectionCount = 0;
    private Section[] teacherSection = new Section[10];

    public Teacher(String name){
        super(name);
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public Section[] getSection(){
        return this.teacherSection;
    }

    public void addSection(Section s){
      this.teacherSection[sectionCount] = s;
      sectionCount++;
    }
}
