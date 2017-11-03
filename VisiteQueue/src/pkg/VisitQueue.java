package pkg;

import java.util.*;

public class VisitQueue {
	public static void main(String[] args) {
		ArrayList<Patients> patients = new ArrayList<>();

		IO.input(patients, "input Clinic Visiting Queue.txt");

		Commands.process(patients);

		IO.output(patients, "output Clinic Visiting Queue.txt");
	}
}
