package me.goral.javaIntro.bankAssigment;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    // ssn stands for Social Security Number
    private int ssn;

    public Person(String firstName, String middleName, String lastName, int age, int ssn) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSsn() {
        return ssn;
    }

    public void birthDay(){
        System.out.println("Happy Birth Day!");
        age++;
    }
}
