import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {


        EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");//exemplo-jpa está no persitance.iml e instancia com as configuraçoes do persitance.iml
        EntityManager em = enf.createEntityManager(); // Implementa a conexão com o banco de dados e a persistancia implementada

      Person p = em.find(Person.class,2);//pesquisa em banco de dados, instanciar o objeto ao msm tempo.
        em.getTransaction().begin();
        em.remove(p);//remove
        em.getTransaction().commit();


        System.out.println("pronto");
        em.close();
        enf.close();

    }
}
