package Tasks;

import java.sql.SQLOutput;
import java.util.Random;

public class Run {
    //obiekt klasy tasks
    TasksLab01 tasksLab01 = new TasksLab01();
    // obiekt klasy Inputdata
    InputData inputData = new InputData();

    Random random = new Random();


    public void RunMain() {

        Menu();
    } // koniec metody runmain

    private void Menu() {
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Task 4");
        System.out.println("5. Task 5");
        System.out.println("6. Task 6");
        System.out.println("7. Task 7");
        System.out.println("8. Exit");
        System.out.println("Select a task: ");
        int choose = inputData.InputInt();

        switch (choose){
            case 1: Task001Run(); break;
            case 2: Task002Run(); break;
            case 3: Task003Run(); break;
            case 4: Task004Run(); break;
            case 5: Task005Run(); break;
            case 6: Task006Run(); break;
            case 7: Task007Run(); break;
            case 8: CloseProgram(); break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie.");
        }

    }// koniec metody menu

    public void Task001Run()
    {
        System.out.println("Podaj imie: ");
        String name = inputData.InputString();
        System.out.println("Podaj wiek: ");
        int age = inputData.InputInt();
        System.out.println(tasksLab01.Task001(name, age));
    }
    public void Task002Run()
        {
        System.out.println("Podaj liczbe 1: ");
        double value01 = inputData.InputDouble();
        System.out.println("Podaj liczbe 2: ");
        double value02 = inputData.InputDouble();
        tasksLab01.Task002(value01,value02);
    }
    public void Task003Run()
    {
        System.out.println("Podaj liczbe: ");
        int number = inputData.InputInt();
        if(tasksLab01.Task003(number))
        {
            System.out.println("Liczba jest parzysta: ");
        }else{
            System.out.println("Liczba jest nieparzysta: ");
        }
    }
    public void Task004Run()
    {
        System.out.println("Podaj liczbe: ");
        int number = inputData.InputInt();
        if(tasksLab01.Task004(number))
        {
            System.out.println("Liczba " + number +  " jest podzielna przez 3 i 5");
        }else{
            System.out.println("Liczba " + number + " jest niepodzielna przez 3 i 5");
        }
    }
    public void Task005Run()
    {
        System.out.println("Podaj liczbe: ");
        double number = inputData.InputInt();
        System.out.println(tasksLab01.Task005(number));
    }
    public void Task006Run()
    {
        System.out.println("Podaj liczbe: ");
        double number = inputData.InputDouble();
        System.out.println(tasksLab01.Task006(number));
    }
    public void Task007Run()
    {
        System.out.println("Podaj zakres liczb: ");
        int limit_1 = inputData.InputInt();
        int limit_2 = inputData.InputInt();

        System.out.println("3 losowe liczby z przedziału");
        int x = random.nextInt((limit_2 - limit_1 + 1)+limit_1);
        int y = random.nextInt((limit_2 - limit_1 + 1)+limit_1);
        int z = random.nextInt((limit_2 - limit_1 + 1)+limit_1);

        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        if(tasksLab01.Task007(x,y,z))
        {
            System.out.println("Z odcinków można zbudować trójkąt prostokątny");
        }else{
            System.out.println("Z odcinków nie można zbudować trójkąta prostokątnego");
        }
    }
    public void CloseProgram()
    {
        System.out.println("Zamykam program");
        System.exit(0);
    }
}// koniec klasy
