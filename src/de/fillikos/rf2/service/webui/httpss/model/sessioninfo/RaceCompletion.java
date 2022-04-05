package de.fillikos.rf2.service.webui.httpss.model.sessioninfo;

public class RaceCompletion {

    private String timeCompletion = "";
    private String lapsCompletion = "";

    public RaceCompletion() {

    }

    public String getTimeCompletion() {
        return timeCompletion;
    }

    public void setTimeCompletion(String timeCompletion) {
        this.timeCompletion = timeCompletion;
    }

    public String getLapsCompletion() {
        return lapsCompletion;
    }

    public void setLapsCompletion(String lapsCompletion) {
        this.lapsCompletion = lapsCompletion;
    }

    @Override
    public String toString() {
        return "RaceCompletion{" +
                "timeCompletion='" + timeCompletion + '\'' +
                ", lapsCompletion='" + lapsCompletion + '\'' +
                '}';
    }
}
