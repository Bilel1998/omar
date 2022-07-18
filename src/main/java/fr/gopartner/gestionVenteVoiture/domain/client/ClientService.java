package fr.gopartner.gestionVenteVoiture.domain.client;

import fr.gopartner.gestionVenteVoiture.model.ClientDTO;
import org.springframework.stereotype.Service;

@Service

public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    public ClientService(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    public ClientDTO getBestClient(){
        Client client= clientRepository.getBestClient();
        return clientMapper.toDto(client);
    }
}
