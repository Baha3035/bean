package kg.megacom.bean.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Product {
    @Autowired
    @Qualifier("getCharact")
    Characteristics characteristics;

    @Autowired
    @Qualifier("characteristicsServiceImpl2")
    CharacteristicsService characteristicsService;

    public Product(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public Product() {
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return "Product{" +
                "characteristics=" + characteristics +
                '}';
    }
}
