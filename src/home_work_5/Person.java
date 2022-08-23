package home_work_5;

public class Person {
    private final StringBuilder nick;
    private final StringBuilder password;
    private final StringBuilder name;

    public Person(StringBuilder nick, StringBuilder password, StringBuilder name) {
        this.password = password;
        this.nick = nick;
        this.name = name;
    }


    public StringBuilder getPassword() {
        return password;
    }

    public StringBuilder getName() {
        return this.name;
    }

    public StringBuilder getNick() {
        return this.nick;
    }

    /**
     * Переопределили метод toString
     *
     * @return Выводит содержимое nick,password,name
     */
    @Override
    public String toString() {
        return "Person{" +
                "nick=" + getNick() +
                ", password=" + getPassword() +
                ", name=" + getName() +
                '}';
    }
}
