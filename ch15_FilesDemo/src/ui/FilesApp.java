package ui;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesApp {

	public static void main(String[] args) throws IOException {
		// p. 463 - Create Directory and File
		
		String dirString = "c:/temp";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("directory created");
		}
		else {
			System.out.println("directory "+dirString+" already exists.");
		}
		
		String fileString = "products2.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			System.out.println("create a file");
		    Files.createFile(filePath);
		}
		else {
			System.out.println("File already exists");
		}
		
		System.out.println("File name:      "+filePath.getFileName());
		System.out.println("Absolute Path:      "+filePath.toAbsolutePath());
		System.out.println("Is writable:      "+Files.isWritable(filePath));
			
		// Display files in a directory
		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory: "+dirPath.toAbsolutePath());
			System.out.println("Files:");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p: dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("       "+ p.getFileName());
				}
			}
		}

	}

}
