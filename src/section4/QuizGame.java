package section4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

// Capitals Quiz by Theo Nakfoor



public class QuizGame {
	
	public static int score = 0;
	public static String username;
	
	public static void main(String[] args) throws IOException {
		
		username = JOptionPane.showInputDialog("Enter a username:");
		
		askQuestion("What is the capital of California?", "Sacramento");
		askQuestion("What is the capital of Oregon?", "Salem");
		askQuestion("What is the capital of Alaska?", "Juneau");
		
		JOptionPane.showMessageDialog(null, "Thanks for playing! Your final score is " + score + "!");
		saveStats(username, score);
		
		int lead = JOptionPane.showConfirmDialog(null, "Would you like to see the leaderboard?");

		if(lead == 0) {
			
		File file = new File("stats.txt");
		FileInputStream fis;
		
		try {
			
			fis = new FileInputStream(file);
			byte[] data = new byte[(int) file.length()];
			fis.read(data);
			fis.close();

			String str = new String(data, "UTF-8");
			JOptionPane.showMessageDialog(null, str);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		} else {
			
		}
		
		
		
	}
	
	public static void askQuestion(String question, String answer) {
		
		String answer1 = JOptionPane.showInputDialog(null, question);

		if(answer1.equals(answer)) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is now " + score);
		} else {
			score -= 1;
			JOptionPane.showMessageDialog(null, "Incorrect. The answer was: " + answer);
			JOptionPane.showMessageDialog(null, "Your score is now " + score);
		}
	}
	
	public static void saveStats(String username, int score) {
		String data = username + ":" + score + "\n";
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("stats.txt", true));
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
