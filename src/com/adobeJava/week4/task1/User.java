package com.adobeJava.week4.task1;

public class User implements Cloneable {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;

    public User(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }
    // shallow copy (this would count as a 'deep copy' since class members are immutable)
    public User(User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.username = user.username;
        this.email = user.email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User copy() {
        return new User(this);
    }


}
