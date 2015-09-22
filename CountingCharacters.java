import java.io.*;

public class CountingCharacters {
	
	public static void main (String args[]) {
		CountingCharacters cc = new CountingCharacters();
		cc.initText();
	}

	public void initText() {			
		try {
			tryToInitText();
		} catch (IOException exception) {
			System.out.println("Da ist etwas schief gelaufen!");
		}
	}
	
	private void tryToInitText() throws IOException {
		String countString = readUserInput("What is the input string? ");	
		System.out.println(countString + " has " + countString.length() + " characters.");		
	}
	
	private String readUserInput(String text) throws IOException {
		System.out.print(text);
		InputStream inputStream = System.in;
		BufferedReader buffReader = new BufferedReader (new InputStreamReader(inputStream));
		return buffReader.readLine();		
	}
}



