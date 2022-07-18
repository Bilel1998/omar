package fr.gopartner.gestionVenteVoiture.domain.client;

import fr.gopartner.gestionVenteVoiture.model.ClientDTO;
import liquibase.pro.packaged.C;
import org.springframework.stereotype.Service;

@Service

public class ClientMapper {

    public ClientDTO toDto(Client client){
        if(client==null){
            return null;
        }
        ClientDTO clientDTO=new ClientDTO();
        clientDTO.setId(client.getId());
        clientDTO.setNom(client.getNom());
        clientDTO.setPrenom(client.getPrenom());
        clientDTO.setAdresse(client.getAdresse());
        return clientDTO;
    }
}
