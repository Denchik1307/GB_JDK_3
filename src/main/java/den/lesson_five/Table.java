package den.lesson_five;

import java.util.concurrent.Semaphore;

public class Table {
    private final int numPhilosopher;
    private final Semaphore[] forks;
    private final Thread[] philosophers;

    public Table(int numPhilosopher) {
        this.numPhilosopher = numPhilosopher;
        forks = new Semaphore[numPhilosopher];
        philosophers = new Thread[numPhilosopher];
        initForks();
        initPhilosopher();
    }

    // Инициализация вилок
    private void initForks() {
        for (int i = 0; i < numPhilosopher; i++) {
            forks[i] = new Semaphore(1);
        }
    }

    // Создание философов
    void initPhilosopher() {
        for (int i = 0; i < numPhilosopher; i++) {
            philosophers[i] = new Thread(new Philosopher(i, forks[i], forks[(i + 1) % numPhilosopher]));
            philosophers[i].start();
        }
    }

    // Ожидание завершения работы философов
    void startDiner() {
        for (int i = 0; i < numPhilosopher; i++) {
            try {
                philosophers[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
