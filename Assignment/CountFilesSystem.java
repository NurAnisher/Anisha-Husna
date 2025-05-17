package Assignment;

import java.io.File;

public class CountFilesSystem {

    public static void main(String[] args) {
        File directory = new File("C:\\Users\\User\\IdeaProjects\\MyThreadsample2\\src\\main\\java\\Assignment");
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }

        int javaFileCount = 0;
        int issueCount = 0;

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".java")) {
                    javaFileCount++;
                }
                if (file.getName().toLowerCase().startsWith("issue")) {
                    issueCount++;
                }
            }
        }
        System.out.println("Number of Java Files = " + javaFileCount);
        System.out.println("Number of Issues = " + issueCount);
    }
}

