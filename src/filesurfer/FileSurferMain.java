package filesurfer;
import java.io.File;
import java.io.IOException;
import java.util.Scanner; 
public class FileSurferMain {
	public static void main(String[] args) {
		String dirname = "/tmp/user/java/bin";
		File d = new File(dirname);
		d.mkdir(); 
		Scanner sc = new Scanner(System.in);
		int mainOption = 0; 
		System.out.println("Welcome to File Surfer");
		System.out.println("Developed By Shane Messmer");
		System.out.println("========================"); 
		while (mainOption != 3) {
		System.out.println("Main Menu:"); 
		System.out.println("Input the number of the action you would like to take..."); 
		System.out.println("========================");
		System.out.println("1. Show all files in the directory.");
		System.out.println("2. Show file options"); 
		System.out.println("3. Quit the application"); 
		System.out.println("========================");
		mainOption = sc.nextInt();
		if (mainOption == 2) {
			int fileMenuOption = 0; 
			while (fileMenuOption != 4) {
			System.out.println("====================");
			System.out.println("File Menu");
			System.out.println("Input the number of the action you would like to take...");
			System.out.println("====================");
			System.out.println("1. Add File");
			System.out.println("2. Delete File");
			System.out.println("3. Search For File"); 
			System.out.println("4. Main Menu");
			System.out.println("====================");
			fileMenuOption = sc.nextInt();
			if (fileMenuOption == 4) {
				System.out.println("Returning to Main Menu");
				break; 
			} else if (fileMenuOption == 1) {
				System.out.println("What would you like to name the file?"); 
		    	 String fileName = sc.next(); 
		    	 File newFile = new File(dirname + "/"+ fileName); 
		    	 try {
					newFile.createNewFile();
		    	 } catch (IOException e) {
					e.printStackTrace();
				} 
				
			} else if ( fileMenuOption == 2) {
				System.out.println("What is the name of the file you'd like to delete?");
				String fileToDelete = sc.next(); 
				File thisFile = new File(dirname + "/"+fileToDelete); 
				if (thisFile.exists()) {
					thisFile.delete();
					System.out.println("File deleted"); 
					
				} else {
					System.out.println("No File exists by that name"); 
				}
 
				
			}

		}
		}
		else if (mainOption == 1) {
			String[] files = d.list();
			for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
			
		} else if (mainOption == 3) {
			System.out.println("Goodbye!");
			break; 
		}
		}
		
		
	}
	

}
