package de.fillikos.rf2.service.webui.httpss.model.sessioninfo;

import de.fillikos.rf2.service.webui.httpss.model.standings.AttackMode;
import de.fillikos.rf2.service.webui.httpss.model.standings.Velocity;

import java.util.Arrays;

public class SessionInfo {

    private String trackName = "";
    private String session = "";
    private String currentEventTime = "";
    private String endEventTime = "";
    private String maximumLaps = "";
    private String lapDistance = "";
    private String numberOfVehicles = "";
    private String gamePhase = "";
    private String yellowFlagState = "";
    private String startLightFrame = "";
    private String numRedLights = "";
    private String inRealtime = "";
    private String playerName = "";
    private String playerFileName = "";
    private String darkCloud = "";
    private String raining = "";
    private String ambientTemp = "";
    private String trackTemp = "";
    private String minPathWetness = "";
    private String averagePathWetness = "";
    private String maxPathWetness = "";
    private String gameMode = "";
    private String passwordProtected = "";
    private String serverPort = "";
    private String maxPlayers = "";
    private String serverName = "";
    private String startEventTime = "";
    private String timeCompletion = "";
    private String[] sectorFlag = new String[0];
    private Velocity windSpeed;
    private RaceCompletion raceCompletion;
    private Session sessionEnum = Session.TESTDAY;

    public SessionInfo() {
        this.windSpeed = new Velocity();
        this.raceCompletion = new RaceCompletion();
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        if(!session.equals(this.session)) {
            setSessionEnum(session);
            this.session = session;
        }
    }

    private void setSessionEnum(String session) {
            if(session.equals("TESTDAY")) {
                sessionEnum = Session.TESTDAY;
            } else if(session.equals("PRACTICE1") ||
                    session.equals("PRACTICE2") ||
                    session.equals("PRACTICE3") ||
                    session.equals("PRACTICE4") ||
                    session.equals("PRACTICE5")) {
                sessionEnum = Session.PRACTICE;
            } else if(session.equals("QUALIFY1") ||
                    session.equals("QUALIFY2") ||
                    session.equals("QUALIFY3") ||
                    session.equals("QUALIFY4") ||
                    session.equals("QUALIFY5")) {
                sessionEnum = Session.QUALIFY;
            } else if(session.equals("WARMUP") ) {
                sessionEnum = Session.WARMUP;
            } else if(session.equals("RACE1") ||
                    session.equals("RACE2") ||
                    session.equals("RACE3") ||
                    session.equals("RACE4") ||
                    session.equals("RACE5")) {
                sessionEnum = Session.RACE;
            }
    }

    public Session getSessionEnum() {
        return sessionEnum;
    }

    public String getCurrentEventTime() {
        return currentEventTime;
    }

    public void setCurrentEventTime(String currentEventTime) {
        this.currentEventTime = currentEventTime;
    }

    public String getEndEventTime() {
        return endEventTime;
    }

    public void setEndEventTime(String endEventTime) {
        this.endEventTime = endEventTime;
    }

    public String getMaximumLaps() {
        return maximumLaps;
    }

    public void setMaximumLaps(String maximumLaps) {
        this.maximumLaps = maximumLaps;
    }

    public String getLapDistance() {
        return lapDistance;
    }

    public void setLapDistance(String lapDistance) {
        this.lapDistance = lapDistance;
    }

    public String getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(String numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public String getGamePhase() {
        return gamePhase;
    }

    public void setGamePhase(String gamePhase) {
        this.gamePhase = gamePhase;
    }

    public String getYellowFlagState() {
        return yellowFlagState;
    }

    public void setYellowFlagState(String yellowFlagState) {
        this.yellowFlagState = yellowFlagState;
    }

    public String getStartLightFrame() {
        return startLightFrame;
    }

    public void setStartLightFrame(String startLightFrame) {
        this.startLightFrame = startLightFrame;
    }

    public String getNumRedLights() {
        return numRedLights;
    }

    public void setNumRedLights(String numRedLights) {
        this.numRedLights = numRedLights;
    }

    public String getInRealtime() {
        return inRealtime;
    }

    public void setInRealtime(String inRealtime) {
        this.inRealtime = inRealtime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerFileName() {
        return playerFileName;
    }

    public void setPlayerFileName(String playerFileName) {
        this.playerFileName = playerFileName;
    }

    public String getDarkCloud() {
        return darkCloud;
    }

    public void setDarkCloud(String darkCloud) {
        this.darkCloud = darkCloud;
    }

    public String getRaining() {
        return raining;
    }

    public void setRaining(String raining) {
        this.raining = raining;
    }

    public String getAmbientTemp() {
        return ambientTemp;
    }

    public void setAmbientTemp(String ambientTemp) {
        this.ambientTemp = ambientTemp;
    }

    public String getTrackTemp() {
        return trackTemp;
    }

    public void setTrackTemp(String trackTemp) {
        this.trackTemp = trackTemp;
    }

    public String getMinPathWetness() {
        return minPathWetness;
    }

    public void setMinPathWetness(String minPathWetness) {
        this.minPathWetness = minPathWetness;
    }

    public String getAveragePathWetness() {
        return averagePathWetness;
    }

    public void setAveragePathWetness(String averagePathWetness) {
        this.averagePathWetness = averagePathWetness;
    }

    public String getMaxPathWetness() {
        return maxPathWetness;
    }

    public void setMaxPathWetness(String maxPathWetness) {
        this.maxPathWetness = maxPathWetness;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getPasswordProtected() {
        return passwordProtected;
    }

    public void setPasswordProtected(String passwordProtected) {
        this.passwordProtected = passwordProtected;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(String maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getStartEventTime() {
        return startEventTime;
    }

    public void setStartEventTime(String startEventTime) {
        this.startEventTime = startEventTime;
    }

    public RaceCompletion getRaceCompletion() {
        return raceCompletion;
    }

    public void setRaceCompletion(RaceCompletion raceCompletion) {
        this.raceCompletion = raceCompletion;
    }

    public String getTimeCompletion() {
        return timeCompletion;
    }

    public void setTimeCompletion(String timeCompletion) {
        this.timeCompletion = timeCompletion;
    }

    public Velocity getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Velocity windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String[] getSectorFlag() {
        return sectorFlag;
    }

    public void setSectorFlag(String[] sectorFlag) {
        this.sectorFlag = sectorFlag;
    }

    @Override
    public String toString() {
        return "SessionInfo{" +
                "trackName='" + trackName + '\'' +
                ", session='" + session + '\'' +
                ", currentEventTime='" + currentEventTime + '\'' +
                ", endEventTime='" + endEventTime + '\'' +
                ", maximumLaps='" + maximumLaps + '\'' +
                ", lapDistance='" + lapDistance + '\'' +
                ", numberOfVehicles='" + numberOfVehicles + '\'' +
                ", gamePhase='" + gamePhase + '\'' +
                ", yellowFlagState='" + yellowFlagState + '\'' +
                ", startLightFrame='" + startLightFrame + '\'' +
                ", numRedLights='" + numRedLights + '\'' +
                ", inRealtime='" + inRealtime + '\'' +
                ", playerName='" + playerName + '\'' +
                ", playerFileName='" + playerFileName + '\'' +
                ", darkCloud='" + darkCloud + '\'' +
                ", raining='" + raining + '\'' +
                ", ambientTemp='" + ambientTemp + '\'' +
                ", trackTemp='" + trackTemp + '\'' +
                ", minPathWetness='" + minPathWetness + '\'' +
                ", averagePathWetness='" + averagePathWetness + '\'' +
                ", maxPathWetness='" + maxPathWetness + '\'' +
                ", gameMode='" + gameMode + '\'' +
                ", passwordProtected='" + passwordProtected + '\'' +
                ", serverPort='" + serverPort + '\'' +
                ", maxPlayers='" + maxPlayers + '\'' +
                ", serverName='" + serverName + '\'' +
                ", startEventTime='" + startEventTime + '\'' +
                ", timeCompletion='" + timeCompletion + '\'' +
                ", sectorFlag=" + Arrays.toString(sectorFlag) +
                ", windSpeed=" + windSpeed +
                ", raceCompletion=" + raceCompletion +
                ", sessionEnum=" + sessionEnum +
                '}';
    }
}
