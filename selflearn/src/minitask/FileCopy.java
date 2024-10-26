package minitask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(String[] args) {
		//Source file path
		Path sourcePath = Paths.get("D:/Dinesh_Ganesan/2024/Accessibility/Sep-2024/PgC_New-Files/CSITE104798.pdf");
		
		//Destination file Path
		Path destiPath = Paths.get("D:/Dinesh_Ganesan/2024/Files/CSITE104798.pdf");
		
		try {
			Files.copy(sourcePath, destiPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Files Copied Successfully");
		} catch (IOException e) {
			System.out.println("Error while copying the file" + e.getMessage());
		}

	}

}
