import java.time.LocalDate;
import java.util.Date;

public class Human {
    {
        cnt++;
    }
    static int cnt = 0;
    private String name;
    private String firstName;
    private String lastName;
    private String numberPhone;
    private LocalDate birthday;
    private String country;
    private String city;
    private String street;

    public Human() {
        //cnt++;
    }

    public Human(String name, String firstName, String lastName, String numberPhone, LocalDate birthday, String country, String city, String street) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.birthday = birthday;
        this.country = country;
        this.city = city;
        this.street = street;
        //cnt++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 20) {
            this.name = name;
        } else {
            error();
        }
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        if ((numberPhone.charAt(0) == '8' && numberPhone.length() == 11) ||
        (numberPhone.charAt(0) == '+' && numberPhone.charAt(1) == '7' && numberPhone.length() == 12)) {
            this.numberPhone = numberPhone;
        } else {
            error();
        }
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(int day, int month, int year) {
        LocalDate dateNow = LocalDate.now();
        if ((year > 1930 && year < dateNow.getYear()) && (month > 0 && month < 13) && (day > 0 && day < LocalDate.MAX.getDayOfMonth())) {
            this.birthday = LocalDate.of(year, month, day);
        } else {
            error();
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private void error() {
        String str = "no correct";
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Human" + "\n" +
                "name='" + name + '\'' + "\n" +
                "firstName='" + firstName + '\'' + "\n" +
                "lastName='" + lastName + '\'' + "\n" +
                "numberPhone='" + numberPhone + '\'' + "\n" +
                "birthday=" + birthday + '\'' + "\n" +
                "country='" + country + '\'' + "\n" +
                "city='" + city + '\'' + "\n" +
                "street='" + street + '\'' + "\n";
    }
}