import java.lang.reflect.Array;
import java.util.*;

public class StringAnalysis {
    public static void main(String[] args) {
        String poem = "Земля!..\n" +
                "От влаги снеговой\n" +
                "Она еще свежа.\n" +
                "Она бродит сама собой\n" +
                "И дышит, как дежа.\n" +
                "Земля!..\n" +
                "Она бежит, бежит\n" +
                "На тыщи верст вперед,\n" +
                "Над нею жаворонок дрожит\n" +
                "И про нее поет.\n" +
                "Земля!..\n" +
                "Все краше и видней\n" +
                "Она вокруг лежит.\n" +
                "И лучше счастья нет, — на ней\n" +
                "До самой смерти жить.\n" +
                "Земля!..\n" +
                "На запад, на восток,\n" +
                "На север и на юг...\n" +
                "Припал бы, обнял Моргунок,\n" +
                "Да нехватает рук...\n" +
                "(Твардовский А.Т.)";
        char[] c  = {8212};
        String string    = new String(c);
        String[] punctMarc = {"!", ".", ",", string, "(", ")", "\n"};
        String[] words;

        String wordEqual;
        int counter;

        System.out.println(poem.toLowerCase() + "\n");
        StringBuilder stringBuilder = new StringBuilder(poem.toLowerCase());
//        System.out.println(stringBuilder.deleteCharAt(stringBuilder.indexOf("!")));

        for (String s : punctMarc) {
            delPunctMark(stringBuilder, s);
        }

//        stringBuilder.replace(stringBuilder.indexOf("\n"), stringBuilder.indexOf("\n") + 1, " ");

        System.out.println(stringBuilder);

        words = stringBuilder.toString().split(" ");
        for (int i = 0; i< words.length; i++) {
            words[i] = words[i].trim();
        }
        System.out.println(Arrays.toString(words));

        Set<String> arrWords = new HashSet<>(Arrays.asList(words));
        System.out.println(arrWords);
        arrWords = new TreeSet<>(Arrays.asList(words));
        System.out.println(arrWords);

        Map<String, Integer> mapWord = new HashMap<>();
        for (int i = 0; i < words.length - 1; i++) {
            wordEqual = words[i];
            counter = 0;
            for (int j = i+1; j < words.length; j++) {
                if (wordEqual.equals(words[i])) counter++;
            }
            mapWord.
        }
    }

    private static void delPunctMark(StringBuilder stringBuilder, String punctMarc) {
        int index = 0;
        while (index != -1) {

            index = stringBuilder.indexOf(punctMarc);
            if (index != -1)
                if (punctMarc == "\n")
                    stringBuilder.replace(index, index + 1, " ");
                else
                    stringBuilder.deleteCharAt(index);
        }
    }
}
