package fr.gopartner.gestionVenteVoiture.domain.magasin;

import fr.gopartner.gestionVenteVoiture.model.MagasinDTO;
import org.springframework.stereotype.Service;

@Service
public class MagasinMapper {

    public MagasinDTO toDto(Magasin magasin){
        if(magasin==null){
            return null;
        }
        MagasinDTO magasinDTO= new MagasinDTO();
        magasinDTO.setId(magasin.getId());
        magasinDTO.setNom(magasin.getNom());
        magasinDTO.setAdresse(magasin.getAdresse());
        return magasinDTO;
    }
}
