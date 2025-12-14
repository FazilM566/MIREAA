package ПР21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory {


    public static List<String> getFirstFiveFiles(String directoryPath) {
        List<String> fileList = new ArrayList<>();

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {

                int limit = Math.min(5, files.length);
                for (int i = 0; i < limit; i++) {
                    fileList.add(files[i].getName());
                }
            }
        } else {
            System.out.println("Каталог не существует или не является директорией");
        }

        return fileList;
    }


    public static void main(String[] args) {

        String path = "C:\\Users\\fazil\\Desktop";

        List<String> firstFiveFiles = getFirstFiveFiles(path);

        System.out.println("Первые 5 элементов каталога:");
        for (String fileName : firstFiveFiles) {
            System.out.println(fileName);
        }
    }
}