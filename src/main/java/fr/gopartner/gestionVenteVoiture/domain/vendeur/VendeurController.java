package fr.gopartner.gestionVenteVoiture.domain.vendeur;

import fr.gopartner.gestionVenteVoiture.VendeurApiDelegate;
import fr.gopartner.gestionVenteVoiture.model.VendeurDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendeurController implements VendeurApiDelegate {
    private final VendeurService vendeurService;
    private final VendeurMapper vendeurMapper;

    public VendeurController(VendeurService vendeurService, VendeurMapper vendeurMapper) {
        this.vendeurService = vendeurService;
        this.vendeurMapper = vendeurMapper;
    }

    @Override
    public ResponseEntity<VendeurDto> worstVendeur() {
        VendeurDto vendeurDto= vendeurMapper.toDto(vendeurService.worstVendeur());
        return new ResponseEntity<>(vendeurDto, HttpStatus.OK);
    }
}
