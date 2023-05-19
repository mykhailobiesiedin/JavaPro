package homework_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//    * Java Homework 5
//    @author Mykhailo Biesiedin
//    @version 19 May 2023
public class Homework5 {
    public static void main(String[] args) {
        String text = "I like cars very much Cars are very beautiful and comfortable I use cars very often";
        String[] words = text.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));

        Set<String> modifiedText = new HashSet<>();
        List<String> allWords = Arrays.asList(words);

        System.out.println(modifiedText);

        modifiedText.addAll(allWords);
        System.out.println("Unique words : " + modifiedText);


        for (String word : modifiedText) {
            int count = 0;
            for (String w : allWords) {
                if (word.equals(w)) {
                    count++;
                }
            }
            System.out.println(word + " : " + count);
        }
    }
}
