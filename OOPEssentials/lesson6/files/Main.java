package lesson6.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("test_1.txt");

//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write("Hello this is test");
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            LocalDateTime start = LocalDateTime.now();
            //Fayl acilir
//            for (int i = 0; i < 10000; i++) { slow for loop starts

            //=========================WRITING====================
            OutputStream outputStream = Files
                    .newOutputStream(
                            Paths.get("test_new.txt"),
                            StandardOpenOption.CREATE,
                            StandardOpenOption.APPEND
                    );
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(outputStream)
            );

            for (int i = 0; i < 10000; i++) {
                bufferedWriter.write("\ntest_data " + i);
            }

            //Fayl baglanir
            bufferedWriter.close();
            //}slow for loop ends
            LocalDateTime end = LocalDateTime.now();

            long between = ChronoUnit.MILLIS.between(start, end);
            System.out.println(between);


            //=====================================READING========================
            InputStream inputStream = Files.newInputStream(
                    Paths.get("test_new.txt"),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.READ
            );
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();


//
//
//            inputStream.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //

    }
}
