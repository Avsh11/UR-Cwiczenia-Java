package Tasks;

public class Run {
    // ---------------------------------------------
    // ---------------------------------------------
    // ---------------------------------------------
    InputData inputData = new InputData();
    TasksLab02 tasksLab02 = new TasksLab02();
    // ---------------------------------------------
    // ---------------------------------------------
    // ---------------------------------------------


    // Funkcja Start
    public void Start()
    {
        Menu();
    }
    // Funkcja Start

    // Funkcja Menu
    private void Menu() {
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Task 4");
        System.out.println("5. Task 5");
        System.out.println("6. Task 6");
        System.out.println("7. Exit");
        System.out.println("Select a task: ");
        int choose = inputData.InputInt();
        switch (choose) {
            case 1:
                Task001Run();
                break;
            case 2:
                Task002Run();
                break;
            case 3:
                Task003Run();
                break;
            case 4:
                Task004Run();
                break;
            case 5:
                Task005Run();
                break;
            case 6:
                Task006Run();
                break;
            case 7:
              CloseProgramRun();
              break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie.");

        }

    } // Funkcja Menu


        // Funkcje Tasks
        private void Task001Run()
        {
            System.out.println("Podaj wartości a,b,c: ");
            int a = inputData.InputInt();
            int b = inputData.InputInt();
            int c = inputData.InputInt();
            tasksLab02.Task001(a,b,c);
        }

        private void Task002Run()
        {
            System.out.println("Podaj argument a: ");
            double a = inputData.InputDouble();
            System.out.println("Podaj argument b: ");
            double b = inputData.InputDouble();
            System.out.println("Podaj argument c: ");
            double c = inputData.InputDouble();
            //
            tasksLab02.Task002(a,b,c);
        }

        private void Task003Run()
        {
            System.out.println("Podaj x: ");
            int x = inputData.InputInt();
            System.out.println("Podaj y: ");
            int y = inputData.InputInt();
            System.out.println("Podaj z: ");
            int z = inputData.InputInt();

            System.out.println("Liczby przed posortowaniem");
            System.out.println("["+x+", "+y+", "+z+" ]");
            tasksLab02.Task003(x,y,z);
        }

        private void Task004Run()
        {
            System.out.println("true - Tak, false - Nie");
            System.out.print("Pada deszcz: ");
            boolean deszcz = inputData.InputBoolean();

            System.out.print("Czy jest autobus: ");
            boolean autobus = inputData.InputBoolean();

            tasksLab02.Task004(deszcz, autobus);
        }

        private void Task005Run()
        {
            System.out.println("true - Tak, false - Nie");
            System.out.print("Czy jest zniżka na samochód: ");
            boolean znizka = inputData.InputBoolean();

            System.out.print("Czy otrzymałeś premię: ");
            boolean podwyzka = inputData.InputBoolean();

            tasksLab02.Task005(znizka,podwyzka);
        }

        private void Task006Run()
        {
            System.out.println("Podaj x: ");
            int x = inputData.InputInt();
            System.out.println("Podaj y: ");
            int y = inputData.InputInt();


            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Iloczyn");
            System.out.println("4. Iloraz");
            System.out.println("5. Reszta z dzielenia");
            System.out.println("Wybierz operacje: ");
            int choose = inputData.InputInt();
            tasksLab02.Task006(x,y, choose);
        }

        private void CloseProgramRun()
        {
            System.exit(0);
        }
        // Funkcje Tasks
}
