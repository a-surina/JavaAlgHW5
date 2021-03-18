public class Pancake {
    int number = 1;
    String temperature;
    String filling;

    public Pancake(int number, String temperature, String filling) {
        this.number = number;
        this.temperature = temperature;
        this.filling = filling;
    }

    public void printer() {
        String display = String.format("a " + temperature + " pancake with " + filling + " № " + number);
        System.out.println(display);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }
}
