import org.example.Cake;
import org.example.trayBake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {


    Cake cake;

    @BeforeEach
    void setUp(){
        cake = new trayBake("Vanilla Tray Bake" , "vanilla", "small", false);

    }

    @Test
    void canGiveBakingTime(){
        String result = cake.bakingTime();
        assertThat(result).isEqualTo("bake for around 25 - 30min");
    }








}
