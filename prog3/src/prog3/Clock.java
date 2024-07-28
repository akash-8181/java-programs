package prog3;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor with three parameters: hours, minutes, and seconds
    public Clock(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Hours must be between 0 and 23");
        }
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59");
        }
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Constructor with one parameter
    public Clock(int totalSeconds) {
        if (totalSeconds < 0) {
            throw new IllegalArgumentException("Total seconds must be non-negative");
        }
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    // Getters and setters 
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Hours must be between 0 and 23");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        }
        this.seconds = seconds;
    }

    //format HH:MM:SS
    public void printTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}