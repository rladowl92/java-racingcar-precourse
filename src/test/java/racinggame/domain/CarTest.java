package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    void create() {
        Car car = new Car("edge");
        assertThat(car).isEqualTo(new Car("edge"));
    }

    @DisplayName("이동에 성공하면 score가 1 올라가야한다.")
    @Test
    void go() {
        Car car = new Car("edge");
        car.go(() -> true);
        assertThat(car.getScore()).isEqualTo(1);
    }

    @DisplayName("이동에 실패하면 score가 올라가지 않는다.")
    @Test
    void stop() {
        Car car = new Car("edge");
        car.go(() -> false);
        assertThat(car.getScore()).isEqualTo(0);
    }

    @DisplayName("maxScore와 같으면 우승")
    @Test
    void isWinner() {
        Car car = new Car("edge");
        car.go(() -> true);
        assertThat(car.isWinner(new Score(1))).isTrue();
    }

    @DisplayName("현재 스코어가 전달받은 스코어보다 더 크다면 현재 스코어를 maxScore로 반환한다.")
    @Test
    void maxScore() {
        Car car = new Car("edge");
        car.go(() -> true);
        assertThat(car.maxScore(new Score(0))).isEqualTo(new Score(1));
    }
}