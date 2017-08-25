package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class VoterRegistration extends Service {
    private String whereToRegister;
    private ArrayList<String> informationNeeded;
    private int howLongToReceiveCard;

    public VoterRegistration() {
    }

    @Override
    public String toString() {
        return "VoterRegistration{" +
                "whereToRegister='" + whereToRegister + '\'' +
                ", informationNeeded=" + informationNeeded +
                ", howLongToReceiveCard=" + howLongToReceiveCard +
                "} " + super.toString();
    }

    public String getWhereToRegister() {
        return whereToRegister;
    }

    public void setWhereToRegister(String whereToRegister) {
        this.whereToRegister = whereToRegister;
    }

    public ArrayList<String> getInformationNeeded() {
        return informationNeeded;
    }

    public void setInformationNeeded(ArrayList<String> informationNeeded) {
        this.informationNeeded = informationNeeded;
    }

    public int getHowLongToReceiveCard() {
        return howLongToReceiveCard;
    }

    public void setHowLongToReceiveCard(int howLongToReceiveCard) {
        this.howLongToReceiveCard = howLongToReceiveCard;
    }
}
