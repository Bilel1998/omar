package fr.gopartner.gestionVenteVoiture.domain.magasin;

import fr.gopartner.gestionVenteVoiture.model.ProfitMagasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface MagasinRepository  extends JpaRepository<Magasin,Long> {

    @Query(value = "SELECT sum(t_vente.prix-t_voiture.cout) FROM  t_magasin,t_vente,t_voiture WHERE t_voiture.magasin_id=t_magasin.id AND t_voiture.numero_serie=t_vente.voiture_num_serie AND t_vente.date BETWEEN ?1 AND ?2 AND t_magasin.id= ?3 GROUP BY t_magasin.id,t_magasin.nom, t_magasin.adresse;",nativeQuery = true)
    Float profitMagasinBetweenTwoDates(LocalDate d1, LocalDate d2, Long idMagasin);



}
