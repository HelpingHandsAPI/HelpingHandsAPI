package org.helpinghands.serviceinfo.domain;

public class BackendUser {
    private int userID;
    private String username;
    private String passCodeHash;
    private String firstName;
    private String lastName;

    public BackendUser() {
    }

    @Override
    public String toString() {
        return "BackendUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", passCodeHash='" + passCodeHash + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BackendUser)) return false;

        BackendUser that = (BackendUser) o;

        if (getUserID() != that.getUserID()) return false;
        if (!getUsername().equals(that.getUsername())) return false;
        if (!getPassCodeHash().equals(that.getPassCodeHash())) return false;
        if (!getFirstName().equals(that.getFirstName())) return false;
        return getLastName().equals(that.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getUserID();
        result = 31 * result + getUsername().hashCode();
        result = 31 * result + getPassCodeHash().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        return result;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassCodeHash() {
        return passCodeHash;
    }

    public void setPassCodeHash(String passCodeHash) {
        this.passCodeHash = passCodeHash;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
