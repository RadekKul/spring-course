package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class Castle implements House {

    private Knight knight;

    public Castle(Knight knight){
        this.knight = knight;
        System.out.println("Castle Constructor");
    }

    public Knight getKnight() {
        return knight;
    }
}
