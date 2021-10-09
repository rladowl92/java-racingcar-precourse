package racinggame.domain;

import java.util.Objects;

public class Car {
    private int score;
    private CarName name;

    Car(String name) {
        this.name = new CarName(name);
        score = 0;
    }

    public void go(MovingStrategy moveState) {
        if (moveState.isMovable()) {
            addScore();
        }
    }

    private void addScore(){
        this.score++;
    }

    public String getName() {
        return name.getName();
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return score == car.score &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name);
    }
}
