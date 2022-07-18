package fr.gopartner.gestionVenteVoiture.domain.voiture;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class VoitureService {
    private final VoitureRepository voitureRepository;

    public VoitureService(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    public List<Voiture> getAllCarsSoldAfter(LocalDate date){
        return this.voitureRepository.getAllVoituresSoldAfter(date);
    }

    public Voiture getHighestEarningCar(){
        return this.voitureRepository.getHighestEarningCar();
    }
}
