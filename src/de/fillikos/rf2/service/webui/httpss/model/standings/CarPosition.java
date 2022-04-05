package de.fillikos.rf2.service.webui.httpss.model.standings;

public class CarPosition {

    public String type,
            z,
            y,
            x;

    public CarPosition() {
        type = "";
        z = "";
        y = "";
        x = "";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "CarPosition{" +
                "type='" + type + '\'' +
                ", z='" + z + '\'' +
                ", y='" + y + '\'' +
                ", x='" + x + '\'' +
                '}';
    }
}
