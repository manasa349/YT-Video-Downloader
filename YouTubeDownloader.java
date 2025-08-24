import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YouTubeDownloader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter YouTube video URL:");
        String videoUrl = scanner.nextLine();

        // Replace with the full path to yt-dlp.exe
        String ytDlpPath = "C:\\Users\\misba\\AppData\\Roaming\\Python\\Python313\\Scripts\\yt-dlp.exe";
        String[] command = {
            ytDlpPath,
            "-o", "downloads/%(title)s.%(ext)s",
            videoUrl
        };

        try {
            ProcessBuilder builder = new ProcessBuilder(command);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("Download finished with exit code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
