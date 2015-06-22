package com.ninja_squad.geektic.model;

        import com.ninja_squad.geektic.service.Geek;
        import org.springframework.stereotype.Repository;import javax.persistence.EntityManager;
        import javax.persistence.PersistenceContext;
        import javax.persistence.PersistenceContexts;
        import java.util.ArrayList;
        import java.util.List;/**
 * Created by phil on 22/06/15.
 */
@Repository
public class GeekDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Geek> findBySexeAndInterest(String sexe, String interet){
        String query = "SELECT u FROM Geek u WHERE u.sexe = " + sexe + " ORDER BY u.nom";
        return entityManager.createQuery(query, Geek.class).getResultList();
    }
}