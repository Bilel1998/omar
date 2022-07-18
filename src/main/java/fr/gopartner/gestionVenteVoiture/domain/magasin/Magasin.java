package fr.gopartner.gestionVenteVoiture.domain.magasin;

import fr.gopartner.gestionVenteVoiture.domain.voiture.Voiture;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_magasin")
@Data
public class Magasin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom ;

    @Column(name = "adresse")
    private String adresse ;

    @OneToMany(mappedBy = "magasin",cascade = CascadeType.REMOVE)
    private List<Voiture> voitures;

}
