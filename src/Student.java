/*
 * Developed by Lasse Nielsen
 * Zealand / www.zealand.dk
 * 2019-09-09
 */

public class Student {

        String name;
        int birthYear;
        String homeTown;

        public String hello() {
            return "Hello!";
        }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

}
