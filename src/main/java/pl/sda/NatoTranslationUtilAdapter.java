package pl.sda;

public class NatoTranslationUtilAdapter implements TranslationUtil{
    @Override
    public String encode(String textToEncode) {
        return NatoUtil.encodeNato(textToEncode);
    }

    @Override
    public String decode(String textToDecode) {
        return NatoUtil.decodeNato(textToDecode);
    }
}
