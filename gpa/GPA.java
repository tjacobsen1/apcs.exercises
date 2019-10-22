public class GPA {

    public static void main(String[]args) {


        Student student = new Student("Alice", 9);

        student.setMathScore("A");
        Student student2 = new Student("Bob", 12);
        double gpa = student.calculateGPA();
        System.out.println(gpa);

        gpa = student2.calculateGPA;

        String name = student.getName();
        System.out.println(name);
        
        student.gradeLevel(11);
    }
}