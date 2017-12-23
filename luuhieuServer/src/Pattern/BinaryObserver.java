package Pattern;


import Extension.Subject;

public class BinaryObserver extends Observers{

	public BinaryObserver(Subject subject) {
		this.subject = subject;
				this.subject.attach(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("\n" +" Binary Observer :  + " +Integer.toBinaryString(subject.getState()));
	}
}
