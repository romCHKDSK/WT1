package assignment.z9;

import java.awt.Color;

public class Ball {
    private double weight;
    private Color color;

    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return this.weight;
    }
    
    public Color getColor() {
        return this.color;
    }
}
