package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.exception.RacingCarException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {
    @Test
    void create() {
        CarName carName = new CarName("abcde");
        assertThat(carName).isEqualTo(new CarName("abcde"));
    }

    @DisplayName("자동차 이름이 5글자를 초과할 경우 에러 발생")
    @Test
    void error() {
        assertThatThrownBy(() -> new CarName("abcdef")).isInstanceOf(RacingCarException.class);
    }
}