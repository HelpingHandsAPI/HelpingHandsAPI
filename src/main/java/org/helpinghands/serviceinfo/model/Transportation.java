package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class Transportation extends Service{
    private boolean appointmentWalkIn;
    private ArrayList reasonBusFareIsProvided;

    public Transportation() {
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "appointmentWalkIn=" + appointmentWalkIn +
                ", reasonBusFareIsProvided=" + reasonBusFareIsProvided +
                '}';
    }

    public boolean isAppointmentWalkIn() {
        return appointmentWalkIn;
    }

    public void setAppointmentWalkIn(boolean appointmentWalkIn) {
        this.appointmentWalkIn = appointmentWalkIn;
    }

    public ArrayList getReasonBusFareIsProvided() {
        return reasonBusFareIsProvided;
    }

    public void setReasonBusFareIsProvided(ArrayList reasonBusFareIsProvided) {
        this.reasonBusFareIsProvided = reasonBusFareIsProvided;
    }
}
