import java.util.ArrayList;
import java.util.List;



public class main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        
        students.add(new Student(3, "sabrina", "214 Maple Street"));
        students.add(new Student(1, "Bob", "876 Oak Avenue"));
        students.add(new Student(5, "Charlie", "532 Pine Road"));
        students.add(new Student(4, "judy", "101 Birch Boulevard"));
        students.add(new Student(2, "Eve", "232 Elm Drive"));
        students.add(new Student(7, "Frank", "312 Ronaldo Lane"));
        students.add(new Student(6, "nick", "421 Walnut Way"));
        students.add(new Student(9, "Hannah", "453 Chestnut Street"));
        students.add(new Student(8, "Cyris", "865 Hickory Court"));
        students.add(new Student(10, "Jack", "753 medowood"));

        System.out.println("Original List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by name
        SelectionSort.selectionSort(students, new StudentComparators.SortByName());

        System.out.println("\nSorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by roll number
        SelectionSort.selectionSort(students, new StudentComparators.SortByRollno());

        System.out.println("\nSorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
