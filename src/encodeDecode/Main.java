package encodeDecode;

public class Main {
    public static void main(String[] args) {

        SecretCode[] secretCodeArr = { new MorseCode(), new RotCode(), new ReverseCode() };

        for (SecretCode s : secretCodeArr) {
            s.encode("Hello World");
        }

        for (SecretCode s : secretCodeArr) {
            System.out.println("encoded " + s.getEncodedString());
        }

        for (SecretCode s : secretCodeArr) {
            String tempSt = s.getEncodedString();
            s.decode(tempSt);
            System.out.println("decoded " + s.getDecodedString());
        }

        for (SecretCode s : secretCodeArr) {
            String tempSt = s.getDecodedString();
            s.encode(tempSt);
            System.out.println("encoded " + s.getEncodedString());
        }

        for (SecretCode s : secretCodeArr) {
            String tempSt = s.getEncodedString();
            s.decode(tempSt);
            System.out.println("decoded " + s.getDecodedString());
        }
    }

}
