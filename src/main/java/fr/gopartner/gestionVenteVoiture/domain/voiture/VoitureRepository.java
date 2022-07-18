package fr.gopartner.gestionVenteVoiture.domain.voiture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> {

    @Query(value="SELECT t_voiture.numero_serie , t_voiture.couleur , t_voiture.prix, t_voiture.cout,t_voiture.marque, t_voiture.modele , t_voiture.magasin_id FROM t_voiture , t_vente WHERE t_voiture.numero_serie = t_vente.voiture_num_serie AND date >  ?1",nativeQuery = true)
    List<Voiture> getAllVoituresSoldAfter(LocalDate date);


    @Query(value = "SELECT t_voiture.numero_serie , t_voiture.couleur , t_voiture.prix, t_voiture.cout,t_voiture.marque, t_voiture.modele , t_voiture.magasin_id FROM t_voiture,t_vente WHERE t_voiture.numero_serie = t_vente.voiture_num_serie AND (t_vente.prix-t_voiture.cout) >= ALL (SELECT t_vente.prix-t_voiture.cout FROM t_voiture,t_vente WHERE t_voiture.numero_serie = t_vente.voiture_num_serie)", nativeQuery = true)
    Voiture getHighestEarningCar();




}
