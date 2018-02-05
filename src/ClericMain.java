
public class ClericMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cleric c = new Cleric();
		c.name = "宮本";
		c.hp = 20;
		c.mp = 5;

		System.out.println("聖職者" + c.name + "はいぇえええええい" );
		//メソッドの呼び出し

		c.avadaKedabura();
		System.out.println("体力は" + c.hp + "魔力は" + c.mp);

		c.damage(49);
		System.out.println("体力は" + c.hp + "魔力は" + c.mp);

		c.pray(3);
		System.out.println("体力は" + c.hp + "魔力は" + c.mp);

	}

}
