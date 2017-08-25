package org.helpinghands.serviceinfo.model;

import java.util.ArrayList;

public class ID_BirthCertificate extends Service{
    private boolean paysForIdAndBirthCert;
    private boolean paysForIdCertOnly;
    private boolean paysForBirthCertOnly;

    public ID_BirthCertificate() {
    }

    @Override
    public String toString() {
        return "ID_BirthCertificate{" +
                "paysForIdAndBirthCert=" + paysForIdAndBirthCert +
                ", paysForIdCertOnly=" + paysForIdCertOnly +
                ", paysForBirthCertOnly=" + paysForBirthCertOnly +
                "} " + super.toString();
    }

    public boolean isPaysForIdAndBirthCert() {
        return paysForIdAndBirthCert;
    }

    public void setPaysForIdAndBirthCert(boolean paysForIdAndBirthCert) {
        this.paysForIdAndBirthCert = paysForIdAndBirthCert;
    }

    public boolean isPaysForIdCertOnly() {
        return paysForIdCertOnly;
    }

    public void setPaysForIdCertOnly(boolean paysForIdCertOnly) {
        this.paysForIdCertOnly = paysForIdCertOnly;
    }

    public boolean isPaysForBirthCertOnly() {
        return paysForBirthCertOnly;
    }

    public void setPaysForBirthCertOnly(boolean paysForBirthCertOnly) {
        this.paysForBirthCertOnly = paysForBirthCertOnly;
    }
}
