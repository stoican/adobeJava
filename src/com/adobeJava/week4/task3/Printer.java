package com.adobeJava.week4.task3;

import com.adobeJava.week4.task1.User;
import com.adobeJava.week4.task1.UserGroup;
import com.adobeJava.week4.task2.Color;
import com.adobeJava.week4.task2.ColoredTriangle;
import com.adobeJava.week4.task2.ImmutablePoint;
import com.adobeJava.week4.task2.Triangle;

public class Printer {

    public static void specialPrint(Object obj) {
        System.out.println("************************************");
        System.out.println("[" + obj.toString() + "]");
        System.out.println("************************************");
    }

    public static void main(String[] args) {
        User user = new User("FirstName", "LastName", "username", "email@email.com");
        UserGroup userGroup = new UserGroup();
        User randomUser1 = new User("TestName", "TestLastName", "test", "test@email.com");
        User randomUser2 = new User("TestName2", "TestLastName2", "test2", "test2@email.com");
        userGroup.addUser(randomUser1);
        userGroup.addUser(randomUser2);
        ImmutablePoint immutablePoint = new ImmutablePoint(1.0, 9.0);
        Triangle triangle = new Triangle(new ImmutablePoint(1.0, 9.0),
                new ImmutablePoint(5.0, 5.0),
                new ImmutablePoint(-3.0, 3.0));
        ColoredTriangle coloredTriangle = new ColoredTriangle(new ImmutablePoint(1.0, 9.0),
                new ImmutablePoint(5.0, 5.0),
                new ImmutablePoint(-3.0, 3.0),
                Color.BLACK);

        specialPrint(user);
        specialPrint(userGroup);
        specialPrint(immutablePoint);
        specialPrint(triangle);
        specialPrint(coloredTriangle);

    }
}
