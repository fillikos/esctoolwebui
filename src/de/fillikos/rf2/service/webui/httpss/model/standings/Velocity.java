package de.fillikos.rf2.service.webui.httpss.model.standings;

public class Velocity {

    public String x,
            y,
            z,
            velocity;

    public Velocity() {
        x = "";
        y = "";
        z = "";
        velocity = "";
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Velocity{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", z='" + z + '\'' +
                ", velocity='" + velocity + '\'' +
                '}';
    }
}
