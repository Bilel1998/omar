package fr.gopartner.gestionVenteVoiture.domain.vendeur;

import fr.gopartner.gestionVenteVoiture.model.VendeurDto;
import org.springframework.stereotype.Service;

@Service
public class VendeurMapper {

    public VendeurDto toDto(Vendeur vendeur){
        if(vendeur==null){
            return null;
        }
        VendeurDto vendeurDto= new VendeurDto();
        vendeurDto.setId(vendeur.getId());
        vendeurDto.setNom(vendeur.getNom());
        vendeurDto.setPrenom(vendeur.getPrenom());
        vendeurDto.setAdresse(vendeur.getAdresse());
        vendeurDto.setSalaire(vendeur.getSalaireFixe());
        vendeurDto.setPrime(vendeur.getPrime());
        return vendeurDto;
    }

    public Vendeur toVendeur(VendeurDto vendeurDto){
        if(vendeurDto==null){
            return null;
        }
        Vendeur vendeur= new Vendeur();
        vendeur.setId(vendeurDto.getId());
        vendeur.setNom(vendeurDto.getNom());
        vendeur.setPrenom(vendeurDto.getPrenom());
        vendeur.setAdresse(vendeurDto.getAdresse());
        vendeur.setSalaireFixe(vendeurDto.getSalaire());
        vendeur.setPrime(vendeurDto.getPrime());
        return vendeur;
    }
}
