package pl.sda;

public class MorseTranslationUtilAdapter implements TranslationUtil{
    @Override
    public String encode(String textToEncode) {
        return MorseUtil.encodeMorse(textToEncode);
    }

    @Override
    public String decode(String textToDecode) {
        return MorseUtil.decodeMorse(textToDecode);
    }
}
