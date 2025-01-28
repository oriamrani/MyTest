package encodeDecode;

public class RotCode extends SecretCode{


    @Override
    public void encode(String str){
        encodedString = "";
        int i;
        for (i = 0; i < str.length(); i++) {
            encodedString = encodedString + mapCharToRot13Representation(str.charAt(i));
        }
    }

    @Override
    public void decode(String str){
        decodedString = "";
        int i;
        for (i = 0; i < str.length(); i++) {
            decodedString = decodedString + mapCharToRot13Representation(str.charAt(i));
        }
    }

    public char mapCharToRot13Representation(char c) {
        int position;
        if (('a' <= c) && (c <= 'z')) {
            position = c - 'a';
            position = (position + 13)%26;
            c = (char)(position + 'a');
        } else if (('A' <= c) && (c <= 'Z')) {
            position = c - 'A';
            position = (position + 13)%26;
            c = (char)(position + 'A');
        }
        return c;
    }

}
