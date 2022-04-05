package de.fillikos.rf2.service.webui.httpss.model.standings;

public enum PitState {

    /*
     * 0 == NONE = OnTrack
     * 1 == REQUEST = OnTrack PitStop Requested
     * 2 = InPitLane
     * 3 = Pitting
     * 4 == EXITING = ExitingPitLane == Vehicle in Garage
     */

    NONE, REQUEST, INPITLANE, PITTING, EXITING, ENTERING, STOPPED;
}
