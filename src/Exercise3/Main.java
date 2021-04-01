package Exercise3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

	public static void main(String[] args) {

		
		
		
		Computer hppavillon = new Computer("Hp_Pavillon");

		Cpu c1 = new Cpu(7, "Razen6Cpu");
		Gpu c2 = new Gpu(10, "Razen7Gpu");
		GraphCard Gc1 = new GraphCard("RadeonGraphCard6");
		KeyBoard Kb = new KeyBoard(1, "HPKey");
		Memory m = new Memory(12, "6go_Memory");
		Monitor mn = new Monitor(42, "SamsungMonitor");
		ShoppingCartCalculator shpCal = new ShoppingCartCalculator();
		System.out.println(mn.getClass().getName());
		hppavillon.addanItem(c1);
		hppavillon.addanItem(c2);
		hppavillon.addanItem(Gc1);
		hppavillon.addanItem(Kb);
		hppavillon.addanItem(m);
		hppavillon.addanItem(mn);
		Gc1.addanItem(c2);
		Gc1.addanItem(m);
		
		
		System.out.println(hppavillon.operation());
		//Let's build a second computer with sames components twice, twice the price
		
		Cpu c1_bis = new Cpu(14, "Razen6Cpu_bis");
		Gpu c2_bis = new Gpu(20, "Razen7Gpu_bis");
		GraphCard Gc1_bis = new GraphCard("RadeonGraphCard6_bis");
		KeyBoard Kb_bis = new KeyBoard(2, "HPKey_bis");
		Memory m_bis = new Memory(24, "6go_Memory_bis");
		Monitor mn_bis = new Monitor(84, "SamsungMonitor_bis");
		Computer hppavillon_bis = new Computer("Hp_Pavillon_bis");
		
		
		hppavillon_bis.addanItem(c1_bis);
		hppavillon_bis.addanItem(c2_bis);
		hppavillon_bis.addanItem(Gc1_bis);
		hppavillon_bis.addanItem(Kb_bis);
		hppavillon_bis.addanItem(m_bis);
		hppavillon_bis.addanItem(mn_bis);
		Gc1_bis.addanItem(c2_bis);
		Gc1_bis.addanItem(m_bis);

		System.out.println(hppavillon_bis.operation());
		// Let's Build a super computer with composed of two different computer
		Computer Superhppavillon = new Computer("SuperHp_Pavillon");
		Superhppavillon.addanItem(hppavillon);
		Superhppavillon.addanItem(hppavillon_bis);
		
		System.out.println(Superhppavillon.operation());
		
		//Let's Build a gigantic Super Computer with a lot of added ITEM all at a price of 1 to track truthfullness
		Computer Superhppavillon_MainFraime = new Computer("SuperHp_Pavillon_MainFraime");

		Cpu c1_third = new Cpu(1, "Razen6Cpu_third");
		Gpu c2_third = new Gpu(1, "Razen7Gpu_third");
		GraphCard Gc1_third = new GraphCard("RadeonGraphCard6_third");
		KeyBoard Kb_third = new KeyBoard(1, "HPKey_third");
		Memory m_third = new Memory(1, "6go_Memory_third");
		Monitor mn_third = new Monitor(1, "SamsungMonitor_third");
		
		Superhppavillon_MainFraime.addanItem(Superhppavillon);
		Superhppavillon_MainFraime.addanItem(hppavillon_bis);
		Superhppavillon_MainFraime.addanItem(hppavillon);
		
		Superhppavillon_MainFraime.addanItem(c1_third);
		Superhppavillon_MainFraime.addanItem(c2_third);
		Superhppavillon_MainFraime.addanItem(Gc1_third);
		Superhppavillon_MainFraime.addanItem(Kb_third);
		Superhppavillon_MainFraime.addanItem(m_third);
		Superhppavillon_MainFraime.addanItem(mn_third);
		Gc1_third.addanItem(c2_third);
		Gc1_third.addanItem(m_third);
		
		
		System.out.println(Superhppavillon_MainFraime.operation());
	}

}
