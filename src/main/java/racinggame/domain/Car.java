package racinggame.domain;

import java.util.Objects;

public class Car {
    private Score score;
    private CarName name;

    Car(String name) {
        this.name = new CarName(name);
        score = new Score();
    }

    public void go(MovingStrategy moveState) {
        if (moveState.isMovable()) {
            score.addScore();
        }
    }

    public Score maxScore(Score maxScore) {
        if (maxScore.lessThan(maxScore)) {
            return maxScore;
        }
        return score;
    }

    public boolean isWinner(Score winScore) {
        return winScore.isSameScore(winScore);
    }

    public String getName() {
        return name.getName();
    }

    public int getScore() {
        return score.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(score, car.score) &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name);
    }
}
