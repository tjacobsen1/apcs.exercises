public class GPA {

    public static void main(String[]args) {
        String name1 = "Alice";
        String name2 = "Bob";
        int gradeLevel = 9;

        Student student = new Student("Alice", 9);
        Student student2 = new Student("Bob", 12);
        double gpa = student.calculateGPA();
        System.out.println(gpa);

        gpa = student2.calculateGPA;

        String name = student.getName();
        System.out.println(name);
        
        student.gradeLevel(11);
    }
}