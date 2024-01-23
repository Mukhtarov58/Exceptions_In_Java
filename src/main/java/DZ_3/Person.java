package DZ_3;

import java.util.Date;

public class Person {
    private String fullName;
    private Date birthDate;
    private long phoneNumber;
    private String gender;

    public Person(String fullName, Date birthDate, long phoneNumber, String gender) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                '}';
    }
}
