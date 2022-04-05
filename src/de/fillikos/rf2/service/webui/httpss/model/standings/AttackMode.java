package de.fillikos.rf2.service.webui.httpss.model.standings;

public class AttackMode {

    public String totalCount,
            remainingCount,
            timeRemaining;

    public AttackMode() {
        totalCount = "";
        remainingCount = "";
        timeRemaining = "";
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getRemainingCount() {
        return remainingCount;
    }

    public void setRemainingCount(String remainingCount) {
        this.remainingCount = remainingCount;
    }

    public String getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(String timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    @Override
    public String toString() {
        return "AttackMode{" +
                "totalCount='" + totalCount + '\'' +
                ", remainingCount='" + remainingCount + '\'' +
                ", timeRemaining='" + timeRemaining + '\'' +
                '}';
    }
}
