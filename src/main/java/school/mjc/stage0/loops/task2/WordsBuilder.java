package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;
        String phrase = "";
        while( count < chars.length){
            phrase = phrase.concat(Character.toString(chars[count]));
            count++;
        }
        System.out.print(phrase);
    }
}
