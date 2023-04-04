import org.example.cupCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupCakeTest {


    cupCake cupcake;

    @BeforeEach
    void setUp(){
        cupcake = new cupCake("butterfly", "vanilla","Sprinkles", false);
    }

    @Test
    void canGiveBakingTime(){
        String result = cupcake.bakingTime();
        assertThat(result).isEqualTo("Around 15 - 20 min");
    }

    @Test
    void canPeelCase(){
        assertThat(cupcake.peelCase()).isEqualTo("case has been peeled!");
    }





}
