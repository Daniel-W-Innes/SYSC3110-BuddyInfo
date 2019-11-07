package helpers;


import protos.BuddyInfoOuterClass;

import java.util.Calendar;

public class BuddyInfo {
    private String name;
    private String homeAddress;
    private String phoneNumber;
    private int age;

    public BuddyInfo(String name, String homeAddress, String phoneNumber, int age) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public BuddyInfo(BuddyInfo buddyInfo) {
        name = buddyInfo.getName();
        homeAddress = buddyInfo.homeAddress;
        phoneNumber = buddyInfo.phoneNumber;
        age = buddyInfo.age;
    }

    public BuddyInfo(BuddyInfoOuterClass.BuddyInfo buddyInfo) {
        name = buddyInfo.getName();
        homeAddress = buddyInfo.getHomeAddress();
        phoneNumber = buddyInfo.getPhoneNumber();
        age = buddyInfo.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOver18() {
        return age > 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGreeting() {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        StringBuilder stringBuilder = new StringBuilder();
        if (timeOfDay < 12) {
            stringBuilder.append("Good Morning");
        } else if (timeOfDay < 16) {
            stringBuilder.append("Good Afternoon");
        } else if (timeOfDay < 21) {
            stringBuilder.append("Good Evening");
        } else {
            stringBuilder.append("Good Night");
        }
        stringBuilder.append(' ');
        stringBuilder.append(name);
        stringBuilder.append(',');
        return stringBuilder.toString();
    }

    public BuddyInfoOuterClass.BuddyInfo getProto() {
        return BuddyInfoOuterClass.BuddyInfo.newBuilder()
                .setName(name)
                .setHomeAddress(homeAddress)
                .setPhoneNumber(phoneNumber)
                .setAge(age)
                .build();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Home Address: " + homeAddress + ", Home Address: " + age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;
        BuddyInfo buddyInfo = (BuddyInfo) o;
        return getName().equals(buddyInfo.getName()) && getHomeAddress().equals(buddyInfo.getHomeAddress()) && getPhoneNumber().equals(buddyInfo.getPhoneNumber()) && getAge() == buddyInfo.getAge();
    }
}