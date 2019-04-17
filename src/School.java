public class School {
    private String name;
    private int sectionCount;
    private Section[] sections = new Section[200];

    public School(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }

    public Section[] getSections(){
        return this.sections;
    }

}
