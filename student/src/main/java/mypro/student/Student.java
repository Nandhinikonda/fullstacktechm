package mypro.student;
import jakarta.persistence.*;

@Entity
@Table(name="stud")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String department;
    private double per;

    // ✅ No-args constructor (Required by Hibernate)
    public Student() {
    }

    // ✅ Parameterized constructor
    public Student(String name, String department, double per) {
        this.name = name;
        this.department = department;
        this.per = per;
    }

    // ✅ Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public double getPer() { return per; }
    public void setPer(double per) { this.per = per; }
}
