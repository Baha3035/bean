package kg.megacom.bean.services.impl;

import kg.megacom.bean.services.Characteristics;
import kg.megacom.bean.services.CharacteristicsService;
import org.springframework.stereotype.Service;

@Service
public class CharacteristicsServiceImpl implements CharacteristicsService {
    @Override
    public Characteristics getCharacteristics() {
        return new Characteristics("Watermelon", 5674);
    }
}
