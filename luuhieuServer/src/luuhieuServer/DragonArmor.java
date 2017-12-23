package luuhieuServer;

import java.util.Random;

public class DragonArmor extends ArmorsModel{
	public void init()
	{
		setName("DragonArmor");
		setDef(new Random().nextInt(20));
		setAttribute(new Random().nextInt(5));
		setID(new Random().nextInt(999));
		setLevel(1);
		setSlot( new int[new Random().nextInt(3)]);
		setType(1);
		setUpgrade(new Random().nextInt(3));
	}
}
