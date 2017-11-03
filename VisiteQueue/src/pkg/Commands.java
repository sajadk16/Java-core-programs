package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Commands {

	public static void process(ArrayList<Patients> patients) {
		Collections.sort(patients, Patients.comparator);// sorting
		int totalMinutes = 480;

		Iterator<Patients> iter = patients.iterator();
		while (iter.hasNext()) {
			Patients vp = iter.next();
			if (vp.getTime() <= totalMinutes) {
				totalMinutes = totalMinutes - (int) vp.getTime();
			} else {
				iter.remove();
			}
		}
	}
}
