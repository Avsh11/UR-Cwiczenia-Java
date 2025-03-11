package Tasks;

import InputData.InputData;
import InputData.InputData;
import InputData.RandomValue;
import java.util.Arrays;

public class Run
{
    InputData inputData = new InputData();
    TasksLab04 task = new TasksLab04();

    public void Start()
    {
        Menu();
    }

    private void Menu()
    {
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Task 4");
        System.out.println("5. Task 5");
        System.out.println("6. Task 6");
        System.out.println("7. Task 7");
        System.out.println("8. Exit program");

        int option = inputData.InputInt();

        switch(option)
        {
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
                                        Task007Run();
                                        break;
                                        case 8:
                                            CloseProgramRun();
                                            break;

            default:
                System.out.println("Błędne dane. Wybierz ponownie.");

        }

    } // Koniec funkcji menu

    // Sekcja Task00XRun
        private void Task001Run()
        {
            System.out.println("Podaj początek przedziału do losowania: ");
            int limit_1 = inputData.InputInt();
            System.out.println("Podaj koniec przedziału do losowania: ");
            int limit_2 = inputData.InputInt();
            System.out.println("Podaj ilość elementów do wylosowania: ");
            int quantity = inputData.InputInt();

            int[]array = RandomValue.RandValue(limit_1,limit_2,quantity);

            System.out.println("Suma elementów tablicy wynosi: "+task.Task001SU(array));
            System.out.println("Średnia elementów tablicy wynosi: "+task.Task001SR(array));
        }

        private void Task002Run()
        {
            task.Task002();
        }

        private void Task003Run()
        {
            task.Task003();
        }

        private void Task004Run()
        {
            String[] tab = new String[5];
            for(int i = 0; i < tab.length; i++)
            {
                System.out.println("Podaj 5 słów do tablicy: ");
                tab[i] = inputData.InputString();
            }

            String[] reverse = task.Task004(tab);
            System.out.println("Wynik działania: "+Arrays.toString(reverse));
        }

        private void Task005Run()
        {
            int[] tab = new int[8];
            for (int i = 0; i < tab.length; i++)
            {
                System.out.println("Podaj 8 liczb do tablicy: ");
                tab[i] = inputData.InputInt();
            }
            System.out.println("Liczby nieuporządkowane: "+Arrays.toString(tab));
            System.out.println("Liczby uporządkowane: "+Arrays.toString(task.Task005(tab)));
        }

        private void Task006Run()
        {
            int[] tab = new int[5];
            for(int i = 0; i < tab.length; i++)
            {
                System.out.println("Podaj 5 liczb do tablicy: ");
                tab[i] = inputData.InputInt();
            }

            System.out.println("Twoje liczby przed działaniem silnia: "+Arrays.toString(tab));

            int[] tabS = new int[5];
            for(int i = 0; i < tabS.length; i++)
            {
                tabS[i] = task.Task006(tabS[i]);
            }

            System.out.println("Twoje liczby po działaniu silnia: "+Arrays.toString(tabS));
        }

        private void Task007Run()
        {
            String[] tab_1 = {"Norway", "Sweden", "Finland"};
            String[] tab_2 = {"Norway", "Sweden", "Finland"};

            System.out.println("Tablica 1: " + Arrays.toString(tab_1));
            System.out.println("Tablica 2: " + Arrays.toString(tab_2));

            if(task.Task007(tab_1, tab_2))
            {
                System.out.println("Tablice są takie same");
            }
            else
            {
                System.out.println("Tablie się różnią");
            }
        }

        private void CloseProgramRun()
        {
            System.exit(0);
        }

    // Sekcja Task00XRun


} // Koniec klasy Run
