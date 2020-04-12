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
        char[] c = {8212};
        String hyphen = new String(c);
        String[] punctMarc = {"!", ".", ",", hyphen, "(", ")", "\n"};
        String[] words;

//        String wordEqual;
//        int counter;

        System.out.println(poem + "\n");
        StringBuilder poemBuilder = new StringBuilder(poem.toLowerCase());

        System.out.println(poemBuilder);

        words = arrPoemBuilder(poemBuilder,punctMarc);

        System.out.println(Arrays.toString(words));

        setWords(words);

        mapWords(words);
    }

    private static void mapWords(String[] words) {
        String wordEqual;
        int counter;
        Map<String, Integer> mapWord = new HashMap<>();
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals("0")) continue;
            wordEqual = words[i];
            counter = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (wordEqual.equals(words[j])) {
                    counter++;
                    words[j] = "0";
                }
            }
            mapWord.put(words[i], counter);
        }
        System.out.println(mapWord);
    }

    private static void setWords(String[] words) {
        Set<String> arrWords = new HashSet<>(Arrays.asList(words));
        System.out.println(arrWords);
        arrWords = new TreeSet<>(Arrays.asList(words));
        System.out.println(arrWords);
    }

    private static String[] arrPoemBuilder(StringBuilder poemBuilder, String[] punctMarc) {
        for (String s : punctMarc) {
            int index = 0;
            while (index != -1) {
                index = poemBuilder.indexOf(s);
                if (index != -1)
                    if (s.equals("\n"))
                        poemBuilder.replace(index, index + 1, " ");
                    else
                        poemBuilder.deleteCharAt(index);
            }
        }
        return poemBuilder.toString().split(" ");
    }
}
