package encodeDecode;

import java.util.HashMap;

public class MorseCode extends SecretCode {

    private HashMap<String, String> lettersToMorse;

    private HashMap<String, String> MorseToLetters;

    char[] LowerCaseAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    String[] morseCode = {".-", "-...", "-.-.", "-..",
            ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
    };


    public MorseCode() {

        lettersToMorse = new HashMap<String, String>();
        for (int i = 0; i < morseCode.length; i++) {
            lettersToMorse.put(String.valueOf(LowerCaseAlphabet[i]), morseCode[i]);
        }

        MorseToLetters = new HashMap<String, String>();
        for (int i = 0; i < morseCode.length; i++) {
            MorseToLetters.put(morseCode[i], String.valueOf(LowerCaseAlphabet[i]));
        }
    }

    @Override
    public void encode(String str) {
        encodedString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ')
                encodedString += " ";
            else
                encodedString += lettersToMorse.get(String.valueOf(ch).toLowerCase()) + " ";
        }
    }

    @Override
    public void decode(String str) {
        decodedString = "";
        String regex = " ";
        String[] myArray = str.split(regex);
        for (String s : myArray) {
            if(s == "")
                decodedString += " ";
            else
                decodedString += MorseToLetters.get(s);

        }
    }

    public String[] getMorseCode() {
        return morseCode;
    }
}