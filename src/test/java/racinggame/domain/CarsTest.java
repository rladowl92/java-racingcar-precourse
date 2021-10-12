package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    @Test
    void create() {
        Cars cars = new Cars(Arrays.asList("pobi", "crong", "honux"));
        assertThat(cars).isEqualTo(new Cars(Arrays.asList("pobi", "crong", "honux")));
    }

    @DisplayName("honux가 우승해야한다.")
    @Test
    void getWinner() {
        Cars cars = new Cars(Arrays.asList("pobi", "crong", "honux"), Arrays.asList(1, 2, 3));
        assertThat(cars.findWinners()).isEqualTo(Collections.singletonList(new Car("honux", 3)));
    }
}