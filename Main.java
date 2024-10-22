import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main flag = new Main();
        Scanner sc = new Scanner(System.in);
        out.println("Введите номер блока(от 1 до 5): ");
        int bnum = sc.nextInt();
        if ((bnum < 1) || (bnum > 5)) {
            out.println("Номер блока введен неверно!");
            System.exit(0);
        }
        switch (bnum) {
            case 1:
                out.println("В этом блоке 2 задачи");
                out.println("Введите номер задачи(от 1 до 2): ");
                int tnum = sc.nextInt();
                sc.nextLine();
                if ((tnum < 1) || (tnum > 2)){
                    out.println("Номер задачи введен неверно!");
                    System.exit(0);
                }
                if (tnum == 1) {
                    out.println("Введите имя человека: ");
                    String name = sc.nextLine();
                    flag.CorrectName(name);
                    out.println("Введите рост человека: ");
                    int height = sc.nextInt();
                    flag.CorrectHeight(height);
                    Human h = new Human(name, height);
                    String ans = h.toString();
                    out.println(ans);
                }
                if (tnum == 2){
                    out.println("Введите имя человека: ");
                    String FName = sc.nextLine();
                    flag.CorrectString(FName);
                    out.println("Введите отчество человека: ");
                    String Patron = sc.nextLine();
                    flag.CorrectString(Patron);
                    out.println("Введите фамилию человека: ");
                    String LName = sc.nextLine();
                    flag.CorrectString(LName);
                    Name n = new Name(FName, Patron, LName);
                    String ans = n.toString();
                    out.println(ans);
                }
                break;
            case 2:
                out.println("Введите название отдела: ");
                String Dname = sc.nextLine();
                flag.CorrectName(Dname);
                out.println("Введите фамилию сотрудника: ");
                String name = sc.nextLine();
                flag.CorrectName(name);
                out.println("Введите отдел, в котором работает сотрудник: ");


        }
}
        public void CorrectName (String name){
            if (name.matches("[а-яА-ЯёЁa-zA-Z ]+") == false) {
                out.println("Неправильный ввод!");
                System.exit(0);
            }
        }
        public void CorrectString (String name){
        if (!name.isEmpty() && name.matches("[а-яА-ЯёЁ]+") == false) {
            out.println("Имя должно состоять только из букв русского алфавита!");
            System.exit(0);
            }
        }

        public void CorrectHeight ( int height){
            if (height < 0) {
                out.println("Рост не может быть отрицательным!");
                System.exit(0);
            }
        }

}

