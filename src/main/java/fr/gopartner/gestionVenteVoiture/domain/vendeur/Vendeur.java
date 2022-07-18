package fr.gopartner.gestionVenteVoiture.domain.vendeur;

import fr.gopartner.gestionVenteVoiture.domain.client.Client;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_vendeur")
@Data
public class Vendeur extends Client {

    @Column(name = "salaire_fixe")
    private Float salaireFixe ;

    @Column(name = "prime")
    private Float prime ;
}
