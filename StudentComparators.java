import java.util.Comparator;

public class StudentComparators {

    public static class SortByName implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.getName().compareTo(b.getName());
        }
    }

    public static class SortByRollno implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Integer.compare(a.getRollno(), b.getRollno());
        }
    }
}
