package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars = new ArrayList<>();

    public Cars(List<String> names) {
        names.forEach(name -> cars.add(new Car(name)));
    }

    public void attempt(MovingStrategy movingStrategy) {
        cars.forEach(car -> car.go(movingStrategy));
    }

    public List<Car> findWinners() {
        Score maxScore = maxScore();
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            addWinner(maxScore, winners, car);
        }
        return winners;
    }

    private void addWinner(Score maxScore, List<Car> winners, Car car) {
        if (car.isWinner(maxScore)) {
            winners.add(car);
        }
    }

    private Score maxScore() {
        Score maxScore = new Score();
        for (Car car : cars) {
            maxScore = car.maxScore(maxScore);
        }
        return maxScore;
    }
}
