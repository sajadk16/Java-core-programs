package pkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IO {

	public static void input(ArrayList<Patients> patients, String path) {
		try {
			FileReader reader = new FileReader(path);
			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();

			while (line != null) {
				String[] words = line.split("\\s");
				patients.add(new Patients(words));
				line = br.readLine();
				words = null;
			}
			reader.close();
		} catch (IOException ioe) {
			System.err.println("Error: " + ioe);
		}
	}

	public static void output(ArrayList<Patients> patients, String path) {

		try {
			FileWriter writer = new FileWriter(path, false);
			writer.write("Num " + " name    " + " time " + "  payment ");
			writer.write("\r\n");
			int i = 1;
			for (Patients vp : patients) {
				writer.write((i) + "-    " + vp.getName() + "      "
						+ vp.getTime() + "    " + vp.getPayment());
				writer.write("\r\n");
				i++;
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
