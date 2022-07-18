package fr.gopartner.gestionVenteVoiture.domain.vente;

import fr.gopartner.gestionVenteVoiture.domain.client.Client;
import fr.gopartner.gestionVenteVoiture.domain.vendeur.Vendeur;
import fr.gopartner.gestionVenteVoiture.domain.voiture.Voiture;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "t_vente")
@Data
public class Vente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "voiture_num_serie")
    private Voiture voiture;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "vendeur_id")
    private Vendeur vendeur;

    @Column(name = "date")
    private LocalDate date ;

    @Column(name = "prix")
    private Float prix;

}
