package fr.gopartner.gestionVenteVoiture.domain.voiture;

import fr.gopartner.gestionVenteVoiture.VoitureApiDelegate;
import fr.gopartner.gestionVenteVoiture.model.VoitureDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController("/voiture")
public class VoitureController implements VoitureApiDelegate {
    private final VoitureService voitureService;
    private final VoitureMapper voitureMapper;

    public VoitureController(VoitureService voitureService, VoitureMapper voitureMapper) {
        this.voitureService = voitureService;
        this.voitureMapper = voitureMapper;
    }

    @Override
    public ResponseEntity<List<VoitureDto>> getAllCarsSoldAfter(LocalDate date) {
        List<VoitureDto> voitures= voitureService.getAllCarsSoldAfter(date).stream().map(voitureMapper::toDto).collect(Collectors.toList());
        return new ResponseEntity<>(voitures, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<VoitureDto> getHighestEarningCar() {
        VoitureDto voitureDto=voitureMapper.toDto(voitureService.getHighestEarningCar());
        return new ResponseEntity<>(voitureDto,HttpStatus.OK);
    }
}
