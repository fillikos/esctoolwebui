package de.fillikos.rf2.service.webui.httpss.model.standings;

public class User {

    private String slotID = "";
    private String driverName = "";
    private String vehicleName = "";
    private String lapsCompleted = "";
    private String sector = "";
    private String finishStatus = "";
    private String lapDistance = "";
    private String pathLateral = "";
    private String trackEdge = "";
    private String bestSectorTime1 = "";
    private String bestSectorTime2 = "";
    private String bestLapTime = "";
    private String lastSectorTime1 = "";
    private String lastSectorTime2 = "";
    private String lastLapTime = "";
    private String currentSectorTime1 = "";
    private String currentSectorTime2 = "";
    private String pitstops = "";
    private String penalties = "";
    private String player = "";
    private String inControl = "";
    private String pitting = "";
    private String position = "";
    private String carClass = "";
    private String timeBehindNext = "";
    private String lapsBehindNext = "";
    private String timeBehindLeader = "";
    private String lapsBehindLeader = "";
    private String lapStartET = "";
    private String headlights = "";
    private String pitState = "";
    private String serverScored = "";
    private String gamePhase = "";
    private String qualification = "";
    private String timeIntoLap = "";
    private String estimatedLapTime = "";
    private String pitGroup = "";
    private String flag = "";
    private String underYellow = "";
    private String countLapFlag = "";
    private String inGarageStall = "";
    private String upgradePack = "";
    private String pitLapDistance = "";
    private String bestLapSectorTime1 = "";
    private String bestLapSectorTime2 = "";
    private String steamID = "";
    private String vehicleFilename = "";
    private String carId = "";
    private String carNumber = "";
    private String fullTeamName = "";
    private String hasFocus = "";
    private String fuelFraction = "";
    private String focus = "";
    private String drsActive = "";

    private CarPosition carPosition;
    private Velocity carVelocity, carAcceleration;
    private AttackMode attackMode;

    private boolean slotIDChanged = false;
    private boolean drsActiveChanged = false;
    private boolean driverNameChanged = false;
    private boolean vehicleNameChanged = false;
    private boolean lapsCompletedChanged = false;
    private PitState pitStateEnum = PitState.NONE;

    public User() {
        carPosition = new CarPosition();
        carVelocity = new Velocity();
        carAcceleration = new Velocity();
        attackMode = new AttackMode();
    }

    public String getDrsActive() {
        return drsActive;
    }

    public void setDrsActive(String drsActive) {
        if(drsActive.equals(this.drsActive)) {
            drsActiveChanged = false;
        } else {
            this.drsActive = drsActive;
            drsActiveChanged = true;
        }
    }

    public String getSlotID() {
        return slotID;
    }

    public void setSlotID(String slotID) {
        if(slotID.equals(this.slotID)) {
            slotIDChanged = false;
        } else {
            this.slotID = slotID;
            slotIDChanged = true;
        }
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        if(driverName.equals(this.driverName)){
            driverNameChanged = false;
        } else {
            this.driverName = driverName;
            driverNameChanged = true;
        }
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        if(vehicleName.equals(this.vehicleName)) {
            vehicleNameChanged = false;
        } else {
            this.vehicleName = vehicleName;
            vehicleNameChanged = true;
        }
    }

    public String getLapsCompleted() {
        return lapsCompleted;
    }

    public void setLapsCompleted(String lapsCompleted) {
        if(lapsCompleted.equals(this.lapsCompleted)) {
            lapsCompletedChanged = false;
        } else {
            this.lapsCompleted = lapsCompleted;
            lapsCompletedChanged = true;
        }
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
    }

    public String getLapDistance() {
        return lapDistance;
    }

    public void setLapDistance(String lapDistance) {
        this.lapDistance = lapDistance;
    }

    public String getPathLateral() {
        return pathLateral;
    }

    public void setPathLateral(String pathLateral) {
        this.pathLateral = pathLateral;
    }

    public String getTrackEdge() {
        return trackEdge;
    }

    public void setTrackEdge(String trackEdge) {
        this.trackEdge = trackEdge;
    }

    public String getBestSectorTime1() {
        return bestSectorTime1;
    }

    public void setBestSectorTime1(String bestSectorTime1) {
        this.bestSectorTime1 = bestSectorTime1;
    }

    public String getBestSectorTime2() {
        return bestSectorTime2;
    }

    public void setBestSectorTime2(String bestSectorTime2) {
        this.bestSectorTime2 = bestSectorTime2;
    }

    public String getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(String bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    public String getLastSectorTime1() {
        return lastSectorTime1;
    }

    public void setLastSectorTime1(String lastSectorTime1) {
        this.lastSectorTime1 = lastSectorTime1;
    }

    public String getLastSectorTime2() {
        return lastSectorTime2;
    }

    public void setLastSectorTime2(String lastSectorTime2) {
        this.lastSectorTime2 = lastSectorTime2;
    }

    public String getLastLapTime() {
        return lastLapTime;
    }

    public void setLastLapTime(String lastLapTime) {
        this.lastLapTime = lastLapTime;
    }

    public String getCurrentSectorTime1() {
        return currentSectorTime1;
    }

    public void setCurrentSectorTime1(String currentSectorTime1) {
        this.currentSectorTime1 = currentSectorTime1;
    }

    public String getCurrentSectorTime2() {
        return currentSectorTime2;
    }

    public void setCurrentSectorTime2(String currentSectorTime2) {
        this.currentSectorTime2 = currentSectorTime2;
    }

    public String getPitstops() {
        return pitstops;
    }

    public void setPitstops(String pitstops) {
        this.pitstops = pitstops;
    }

    public String getPenalties() {
        return penalties;
    }

    public void setPenalties(String penalties) {
        this.penalties = penalties;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getInControl() {
        return inControl;
    }

    public void setInControl(String inControl) {
        this.inControl = inControl;
    }

    public String getPitting() {
        return pitting;
    }

    public void setPitting(String pitting) {
        this.pitting = pitting;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getTimeBehindNext() {
        return timeBehindNext;
    }

    public void setTimeBehindNext(String timeBehindNext) {
        this.timeBehindNext = timeBehindNext;
    }

    public String getLapsBehindNext() {
        return lapsBehindNext;
    }

    public void setLapsBehindNext(String lapsBehindNext) {
        this.lapsBehindNext = lapsBehindNext;
    }

    public String getTimeBehindLeader() {
        return timeBehindLeader;
    }

    public void setTimeBehindLeader(String timeBehindLeader) {
        this.timeBehindLeader = timeBehindLeader;
    }

    public String getLapsBehindLeader() {
        return lapsBehindLeader;
    }

    public void setLapsBehindLeader(String lapsBehindLeader) {
        this.lapsBehindLeader = lapsBehindLeader;
    }

    public String getLapStartET() {
        return lapStartET;
    }

    public void setLapStartET(String lapStartET) {
        this.lapStartET = lapStartET;
    }

    public String getHeadlights() {
        return headlights;
    }

    public void setHeadlights(String headlights) {
        this.headlights = headlights;
    }

    public String getPitState() {
        return pitState;
    }

    public void setPitState(String pitState) {
        if(!pitState.equals(this.pitState)) {
            setPitStateEnum(pitState);
            this.pitState = pitState;
        }
    }

    private void setPitStateEnum(String pitState) {
            if(pitState.equals("NONE")) {
                pitStateEnum = PitState.NONE;
            }
            else if(pitState.equals("REQUEST")) {
                pitStateEnum = PitState.REQUEST;
            }
            else if(pitState.equals("INPITLANE")) {
                pitStateEnum = PitState.INPITLANE;
            }
            else if(pitState.equals("PITTING")) {
                pitStateEnum = PitState.PITTING;
            }
            else if(pitState.equals("EXITING")) {
                pitStateEnum = PitState.EXITING;
            }
            else if(pitState.equals("ENTERING")) {
                pitStateEnum = PitState.ENTERING;
            }
            else if(pitState.equals("STOPPED")) {
                pitStateEnum = PitState.STOPPED;
            }
    }

    public PitState getPitStateEnum() {
        return pitStateEnum;
    }

    public String getServerScored() {
        return serverScored;
    }

    public void setServerScored(String serverScored) {
        this.serverScored = serverScored;
    }

    public String getGamePhase() {
        return gamePhase;
    }

    public void setGamePhase(String gamePhase) {
        this.gamePhase = gamePhase;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getTimeIntoLap() {
        return timeIntoLap;
    }

    public void setTimeIntoLap(String timeIntoLap) {
        this.timeIntoLap = timeIntoLap;
    }

    public String getEstimatedLapTime() {
        return estimatedLapTime;
    }

    public void setEstimatedLapTime(String estimatedLapTime) {
        this.estimatedLapTime = estimatedLapTime;
    }

    public String getPitGroup() {
        return pitGroup;
    }

    public void setPitGroup(String pitGroup) {
        this.pitGroup = pitGroup;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getUnderYellow() {
        return underYellow;
    }

    public void setUnderYellow(String underYellow) {
        this.underYellow = underYellow;
    }

    public String getCountLapFlag() {
        return countLapFlag;
    }

    public void setCountLapFlag(String countLapFlag) {
        this.countLapFlag = countLapFlag;
    }

    public String getInGarageStall() {
        return inGarageStall;
    }

    public void setInGarageStall(String inGarageStall) {
        this.inGarageStall = inGarageStall;
    }

    public String getUpgradePack() {
        return upgradePack;
    }

    public void setUpgradePack(String upgradePack) {
        this.upgradePack = upgradePack;
    }

    public String getPitLapDistance() {
        return pitLapDistance;
    }

    public void setPitLapDistance(String pitLapDistance) {
        this.pitLapDistance = pitLapDistance;
    }

    public String getBestLapSectorTime1() {
        return bestLapSectorTime1;
    }

    public void setBestLapSectorTime1(String bestLapSectorTime1) {
        this.bestLapSectorTime1 = bestLapSectorTime1;
    }

    public String getBestLapSectorTime2() {
        return bestLapSectorTime2;
    }

    public void setBestLapSectorTime2(String bestLapSectorTime2) {
        this.bestLapSectorTime2 = bestLapSectorTime2;
    }

    public String getSteamID() {
        return steamID;
    }

    public void setSteamID(String steamID) {
        this.steamID = steamID;
    }

    public String getVehicleFilename() {
        return vehicleFilename;
    }

    public void setVehicleFilename(String vehicleFilename) {
        this.vehicleFilename = vehicleFilename;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getFullTeamName() {
        return fullTeamName;
    }

    public void setFullTeamName(String fullTeamName) {
        this.fullTeamName = fullTeamName;
    }

    public String getHasFocus() {
        return hasFocus;
    }

    public void setHasFocus(String hasFocus) {
        this.hasFocus = hasFocus;
    }

    public String getFuelFraction() {
        return fuelFraction;
    }

    public void setFuelFraction(String fuelFraction) {
        this.fuelFraction = fuelFraction;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }

    public void setCarPosition(CarPosition carPosition) {
        this.carPosition = carPosition;
    }

    public Velocity getCarVelocity() {
        return carVelocity;
    }

    public void setCarVelocity(Velocity carVelocity) {
        this.carVelocity = carVelocity;
    }

    public Velocity getCarAcceleration() {
        return carAcceleration;
    }

    public void setCarAcceleration(Velocity carAcceleration) {
        this.carAcceleration = carAcceleration;
    }

    public AttackMode getAttackMode() {
        return attackMode;
    }

    public void setAttackMode(AttackMode attackMode) {
        this.attackMode = attackMode;
    }

    public boolean isSlotIDChanged() {
        return slotIDChanged;
    }

    public void setSlotIDChanged(boolean slotIDChanged) {
        this.slotIDChanged = slotIDChanged;
    }

    public boolean isDrsActiveChanged() {
        return drsActiveChanged;
    }

    public void setDrsActiveChanged(boolean drsActiveChanged) {
        this.drsActiveChanged = drsActiveChanged;
    }

    public boolean isDriverNameChanged() {
        return driverNameChanged;
    }

    public void setDriverNameChanged(boolean driverNameChanged) {
        this.driverNameChanged = driverNameChanged;
    }

    public boolean isVehicleNameChanged() {
        return vehicleNameChanged;
    }

    public void setVehicleNameChanged(boolean vehicleNameChanged) {
        this.vehicleNameChanged = vehicleNameChanged;
    }

    public boolean isLapsCompletedChanged() {
        return lapsCompletedChanged;
    }

    public void setLapsCompletedChanged(boolean lapsCompletedChanged) {
        this.lapsCompletedChanged = lapsCompletedChanged;
    }

    public void setPitStateEnum(PitState pitStateEnum) {
        this.pitStateEnum = pitStateEnum;
    }

    @Override
    public String toString() {
        return "User{" +
                "slotID='" + slotID + '\'' +
                ", driverName='" + driverName + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", lapsCompleted='" + lapsCompleted + '\'' +
                ", sector='" + sector + '\'' +
                ", finishStatus='" + finishStatus + '\'' +
                ", lapDistance='" + lapDistance + '\'' +
                ", pathLateral='" + pathLateral + '\'' +
                ", trackEdge='" + trackEdge + '\'' +
                ", bestSectorTime1='" + bestSectorTime1 + '\'' +
                ", bestSectorTime2='" + bestSectorTime2 + '\'' +
                ", bestLapTime='" + bestLapTime + '\'' +
                ", lastSectorTime1='" + lastSectorTime1 + '\'' +
                ", lastSectorTime2='" + lastSectorTime2 + '\'' +
                ", lastLapTime='" + lastLapTime + '\'' +
                ", currentSectorTime1='" + currentSectorTime1 + '\'' +
                ", currentSectorTime2='" + currentSectorTime2 + '\'' +
                ", pitstops='" + pitstops + '\'' +
                ", penalties='" + penalties + '\'' +
                ", player='" + player + '\'' +
                ", inControl='" + inControl + '\'' +
                ", pitting='" + pitting + '\'' +
                ", position='" + position + '\'' +
                ", carClass='" + carClass + '\'' +
                ", timeBehindNext='" + timeBehindNext + '\'' +
                ", lapsBehindNext='" + lapsBehindNext + '\'' +
                ", timeBehindLeader='" + timeBehindLeader + '\'' +
                ", lapsBehindLeader='" + lapsBehindLeader + '\'' +
                ", lapStartET='" + lapStartET + '\'' +
                ", headlights='" + headlights + '\'' +
                ", pitState='" + pitState + '\'' +
                ", serverScored='" + serverScored + '\'' +
                ", gamePhase='" + gamePhase + '\'' +
                ", qualification='" + qualification + '\'' +
                ", timeIntoLap='" + timeIntoLap + '\'' +
                ", estimatedLapTime='" + estimatedLapTime + '\'' +
                ", pitGroup='" + pitGroup + '\'' +
                ", flag='" + flag + '\'' +
                ", underYellow='" + underYellow + '\'' +
                ", countLapFlag='" + countLapFlag + '\'' +
                ", inGarageStall='" + inGarageStall + '\'' +
                ", upgradePack='" + upgradePack + '\'' +
                ", pitLapDistance='" + pitLapDistance + '\'' +
                ", bestLapSectorTime1='" + bestLapSectorTime1 + '\'' +
                ", bestLapSectorTime2='" + bestLapSectorTime2 + '\'' +
                ", steamID='" + steamID + '\'' +
                ", vehicleFilename='" + vehicleFilename + '\'' +
                ", carId='" + carId + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", fullTeamName='" + fullTeamName + '\'' +
                ", hasFocus='" + hasFocus + '\'' +
                ", fuelFraction='" + fuelFraction + '\'' +
                ", focus='" + focus + '\'' +
                ", drsActive='" + drsActive + '\'' +
                ", carPosition=" + carPosition +
                ", carVelocity=" + carVelocity +
                ", carAcceleration=" + carAcceleration +
                ", attackMode=" + attackMode +
                ", slotIDChanged=" + slotIDChanged +
                ", drsActiveChanged=" + drsActiveChanged +
                ", driverNameChanged=" + driverNameChanged +
                ", vehicleNameChanged=" + vehicleNameChanged +
                ", lapsCompletedChanged=" + lapsCompletedChanged +
                ", pitStateEnum=" + pitStateEnum +
                '}';
    }
}
