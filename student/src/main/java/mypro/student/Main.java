package mypro.student;
import jakarta.persistence.EntityManager;
import mypro.student.Student;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager(); // Line 5
        em.getTransaction().begin();
        Student std1 = new Student("Nandhini", "ECE", 85);
        em.persist(std1);
        em.getTransaction().commit();
        em.close();
        JPAUtil.close();
    }
}