package domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
public class Race {
    private final List<Car> cars;

    public Race(List<Car> cars) {
        this.cars = cars;
    }

    public void runRace(int numberOfTries) {
        for (int i = 0; i < numberOfTries; i++) {
            raceOnce();
            printRoundResult();
        }
    }

    private void raceOnce() {
        for (Car car : cars) {
            car.moveForward(Randoms.pickNumberInRange(0, 9));
        }
    }

    private void printRoundResult() {
        for (Car car : cars) {
            car.printPosition();
        }
        System.out.println();
    }

}