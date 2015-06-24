package com.ninja_squad.geektic.dao;

        import com.ninja_squad.geektic.model.Audit;
        import com.ninja_squad.geektic.model.DetailsGeek;
        import com.ninja_squad.geektic.model.Geek;
        import com.ninja_squad.geektic.model.Interet;
        import org.springframework.stereotype.Repository;import javax.persistence.EntityManager;
        import javax.persistence.PersistenceContext;
        import javax.persistence.TypedQuery;
        import java.util.Date;
        import java.util.List;/**
 * Created by phil on 22/06/15.
 */
@Repository
public class GeekDao {
    @PersistenceContext
    private EntityManager entityManager;


    //Requete de recherche par sexe et interet
    public List<Geek> findBySexeAndInterest(String sexe, int interet){
        String reqSexeInteret = "SELECT g FROM Geek g JOIN g.lesInterets i WHERE g.sexe = :sexe AND i.id = :interet ORDER BY g.nom";
        TypedQuery<Geek> resultReq = entityManager.createQuery(reqSexeInteret, Geek.class); resultReq.setParameter("sexe", sexe).setParameter("interet", interet);
        return resultReq.getResultList();
    }

    //Requete qui recupere un geek
    //Plus utilisé mais testé
    public Geek findById(int id) {
        String reqUtilisateur = "SELECT g FROM Geek g WHERE g.id = :id ORDER BY g.nom";
        TypedQuery<Geek> resultReq = entityManager.createQuery(reqUtilisateur, Geek.class).setParameter("id", id);
        return resultReq.getResultList().get(0);
    }

    //Requete qui recupere un geek et le nombre de vu de son profil (DetailsGeek)
    public DetailsGeek findByIdDetail(int id) {
        String reqGeek = "SELECT g FROM Geek g WHERE g.id = :id ORDER BY g.nom";
        String reqVu = "SELECT count(a) FROM Audit a WHERE a.unGeek.id = :id";

        TypedQuery<Geek> resultReqGeek = entityManager.createQuery(reqGeek, Geek.class).setParameter("id", id);
        TypedQuery<Long> resultReqVu = entityManager.createQuery(reqVu, Long.class).setParameter("id", id);
        //Conversion resultat de long a int
        Integer test = resultReqVu.getResultList().get(0).intValue();
        //Création d'un DetailsGeek avec un Geek et son nombre de vu
        DetailsGeek detailsGeek = new DetailsGeek(resultReqGeek.getResultList().get(0), test);
        return detailsGeek;
    }

    //Retourne la list des interets
    public List<Interet> interets() {
        String reqInterets = "SELECT i FROM Interet i";
        TypedQuery<Interet> resultReq = entityManager.createQuery(reqInterets, Interet.class);
        return resultReq.getResultList();
    }

    //Insertion d'une ligne dans la talbe Audit a chaque visite de profil
    public void visite(int id, String ip) {
        //Appel de la methode findById pour retourner un Geek
        Geek leGeek = findById(id);
        //Recuperation de la Date
        String uneDate = new Date().toString();
        //Création d'un objet audit
        Audit unAudit = new Audit(uneDate, ip, leGeek);
        //Insertion de l'objet Audit dans la base en persistant l'objet
        entityManager.persist(unAudit);
    }
}