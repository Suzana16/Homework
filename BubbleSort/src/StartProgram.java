import java.util.Random;

public class StartProgram {

	public static void main(String[] args) {
		SalesRepresentative[] reps = new SalesRepresentative[4];
			for (int i = 0; i < reps.length; i++) {
				SalesRepresentative representative = new SalesRepresentative();
				int sale = new Random().nextInt(7);
				int quota = new Random().nextInt(1000);
				representative.setSales(sale);
				representative.setQuota(quota);
				representative.calculateRevenue();
				reps[i] = representative;
			}
			BubbleSort x = new BubbleSort();
			x.sort(reps);
			for (int j = 0; j < reps.length; j++) {
				System.out.println("Revenue = " + reps[j].getRevenue());
			}
			
	}

}
