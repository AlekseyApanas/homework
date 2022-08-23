package home_work_5;

public class Animal {
    private final int age;
    private final StringBuilder nick;

    public Animal(int age, StringBuilder nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public StringBuilder getNick() {
        return this.nick;
    }


    /**
     * Переопределили метод toString
     *
     * @return Выводит содержимое age,nick
     */
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + getAge() +
                ", nick=" + getNick() +
                '}';
    }
}
