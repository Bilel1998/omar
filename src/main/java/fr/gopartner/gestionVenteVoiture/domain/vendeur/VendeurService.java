package fr.gopartner.gestionVenteVoiture.domain.vendeur;

import org.springframework.stereotype.Service;

@Service
public class VendeurService {
    private final VendeurRepository vendeurRepository;

    public VendeurService(VendeurRepository vendeurRepository) {
        this.vendeurRepository = vendeurRepository;
    }

    public Vendeur worstVendeur(){
        return vendeurRepository.WorstVendeur();
    }
}
