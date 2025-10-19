public class CalcGPA {
    int lessons ;

    public CalcGPA(int lesson) {
        lessons = lesson;
    }

    public double calcGpa() {

        double totalcredits = 0;
        double totalweight = 0;
        for (int i = 1; i <= lessons; i++) {
            InputLessons input=new InputLessons();
            input.read(i,"Fenn ");
            double credits=input.read("Fennin crediti: ");
            double grade = input.read("Fennden alinan qiymet:");

            totalweight = totalweight + grade * credits;
            totalcredits = totalcredits + credits;

        }
        double gpa = totalweight / totalcredits;
        return gpa;

    }

}
