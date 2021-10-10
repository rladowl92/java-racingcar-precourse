package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    @Test
    void create() {
        Cars cars = new Cars(Arrays.asList("pobi", "crong", "honux"));
        assertThat(cars).isEqualTo(new Cars(Arrays.asList("pobi", "crong", "honux")));
    }

    @DisplayName("우승자가 한명 이상 있어야한다.")
    @Test
    void getWinner() {
        Cars cars = new Cars(Arrays.asList("pobi", "crong", "honux"));
        cars.attempt(() -> true);
        assertThat(cars.findWinners()).isNotEmpty();
    }
}