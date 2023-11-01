package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;


public class CarAction {
    private static final int MOVE_THRESHOLD = 4;

    public void moveCars() {
        for (int i = 0; i < Cars.countList.size(); i++) {
            carMoveOrStop(i);
        }
    }

    private void carMoveOrStop(int carListIndex) {
        int randomNumber = createRandomNumber();
        if (randomNumber >= MOVE_THRESHOLD) {
            carMoveOneStep(carListIndex);
        }
    }

    private void carMoveOneStep(int carListIndex) {
        Cars.countList.set(carListIndex, Cars.countList.get(carListIndex) + 1);
    }

    private int createRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

}
