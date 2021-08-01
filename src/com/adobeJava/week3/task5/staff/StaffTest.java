package com.adobeJava.week3.task5.staff;

public class StaffTest {
    public static void main(String[] args) {
        Staff[] staffMembers = new Staff[4];

        staffMembers[0] = new Developer();
        staffMembers[1] = new Developer();
        staffMembers[2] = new CustomerSupportSpecialist();
        staffMembers[3] = new Marketer();


        for (Staff staffMember : staffMembers) {
            staffMember.work();
        }
    }
}
