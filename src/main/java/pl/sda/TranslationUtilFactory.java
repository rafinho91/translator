package pl.sda;

public class TranslationUtilFactory {
    public static TranslationUtil produce(TranslationType type){
        if (type.equals(TranslationType.MORSE)){
            return new MorseTranslationUtilAdapter();
        }
        if (type.equals(TranslationType.NATO)){
            return new NatoTranslationUtilAdapter();
        }
        return null;
    }
}
