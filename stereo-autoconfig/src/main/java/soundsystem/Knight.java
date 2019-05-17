package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class Knight {

    private Sword sword;

    public Knight(Sword sword){
        this.sword = sword;
        System.out.println("Knight Constructor");
    }

    public Sword getSword() {
        return sword;
    }
}
