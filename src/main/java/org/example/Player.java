package org.example;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        checkAndSetHealth(healthPercentage);
        this.weapon = weapon;
    }

    private void checkAndSetHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemain = this.healthPercentage - damage;
        if (healthRemain <= 0) {
            System.out.println(name + " player has been knocked out of the game");
            this.healthPercentage = 0;
        } else {
            checkAndSetHealth(healthRemain);
        }
    }

    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        checkAndSetHealth(this.healthPercentage);
    }
}
