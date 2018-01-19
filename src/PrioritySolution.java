import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Priority Solution.
 * @author Juhi Gaba
 */
public class PrioritySolution {

    /**
     * Scanner to take input.
     */
    private final static Scanner scan = new Scanner(System.in);

    /**
     * Priorities instance.
     */
    private final static Priorities priorities = new Priorities();

    /**
     * Entry point.
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {

            System.out.println("EMPTY");

        } else {

            for (Student st: students) {

                System.out.println(st.getName());
            }
        }
    }
}
