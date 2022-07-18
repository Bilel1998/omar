package fr.gopartner.gestionVenteVoiture.domain.client;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_client")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom ;

    @Column(name = "prenom")
    private String prenom ;

    @Column(name = "adresse")
    private String adresse ;






}
