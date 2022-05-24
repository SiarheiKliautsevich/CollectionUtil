import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program
{
    public static void main(String[] args)
    {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Текст один два");
        arrayList.add("три текст четыре");
        arrayList.add("пять шесть");

        System.out.println(getElementsByWord(arrayList, "текст"));
    }
    public static ArrayList <String> getElementsByWord (ArrayList<String> arrayList, String word)
    {

       return (ArrayList<String>) arrayList.stream().filter(a -> a.toUpperCase().contains(word.toUpperCase())).collect(Collectors.toList());

    }
}
