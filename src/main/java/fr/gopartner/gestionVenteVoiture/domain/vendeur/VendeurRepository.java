package fr.gopartner.gestionVenteVoiture.domain.vendeur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VendeurRepository extends JpaRepository<Vendeur,Long> {
    @Query(value = "SELECT t_vendeur.id, t_vendeur.nom, t_vendeur.prenom, t_vendeur.adresse, t_vendeur.salaire_fixe, t_vendeur.prime FROM t_vente,t_voiture,t_vendeur WHERE t_voiture.numero_serie = t_vente.voiture_num_serie AND t_vendeur.id=t_vente.vendeur_id AND t_voiture.prix-t_vente.prix >= ALL (SELECT  t_voiture.prix-t_vente.prix FROM t_voiture,t_vente WHERE t_voiture.numero_serie = t_vente.voiture_num_serie)", nativeQuery = true)
    Vendeur WorstVendeur();

}
