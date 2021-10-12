package racinggame.view;

import racinggame.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private static final String MSG_RESULT = "실행 결과";
    private static final String GO_KEYWORD = "-";
    private static final String NAME_SEPARATE_KEYWORD = " : ";
    private static final String MSG_WINNER = "최종 우승자는 %s 입니다.";

    public void printResultMessage() {
        System.out.println(MSG_RESULT);
    }

    public void printStatusFromScores(List<Car> cars) {
        cars.forEach(car -> {
            System.out.print(car.getName() + NAME_SEPARATE_KEYWORD);
            printGoKeyword(car);
            System.out.println();
        });
        System.out.println();
    }

    private void printGoKeyword(Car car) {
        for (int i = 0; i < car.getScore().getValue(); i++) {
            System.out.print(GO_KEYWORD);
        }
    }

    public void printWinners(List<Car> winners) {
        List<String> winnerStrings = new ArrayList<>();
        winners.forEach(winner -> winnerStrings.add(winner.getName()));
        System.out.printf(MSG_WINNER, String.join(",", winnerStrings));
    }
}
