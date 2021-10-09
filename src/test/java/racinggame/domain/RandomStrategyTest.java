package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

class RandomStrategyTest {
    @DisplayName("랜덤 값은 0-9 사이의 값이어야한다.")
    @RepeatedTest(10)
    void getRandomInt_range() {
        RandomStrategy randomState = new RandomStrategy();
        assertThat(randomState.getRandomInt()).isBetween(0, 9);
    }
}