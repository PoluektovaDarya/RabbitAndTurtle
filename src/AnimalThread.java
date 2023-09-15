public class AnimalThread extends Thread {
    private String name;
    private int priority;
    private int distance;

    public AnimalThread(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.distance = 0;
        setPriority(priority);
    }

    @Override
    public void run() {
        while (distance < 100) {
            try {
                sleep(100); // Имитируем бег зверушек
                distance += 10;
                System.out.println(name + " пробежал " + distance + " метров.");
                if (distance >= 100) {
                    System.out.println(name + " финишировал!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getDistance() {
        return distance;
    }
}

