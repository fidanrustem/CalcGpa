public class Main {
    public static void main(String[] args) {
        Input lessons = new Input();
        int lesson=lessons.read("Fennlerin sayini daxil edin: ",0);
        CalcGPA gpa= new CalcGPA(lesson);
        double GPA=gpa.calcGpa();
        System.out.println("GPA: "+GPA);
    }
} 