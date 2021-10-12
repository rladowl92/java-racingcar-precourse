package racinggame;

import racinggame.domain.Cars;
import racinggame.domain.RandomStrategy;
import racinggame.exception.RacingCarException;
import racinggame.view.InputView;
import racinggame.view.OutputView;

import java.util.Objects;

public class Application {
    private static final InputView inputView = new InputView();

    public static void main(String[] args) {
        Cars cars = getCars();
        int numberOfAttempts = getNumberOfAttempts();
        printResult(cars, numberOfAttempts);
    }

    private static Cars getCars() {
        Cars cars;
        do {
            cars = tryInputCarNames();
        } while (Objects.isNull(cars));
        return cars;
    }

    private static Cars tryInputCarNames() {
        try {
            return new Cars(inputView.inputCarNames());
        } catch (RacingCarException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static int getNumberOfAttempts() {
        int numberOfAttempts;
        do {
            numberOfAttempts = tryInputAttempts();
        } while (numberOfAttempts == 0);
        return numberOfAttempts;
    }

    private static int tryInputAttempts() {
        try {
            return inputView.inputNumberOfAttempts();
        } catch (RacingCarException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    private static void printResult(Cars cars, int numberOfAttempts) {
        OutputView outputView = new OutputView();
        outputView.printResultMessage();

        for (int i = 0; i < numberOfAttempts; i++) {
            cars.attempt(new RandomStrategy());
            outputView.printStatusFromScores(cars.getCars());
        }
        outputView.printWinners(cars.findWinners());
    }
}
