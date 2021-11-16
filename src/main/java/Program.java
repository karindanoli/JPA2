import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        Person p1 = new Person(null, "Carlos", "carlos@");
        Person p2 = new Person(null, "Maria", "carlos@");
        Person p3 = new Person(null, "Lucia", "carlos@");

        EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");//exemplo-jpa está no persitance.iml e instancia com as configuraçoes do persitance.iml
        EntityManager em = enf.createEntityManager(); // Implementa a conexão com o banco de dados e a persistancia implementada

       em.getTransaction().begin();//pra iniciar um transaçao com o banco de dados.
        //criar um banco de dados com as person

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit();//para confirmar as alteraçoes que eu fiz

        System.out.println("pronto");
        em.close();
        enf.close();


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
