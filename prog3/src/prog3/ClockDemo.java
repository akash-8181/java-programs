package prog3;

public class ClockDemo {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        clock1.printTime(); // Outputs 12:00:00

        Clock clock2 = new Clock(14, 30, 45);
        clock2.printTime(); // Outputs 14:30:45

        Clock clock3 = new Clock(5000);
        clock3.printTime(); // Outputs 01:23:20 (5000 seconds after midnight)

        clock3.setHours(10);
        clock3.setMinutes(20);
        clock3.setSeconds(30);
        clock3.printTime(); // Outputs 10:20:30
    }
}
