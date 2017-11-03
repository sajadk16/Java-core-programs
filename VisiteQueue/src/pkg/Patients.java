package pkg;

import java.util.Comparator;

import javax.print.attribute.standard.Compression;

public class Patients {
	private String _name;
	private float _payment;
	private float _time;

	public Patients() {

	}

	public Patients(String[] splitWord) {
		setName(splitWord[0]);
		setTime(splitWord[1]);
		setPayment(splitWord[2]);
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public float getPayment() {
		return _payment;
	}

	public void setPayment(String payment) {
		this._payment = Float.parseFloat(payment);
	}

	public float getTime() {
		return _time;
	}

	public void setTime(String time) {
		this._time = Float.parseFloat(time);
	}

	private float ratio() {
		return _payment / _time;
	}

	public static Comparator<Patients> comparator = new Comparator<Patients>() {
		@Override
		public int compare(Patients arg0, Patients arg1) {

			return (int) (arg1.ratio() - arg0.ratio());
		}
	};

}
