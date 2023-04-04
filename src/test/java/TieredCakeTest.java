import org.example.tieredCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {


    tieredCake tieredcake;

    @BeforeEach
    void setUp(){
        tieredcake = new tieredCake("weddingCake", "strawberry" , 4 , true);

    }

    @Test
    void canGiveBakingTime(){
        String result = tieredcake.bakingTime();
        assertThat(result).isEqualTo("Bake the cake for 45-50 min");
    }








}
