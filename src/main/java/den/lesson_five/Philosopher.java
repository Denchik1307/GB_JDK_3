package den.lesson_five;

import java.util.concurrent.Semaphore;

class Philosopher implements Runnable {
    private int id = 1;
    private final Semaphore leftFork;
    private final Semaphore rightFork;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id += id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                think();
                eat();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void eat() throws InterruptedException {
        leftFork.acquire();
        rightFork.acquire();

        System.out.println("Philosopher " + id + " is eating.");

        // Симуляция времени, затраченного на еду
        Thread.sleep(1000);

        leftFork.release();
        rightFork.release();

        System.out.println("Philosopher " + id + " finished eating.");
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking.");

        // Симуляция времени, затраченного на размышления
        Thread.sleep(1000);
    }
}