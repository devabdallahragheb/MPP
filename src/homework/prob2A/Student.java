package homework.prob2A;

public class Student {
    private String Name;
    private String id;

    public Student( ) {
 this.gradeReport=new GradeReport(this);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public void setGradeReport(GradeReport gradeReport) {
        this.gradeReport = gradeReport;
    }

    private GradeReport gradeReport;

}
