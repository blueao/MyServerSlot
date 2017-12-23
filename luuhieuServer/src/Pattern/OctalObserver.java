package Pattern;

import Extension.Subject;

public class OctalObserver  extends Observers{

	public  OctalObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject=subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("\n" + " Octal Observer :  + " +Integer.toOctalString(subject.getState()));
	}
}
