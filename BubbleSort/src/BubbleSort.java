	
	public class BubbleSort {
		
		public void sort(SalesRepresentative[] input) {
			int length = input.length;
			SalesRepresentative temp = null;
			for (int i = 0; i < length; i++) {
				for (int j = 1; j < (length-i); j++) {
				if (input[j-1].getRevenue() < input[j].getRevenue()) {
					temp = input[j-1];
					input[j-1] = input[j];
					input[j] = temp;
					
				}
				}
			}
		}
	}
