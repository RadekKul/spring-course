package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"soundsystem","not_scanned"})
//@ComponentScan(basePackageClasses = CDPlayer.class)
//@ComponentScan(value = "soundsystem")
public class CDPlayerConfig {
}
