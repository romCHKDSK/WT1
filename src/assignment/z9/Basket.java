package assignment.z9;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Basket {
    private List<Ball> balls;

    public Basket () {
        balls = new ArrayList<>();
    }

    public Basket(Ball[] balls) {
        this.balls = new ArrayList<>();
        Collections.addAll(this.balls, balls);
    }

    public double getTotalWeight() {
        return balls.stream().mapToDouble(Ball::getWeight).sum();
    }

    public long getBallCountByColor(Color color) {
        return balls.stream().filter(b -> b.getColor() == color).count();
    }

    public List<Ball> getBalls() {
        return Collections.unmodifiableList(balls);
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public void removeBall(int index) {
        balls.remove(index);
    }
}
