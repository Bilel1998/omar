package fr.gopartner.gestionVenteVoiture.domain.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query(value = "SELECT V.id, V.nom, V.prenom, V.adresse , Max(gain) FROM( SELECT t_client.id, t_client.nom, t_client.prenom, t_client.adresse , sum(t_vente.prix-t_voiture.cout) as gain FROM t_vente , t_voiture  , t_client WHERE t_vente.client_id= t_client.id AND t_vente.voiture_num_serie= t_voiture.numero_serie GROUP BY t_client.id ) AS V GROUP BY V.id", nativeQuery = true)
    Client getBestClient();
}
