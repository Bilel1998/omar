package fr.gopartner.gestionVenteVoiture.domain.magasin;

import fr.gopartner.gestionVenteVoiture.model.ProfitMagasin;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service

public class MagasinService {
    private final MagasinRepository magasinRepository;
    private final MagasinMapper magasinMapper;

    public MagasinService(MagasinRepository magasinRepository, MagasinMapper magasinMapper) {
        this.magasinRepository = magasinRepository;
        this.magasinMapper = magasinMapper;
    }

    public List<ProfitMagasin> getprofitMagasin(LocalDate startDate, LocalDate endDate) {
        List<Magasin> magasins = magasinRepository.findAll();
        List<ProfitMagasin> profitMagasinList = new ArrayList<>();
        magasins.forEach(magasin -> {
            ProfitMagasin profitMagasin = new ProfitMagasin();
            profitMagasin.setMagasin(magasinMapper.toDto(magasin));
            profitMagasin.setProfit(magasinRepository.profitMagasinBetweenTwoDates(startDate, endDate, magasin.getId()));
            profitMagasinList.add(profitMagasin);
        });
        return profitMagasinList;
    }
}
