package den.lesson_six;

import lombok.Data;
import java.util.HashMap;
import java.util.Random;

@Data
public class MontyHallGame {
    private final int totalGames;
    private final Random random = new Random();

    public MontyHallGame(int totalGames) {
        this.totalGames = totalGames;
    }

    public void play() {
        HashMap<Integer, String> results = new HashMap<>();
        int winsSwitch = 0;
        int winsStay = 0;

        for (int i = 1; i <= totalGames; i++) {
            boolean resultSwitch = playRound(true);
            boolean resultStay = playRound(false);

            if (resultSwitch) {
                winsSwitch++;
                results.put(i, "Win (Switch)");
            } else {
                results.put(i, "Lose (Switch)");
            }

            if (resultStay) {
                winsStay++;
            }
        }
        printResults(winsSwitch, winsStay, totalGames, results);
    }

    private boolean playRound(boolean switchChoice) {
        int car = random.nextInt(3);  // Место, где находится машина
        int playerChoice = random.nextInt(3);  // Выбор игрока

        // Открыть одну из дверей с козлом (неизбранную и не с машиной)
        int revealedDoor = revealDoor(car, playerChoice);

        // Если игрок решит поменять свой выбор
        if (switchChoice) {
            playerChoice = switchDoor(playerChoice, revealedDoor);
        }

        // Победа, если игрок выбрал машину
        return playerChoice == car;
    }

    private int revealDoor(int car, int playerChoice) {
        for (int i = 0; i < 3; i++) {
            if (i != playerChoice && i != car) {
                return i;  // Возврат двери с козлом
            }
        }
        return -1; // Должен быть недостижимым
    }

    private int switchDoor(int playerChoice, int revealedDoor) {
        for (int i = 0; i < 3; i++) {
            if (i != playerChoice && i != revealedDoor) {
                return i;  // Новый выбор игрока (замена)
            }
        }
        return -1; // Должен быть недостижимым
    }

    private void printResults(int winsSwitch, int winsStay, int totalGames, HashMap<Integer, String> results) {
        System.out.println("Total Games: " + totalGames);
        System.out.println("Wins by switching: " + winsSwitch + " (" + (double) winsSwitch / totalGames * 100 + "%)");
        System.out.println("Wins by staying: " + winsStay + " (" + (double) winsStay / totalGames * 100 + "%)");
        System.out.println("Detailed Results: " + results);
    }
}