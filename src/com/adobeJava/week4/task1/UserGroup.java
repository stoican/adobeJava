package com.adobeJava.week4.task1;

import javax.naming.SizeLimitExceededException;
import java.util.Arrays;

public class UserGroup implements Cloneable {
    private static final short MAX_USER_COUNT = 10;
    private final User[] users;
    private short current_count = 0;

    public UserGroup() {
        this.users = new User[MAX_USER_COUNT];
    }

    public void addUser(User user) {
        if (this.current_count >= 10) {
            throw new IllegalStateException("User count exceeds the maximum of " + MAX_USER_COUNT);
        }
        this.users[current_count++] = user;
    }

    @Override
    public UserGroup clone() {
        UserGroup clone = null;

        try {
            clone = (UserGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

    public static void main(String[] args) {
        UserGroup users = new UserGroup();
        users.addUser(new User("a", "B", "foo", "email@email.com"));
        users.addUser(new User("a", "B", "foo1", "email@email.com"));
    }
}
