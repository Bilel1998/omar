package fr.gopartner.gestionVenteVoiture.domain.magasin;

import fr.gopartner.gestionVenteVoiture.ProfitMagasinApi;
import fr.gopartner.gestionVenteVoiture.ProfitMagasinApiDelegate;
import fr.gopartner.gestionVenteVoiture.model.ProfitMagasin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class MagasinController  implements ProfitMagasinApiDelegate {
    private final MagasinService magasinService;

    public MagasinController(MagasinService magasinService) {
        this.magasinService = magasinService;
    }

    @Override
    public ResponseEntity<List<ProfitMagasin>> getprofitMagasin(LocalDate startDate, LocalDate endDate) {
        List<ProfitMagasin> profitMagasinList= magasinService.getprofitMagasin(startDate,endDate);
        return new ResponseEntity<>(profitMagasinList, HttpStatus.OK);
    }
}
