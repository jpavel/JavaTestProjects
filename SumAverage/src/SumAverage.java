
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0.0 ;
		for(int i=0; i<args.length; i++){
			sum+=Double.parseDouble(args[i]);
		}
		System.out.println("The sum is "+sum);
		double avg = sum / (double)args.length;
		System.out.println("The average is "+avg);
		
	}

}
