package homework.prob2A;

public class GradeReport {
    private double result;
    private  String id;

    public GradeReport(Student stu) {
        this.stu = stu;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private  Student stu;

}
