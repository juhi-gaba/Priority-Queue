import java.util.*;


/**
 *
 * @author Juhi Gaba
 */
public class Priorities {

    /**
     * Priority queue.
     */
    private final PriorityQueue<Student> priorityQueue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getId)
    );

    /**
     * Get students.
     * @param events
     * @return
     */
    public List<Student> getStudents(List<String> events) {

        for (String event: events) {
            String split[] = event.split(" ");
            if (split[0].equals("ENTER")) {
                Student student = new Student(Integer.parseInt(split[3]), split[1], Double.parseDouble(split[2]));
                priorityQueue.add(student);
            } else {
                if (!priorityQueue.isEmpty()) {
                    priorityQueue.poll();
                }
            }
        }


        List<Student> unServedStudents = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            unServedStudents.add(priorityQueue.poll());
        }

        return unServedStudents;
    }
}
