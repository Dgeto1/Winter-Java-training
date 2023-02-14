import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

    }

    public static String SameStrings(String wordOne, String wordTwo){
        String sameSt = "";

        char[] firstWord = new char[wordOne.length()];
        char[] secondWord = new char[wordTwo.length()];

        for(int i=0; i<firstWord.length; i++)
        {
            firstWord[i] = wordOne.charAt(i);
        }
        for(int i=0; i<secondWord.length; i++)
        {
            secondWord[i] = wordTwo.charAt(i);
        }

        for(int i=0; i<firstWord.length; i++)
        {
            for(int j=0; j<secondWord.length; j++)
            {
                if(firstWord[i] == secondWord[j])
                {
                    sameSt+=firstWord[i];
                }
            }
        }
        return  sameSt;
    }
}