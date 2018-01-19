/**
 * @author Juhi Gaba
 */
public class Student {

    /**
     * Id of the student.
     */
   private int id;

    /**
     * Name of the student.
     */
   private String name;

    /**
     * CGPA of the student.
     */
   private double CGPA;

    /**
     * Constructor for Student class.
     * @param id    Id of the student.
     * @param name  Name of the student.
     * @param CGPA  CGPA of the student.
     */
    public Student(int id, String name, double CGPA) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public double getCGPA() {
        return CGPA;
    }
}
