/* 2. SIMPLE FILE COPY UTILITY
Task: Copy a source file to a destination with progress indication.
Requirements:
- Copy "source.txt" to "backup.txt"
- Display file size before copying
- Use: Files.copy() with CopyOption (REPLACE_EXISTING)
- Verify copy by checking both file sizes match */

package FileHandling;

import java.nio.file.*;
import java.io.IOException;

public class FileAPI2 {

    public static void main(String[] args) {

        Path source = Paths.get("src/FileHandling/source.txt");
        Path destination = Paths.get("src/FileHandling/destination.txt");

        try {
            if (!Files.exists(source)) {
                System.out.println("Source file does not exist ❌");
                return;
            }
            long sourceSize = Files.size(source);
            System.out.println("Source file size: " + sourceSize + " bytes");

            // Progress indication
            System.out.println("Copying file...");

            // Copy file
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Copy completed ✔");

            // Verify copy by comparing sizes
            long destinationSize = Files.size(destination);

            if (sourceSize == destinationSize) {
                System.out.println("Verification successful ✅ File sizes match.");
            } else {
                System.out.println("Verification failed ❌ File sizes do not match.");
            }

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}

