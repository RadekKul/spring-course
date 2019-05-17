package soundsystem;

import not_scanned.Vehicle;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Autowired
    private Animal myPet;

    @Autowired
    private Animal maybeDog;

    @Autowired
    private Vehicle car;

    @Autowired
    private Castle myCastle;


    @Test
    public void castleAndKnightTest(){
        assertNotNull(myCastle);
        assertNotNull(myCastle.getKnight());
        assertNotNull(myCastle.getKnight().getSword());
    }

    @Test
    public void carTest(){
        assertNotNull(car);
    }

    @Test
    public void isAnimalTheSame(){
        System.out.println(myPet==maybeDog);
    }

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);

//        cd.play();
    }

    @Test
    public void play() {
        player.play();
//        assertEquals(
//                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n".trim(),
//                log.getLog().trim());
    }

}
