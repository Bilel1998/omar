package fr.gopartner.gestionVenteVoiture.domain.voiture;

import fr.gopartner.gestionVenteVoiture.model.VoitureDto;
import org.springframework.stereotype.Service;

@Service
public class VoitureMapper {

    public VoitureDto toDto(Voiture voiture){
        if(voiture==null){
            return null;
        }
        VoitureDto voitureDto= new VoitureDto();
        voitureDto.setNumSerie(voiture.getNumSerie());
        voitureDto.setCouleur(voiture.getCouleur());
        voitureDto.setCout(voiture.getCout());
        voitureDto.setModele(voiture.getModele());
        voitureDto.setPrix(voiture.getPrix());
        return voitureDto;
    }

    public Voiture toVoiture(VoitureDto voitureDto){
        if(voitureDto==null){
            return null;
        }
        Voiture voiture=new Voiture();
        voiture.setNumSerie(voitureDto.getNumSerie());
        voiture.setCouleur(voitureDto.getCouleur());
        voiture.setCout(voitureDto.getCout());
        voiture.setModele(voitureDto.getModele());
        voiture.setPrix(voitureDto.getPrix());
        return voiture;
    }
}
