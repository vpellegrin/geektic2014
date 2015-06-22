package com.ninja_squad.geektic.model;

        import com.ninja_squad.geektic.service.Geek;
        import com.ninja_squad.geektic.service.Interet;
        import org.springframework.stereotype.Repository;import javax.persistence.EntityManager;
        import javax.persistence.PersistenceContext;
        import javax.persistence.PersistenceContexts;
        import javax.persistence.TypedQuery;
        import java.util.ArrayList;
        import java.util.List;/**
 * Created by phil on 22/06/15.
 */
@Repository
public class GeekDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Geek> testestestest(String sexe, String interet){
        String query = "SELECT g FROM Geek g WHERE g.sexe = :sexe ORDER BY g.nom";
        TypedQuery<Geek> query1 = entityManager.createQuery(query, Geek.class); query1.setParameter("sexe", sexe);
        return query1.getResultList();
    }

    public List<Geek> findBySexeAndInterest(String sexe, int interet){
        String query = "SELECT g FROM Geek g JOIN g.lesInterets i WHERE g.sexe = :sexe AND i.id = :interet ORDER BY g.nom";
        TypedQuery<Geek> query1 = entityManager.createQuery(query, Geek.class); query1.setParameter("sexe", sexe).setParameter("interet", interet);
        return query1.getResultList();
    }

    public Geek findById(int id) {
        String query = "SELECT g FROM Geek g WHERE g.id = :id ORDER BY g.nom";
        TypedQuery<Geek> query2 = entityManager.createQuery(query, Geek.class); query2.setParameter("id", id);
        return query2.getResultList().get(0);
    }

    public List<Interet> interets() {
        String query = "SELECT i FROM Interet i";
        TypedQuery<Interet> query3 = entityManager.createQuery(query, Interet.class);
        return query3.getResultList();
    }
}