import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Student> students = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int skip = Integer.parseInt(scanner.next()) % 100;
            Student student = new Student(name, skip);
            students.add(student);
        }
        Student ans = null;
        while (students.size() != 1) {
            Student student = students.poll();
            for (int i = 0; i < student.skip - 1; i++) {
                students.add(students.poll());
            }
            students.poll();
        }
        System.out.println(students.poll().name);

    }

    static class Student {
        String name;
        int skip;

        public Student(String name, int skip) {
            this.name = name;
            this.skip = skip;
        }
    }
}