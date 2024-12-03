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
        sc.nextLine();
        switch (bnum) {
            case 1:
                out.println("В этом блоке 2 задачи");
                out.println("Введите номер задачи(от 1 до 2): ");
                int tnum = sc.nextInt();
                sc.nextLine();
                if ((tnum < 1) || (tnum > 2)) {
                    out.println("Номер задачи введен неверно!");
                    System.exit(0);
                }
                if (tnum == 1) {
                    out.println("Введите имя человека: ");
                    String name = sc.nextLine();
                    flag.CorrectString(name);
                    out.println("Введите рост человека: ");
                    int height = sc.nextInt();
                    flag.CorrectInt(height);
                    Human h = new Human(name, height);
                    String ans = h.toString();
                    out.println(ans);
                }
                if (tnum == 2) {
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
                out.print("Введите название отдела: ");
                String DName = sc.nextLine();
                flag.CorrectString(DName);
                Department department = new Department(DName);

                out.print("Введите количество сотрудников: ");
                int eCount = sc.nextInt();
                flag.CorrectInt(eCount);
                Employee[] employees = new Employee[eCount];

                sc.nextLine();

                for (int i = 0; i < eCount; i++) {
                    out.print("Введите фамилию " + (i + 1) + "-го сотрудника: ");
                    String eName = sc.nextLine();
                    flag.CorrectString(eName);
                    employees[i] = new Employee(eName, department);
                }

                out.println("Выберите начальника отдела (Введите номер):");
                for (int i = 0; i < employees.length; i++) {
                    out.println((i + 1) + ". " + employees[i].geteName());
                }
                int bIndex = sc.nextInt() - 1;
                flag.CorrectIndex(bIndex, eCount);

                department.setBoss(employees[bIndex]);

                out.println("Сотрудники отдела:");
                for (int i = 0; i < employees.length; i++) {
                    out.println(employees[i]);
                }
                break;
            case 3:

                break;
            case 4:
                break;
            case 5:
                int bullets = 0;
                out.println("Введите количество патронов: ");
                String check = sc.nextLine();
                flag.CorrectInt(bullets);
                Gun gun = new Gun(bullets,check);
                out.println("Введите количество выстрелов: ");
                int shoots = sc.nextInt();
                flag.CorrectInt(shoots);
                for (int i = 0; i < shoots; i++) {
                    gun.shoot();
                }
                break;
        }
    }

    public void CorrectString(String name) {
        if (!name.isEmpty() && name.matches("[а-яА-ЯёЁa-zA-Z]+") == false) {
            out.println("Неправильный ввод!");
            System.exit(0);
        }
    }

    public void CorrectInt(int count) {
        if (count < 0) {
            out.println("Число не может быть отрицательным!");
            System.exit(0);
        }
    }

    public void CorrectIndex(int index, int max) {
        if (index < 0 || index >= max) {
            throw new IllegalArgumentException("Некорректный индекс!");
        }
    }

}

