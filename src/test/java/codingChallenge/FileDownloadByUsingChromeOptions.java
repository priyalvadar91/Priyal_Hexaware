package codingChallenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileDownloadByUsingChromeOptions {

    public static void main(String[] args) {

        String downloadPath="C:\\Users\\2000109316\\eclipse-workspace\\Priyal_Hexaware\\src\\test\\resources\\downloads";
        String fileName ="addresse.csv";
        File file = new File(downloadPath,fileName);

        Map<String,String> preferences = new HashMap<String, String>();
        preferences.put("download.default_directory",downloadPath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",preferences);
        WebDriver driver = new ChromeDriver(options);

        System.out.println(file.exists());
        driver.get("https://people.sc.fsu.edu/~jburkardt/data/csv/addresses.csv");
        System.out.println(file.exists());
        System.out.println("file is downloaded");
        System.out.println(file.exists());



    }
}
