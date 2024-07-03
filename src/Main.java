import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя первого пользователя");
        String name1 = in.nextLine();
        System.out.println("Введите возраст первого пользователя");
        int age1 = in.nextInt();
        User user1 = new User(name1, age1);

        in.nextLine();

        System.out.println("Введите имя второго пользователя");
        String name2 = in.nextLine();
        System.out.println("Введите возраст второго пользователя");
        int age2 = in.nextInt();
        User user2 = new User(name2, age2);

        if(age1 < age2) {
            System.out.println(user1);
        }
        else if (age1 > age2) {
            System.out.println(user2);
        }
        else {
            System.out.println("Возрост пользователей одинаков");
            System.out.println(user1);
            System.out.println(user2);
        }
    }
}

class User {
    private String name;
    private Integer age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return (name + ", возраст " + age + " лет");
    }
}