package mypro.jpademo;

import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager(); // Line 5
        em.getTransaction().begin();
        Employee emp1 = new Employee("Nandhini", "Training", 500);
        em.persist(emp1);
        em.getTransaction().commit();
        em.close();
        JPAUtil.close();
    }
}
