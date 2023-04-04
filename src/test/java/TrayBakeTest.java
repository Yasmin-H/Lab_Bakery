import org.example.trayBake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrayBakeTest {



    trayBake traybake;


    @BeforeEach
    void setUp(){
        traybake = new trayBake("brownies", "chocolate", "medium", false);
    }


    @Test
    void canGiveBakingTime(){
        String result = traybake.bakingTime();
        assertThat(result).isEqualTo("bake for around 25 - 30min");
    }

    @Test
    void sliceUp(){
        assertThat(traybake.sliceUp()).isEqualTo("they have been sliced!");
    }


}
