package fr.gopartner.gestionVenteVoiture.domain.voiture;

import fr.gopartner.gestionVenteVoiture.domain.magasin.Magasin;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_voiture")
@Data
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_serie")
    private Long numSerie;

    @Column(name = "couleur")
    private String couleur ;

    @Column(name = "prix")
    private Float prix ;

    @Column(name = "cout")
    private Float cout ;

    @Column(name = "marque")
    private String marque ;

    @Column(name = "modele")
    private String modele ;

    @ManyToOne
    @JoinColumn(name = "magasin_id")
    private Magasin magasin;

}
