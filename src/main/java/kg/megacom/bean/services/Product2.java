package kg.megacom.bean.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Product2 {

    @Autowired
    @Qualifier("characteristicsServiceImpl2")
    CharacteristicsService characteristicsService;

    public Product2() {
    }

    @Override
    public String toString() {
        return "Product2{" +
                "characteristicsService=" + characteristicsService.getCharacteristics() +
                '}';
    }
}
