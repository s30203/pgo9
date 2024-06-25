import java.time.Year;

public abstract class Person {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;
    public Person(String imie, String nazwisko, int birthdayYear) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = birthdayYear;
    }
    public int getAge() {
        return Year.now().getValue() - rokUrodzenia;
    }
}
