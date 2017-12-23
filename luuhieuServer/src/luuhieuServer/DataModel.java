package luuhieuServer;

import java.util.ArrayList;
import java.util.List;

public class DataModel<T> {
	public WeaponsModel weaponUse;
	public ArmorsModel armorUse;
	private List<T> composite;
	public DataModel(WeaponsModel wepon,ArmorsModel armor) {
		this.weaponUse = wepon;
		this.armorUse = armor;
		composite = new ArrayList<T>();
	}
	public <T> void setWeaponUse(T t) {
		this.weaponUse = (WeaponsModel) t;
	}

	public WeaponsModel getWeaponUse() {
		return weaponUse;
	}

	public <T> void setArmorUse(T t) {
		this.armorUse = (ArmorsModel) t;
	}

	public ArmorsModel getArmorUse() {
		return armorUse;
	}

	public void add(T t)
	{
		composite.add(t);
	}
	public void remove(T t)
	{
		composite.remove(t);
	}
	public List<T> getListComposite()
	{
		return composite;
	}

};
