package fr.gopartner.gestionVenteVoiture.domain.client;

import fr.gopartner.gestionVenteVoiture.BestClientApiDelegate;
import fr.gopartner.gestionVenteVoiture.model.ClientDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ClientController implements BestClientApiDelegate {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @Override
    public ResponseEntity<ClientDTO> getBestClient() {
        ClientDTO clientDTO= clientService.getBestClient();
        return new ResponseEntity<>(clientDTO, HttpStatus.OK);
    }
}
