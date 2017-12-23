package Pattern;

import Extension.Subject;

public class HexaObserver extends Observers{
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("\n"+" Hexa Observer :  + " +Integer.toHexString(subject.getState()));
	}

}
