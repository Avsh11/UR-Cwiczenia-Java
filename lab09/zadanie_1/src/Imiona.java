import java.util.*;
public class Imiona {
    public List<String> listimiona = new ArrayList<String>();

    public void addImiona(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Podaj imie: ");
            String text = input.next();
            if(Objects.equals(text, "-"))
                break;

            listimiona.add(text);
        }

        System.out.println("Unikalne imiona: " + listimiona.stream().distinct().count());
    }
}
