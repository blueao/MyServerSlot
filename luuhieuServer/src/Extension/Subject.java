package Extension;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

import Pattern.Observers;

public class Subject {

	private List<Observers> observers = new ArrayList<Observers>();
	private int state;
	public int getState()
	{
		return state;
	}
	public void setState(int state)
	{
		this.state = state;
		notifyAllObersers();
	}
	public void attach(Observers observer)
	{
		observers.add(observer);
	}
	public void notifyAllObersers()
	{
		for (Observers observer : observers)
		{
			observer.update();
		}
	}
    public  <T> void notify(Object...   _t )
    {
        for (int i = 0; i < _t.length; i++)
        {
            for (int j = 0; j < observers.size(); j++)
            {
                if (_t[i].equals(observers.get(j)))
                {
                    observers.get(j).update();
                }
            }
        }
    }
}
