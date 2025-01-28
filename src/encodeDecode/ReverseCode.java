package encodeDecode;

public class ReverseCode extends SecretCode{


    @Override
    public void encode(String str){
        encodedString = new StringBuilder(str).reverse().toString();
        decodedString = str;
    }

    @Override
    public void decode(String str){
        decodedString = new StringBuilder(str).reverse().toString();
        encodedString = str;
    }
}
