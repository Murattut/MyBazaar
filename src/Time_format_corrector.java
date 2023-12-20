import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_format_corrector {
    public static void main(String[] args) {
        String orijinalMetin = "Bu bir örnek tarih 12.12.2023 içeriyor.";

        String yeniMetin = tarihFormatiniDegistir(orijinalMetin, "dd.MM.yyyy", "dd-MM-yyyy");

        System.out.println("Orijinal Metin: " + orijinalMetin);
        System.out.println("Yeni Metin: " + yeniMetin);
    }

    private static String tarihFormatiniDegistir(String Old_string, String eskiFormat, String yeniFormat) {
        SimpleDateFormat eskiSdf = new SimpleDateFormat(eskiFormat);
        SimpleDateFormat yeniSdf = new SimpleDateFormat(yeniFormat);

        String yeniMetin = Old_string;

        try {
            Date date = eskiSdf.parse(Old_string);
            yeniMetin = yeniSdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return yeniMetin;
    }
}
