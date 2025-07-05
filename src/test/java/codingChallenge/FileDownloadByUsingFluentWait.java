package codingChallenge;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.chromium.ChromiumDriver.*;
import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
public class FileDownloadByUsingFluentWait {
    public static String downloadPath ="C:\\Users\\2000109316\\eclipse-workspace\\Priyal_Hexaware\\src\\test\\resources\\downloads";
    public static String filename="addresses.csv";
    public static File file;

    public static void main(String[] args) {
        file = new File(downloadPath,filename);

        if (file.exists() && file.delete()){
            System.out.println("Existing file has been deleted successfully");
        }

            fileDownload();
    }
    private static void fileDownload() {
        Map<String,String > preferences = new HashMap<String, String>();
        preferences.put("download.default_directory",downloadPath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",preferences);
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://people.sc.fsu.edu/~jburkardt/data/csv/addresses.csv");

        FluentWait<File> wait = new FluentWait<File>(file)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class)
                .withMessage("file is not downloaded");

        System.out.println("file.exists:"+ file.exists());

        boolean isDownloaded = wait.until(f-> f.exists() && f.canRead());

        System.out.println("isDownloaded : " + isDownloaded);
        System.out.println("Downloaded file name:" +file.getName());
        System.out.println("file.exists:"+ file.exists());

//        System.out.println("------------StringBuffer-----------------");
//        String priyal = "Priyal";
//
//        StringBuffer sb = new StringBuffer(priyal);
//        sb.setCharAt(2,'*');
//        System.out.println(sb);
//
//        System.out.println("--------------StringBuilder---------------");
//        String str = "Priyal";
//        StringBuilder stringBuilder = new StringBuilder(str);
//        stringBuilder.setCharAt(2,'*');
//        System.out.println(stringBuilder);


;    }
}
