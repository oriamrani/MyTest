package encodeDecode;

public abstract class SecretCode {

    protected String encodedString;
    protected String decodedString;

    public abstract void encode(String encodedString);
    public abstract void decode(String decodedString);


    public String getEncodedString() {
        return encodedString;
    }
    public String getDecodedString() {
        return decodedString;
    }
}
