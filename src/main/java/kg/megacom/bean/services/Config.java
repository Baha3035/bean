package kg.megacom.bean.services;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "kg.megacom.bean")
public class Config {
    @Bean
    @Scope("prototype")
    public Characteristics getCharact() {
        return new Characteristics("Banana", 3456);
    }

    @Bean
    public String getName() {
        return "Pineapple";
    }

    @Bean
    public int getNum() {
        return 6785;
    }
}
