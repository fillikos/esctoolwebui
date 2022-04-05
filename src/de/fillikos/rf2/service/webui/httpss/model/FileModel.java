package de.fillikos.rf2.service.webui.httpss.model;

import de.fillikos.rf2.service.webui.httpss.model.standings.PitState;

public class FileModel {

    private String driverName = "";
    private String fullTeamName = "";
    private String currentEventTime = "";
    private PitState pitStateOld = PitState.NONE;
    private PitState pitStateNew = PitState.NONE;
    private String klartext = "";

    public FileModel() {

    }

    public FileModel(String driverName, String fullTeamName, String currentEventTime,
                     PitState pitStateOld, PitState pitStateNew, String klartext) {
        setDriverName(driverName);
        setFullTeamName(fullTeamName);
        setCurrentEventTime(currentEventTime);
        setPitStateOld(pitStateOld);
        setPitStateNew(pitStateNew);
        setKlartext(klartext);
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getFullTeamName() {
        return fullTeamName;
    }

    public void setFullTeamName(String fullTeamName) {
        this.fullTeamName = fullTeamName;
    }

    public String getCurrentEventTime() {
        return currentEventTime;
    }

    public void setCurrentEventTime(String currentEventTime) {
        this.currentEventTime = currentEventTime;
    }

    public PitState getPitStateOld() {
        return pitStateOld;
    }

    public void setPitStateOld(PitState pitStateOld) {
        this.pitStateOld = pitStateOld;
    }

    public PitState getPitStateNew() {
        return pitStateNew;
    }

    public void setPitStateNew(PitState pitStateNew) {
        this.pitStateNew = pitStateNew;
    }

    public String getKlartext() {
        return klartext;
    }

    public void setKlartext(String klartext) {
        this.klartext = klartext;
    }

    @Override
    public String toString() {
        return "FileModel{" +
                "driverName='" + driverName + '\'' +
                ", fullTeamName='" + fullTeamName + '\'' +
                ", currentEventTime='" + currentEventTime + '\'' +
                ", pitStateOld=" + pitStateOld +
                ", pitStateNew=" + pitStateNew +
                ", klartext='" + klartext + '\'' +
                '}';
    }
}
