import org.example.Bakery;
import org.example.Cake;
import org.example.cupCake;
import org.example.tieredCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {


    Bakery bakery;

    @BeforeEach
    void setUp(){
        bakery = new Bakery();
    }

    @Test
    void canCountCakes(){
        assertThat(bakery.countCakes()).isEqualTo(0);
    }

    @Test
    void canAddCakes(){
        Cake cake1 = new cupCake("heartCake", "redVelvet" , "nutella", true);
        Cake cake2 = new cupCake("classicCake", "Victoria sponge", "buttercream", true);
        cupCake cupcake1 = new cupCake("butterfly", "vanilla","Sprinkles", false);
        tieredCake tieredcake1 = new tieredCake("weddingCake", "strawberry" , 4 , true);
        bakery.addCake(cake1);
        bakery.addCake(cake2);
        bakery.addCake(cupcake1);
        bakery.addCake(tieredcake1);
        assertThat(bakery.countCakes()).isEqualTo(4);
    }








}
