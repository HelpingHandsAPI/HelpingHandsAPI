package org.helpinghands.serviceinfo.model;

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
