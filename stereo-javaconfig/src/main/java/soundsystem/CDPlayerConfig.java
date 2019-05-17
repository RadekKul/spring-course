package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class CDPlayerConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Plant forEliza(){
        return new Flower();
    }

//
//    @Bean
//    public MediaPlayer cdPlayer() {
//        return new CDPlayer(compactDisc());
//    }
//
    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactD) {
        return new CDPlayer(compactD);
    }

    @Bean
    @Qualifier("tulia")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public eMusic tuliaMusic() {
        System.out.println("tuliaMusic()");
        return new Tulia();
    }

    @Bean
    @Qualifier("eMusic")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public eMusic eMusic() {
        return new MyMP3();
    }

    @Bean
    public ePlayer ePlayer() {
        return new Phone(eMusic());
    }
}
