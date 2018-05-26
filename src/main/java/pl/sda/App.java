package pl.sda;
//todo add unit tests
public class App 
{
    public static void main( String[] args ) {

        String filePath = "C:\\sda\\translator\\text.txt";
        TranslationType type = TranslationType.NATO; //MORSE

        if (args != null && args.length > 0){
            filePath = args[0];
            type = TranslationType.valueOf(args[1]);
        }

        TranslatorFileReader reader = new TranslatorFileReader();
        String fileContent = reader.read(filePath);

        TranslationUtil translationUtil = TranslationUtilFactory.produce(type);

        String encodeNato = translationUtil.encode(fileContent);
        System.out.println(encodeNato);

    }
}
