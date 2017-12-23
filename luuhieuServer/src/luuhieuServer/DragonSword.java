package luuhieuServer;

import java.util.Random;

public class DragonSword extends WeaponsModel {
	public void init()
	{
		setName("DragonSword");
		setdame(new Random().nextInt((50-40)+1)+40);
		setAttribute(new Random().nextInt(5));
		setID(new Random().nextInt(999));
		setLevel(1);
		setSlot( new int[new Random().nextInt(3)]);
		setType(1);
		setUpgrade(new Random().nextInt(3));
	}

}
