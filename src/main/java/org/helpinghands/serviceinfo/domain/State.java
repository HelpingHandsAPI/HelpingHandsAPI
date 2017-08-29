package org.helpinghands.serviceinfo.domain;

public class State {
    private String stateAbbreviation;
    private String stateName;

    public State(String stateAbbreviation, String stateName) {
        this.stateAbbreviation = stateAbbreviation;
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateAbbreviation='" + stateAbbreviation + '\'' +
                ", stateName='" + stateName + '\'' +
                '}';
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
