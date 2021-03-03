import java.util.*;
public class MarkSheet {
	private  List<Integer> lm=new ArrayList<Integer>();
	
	
	public List<Integer> getLm() {
		return lm;
	}

	public void setLm(int i) {
		this.lm.add(i);
	}
	
	
	/*
	 * Gives Average of the grades
	 * @param lm ArrayList as an input
	 * @return Average of the grades
	 */
	
	public double Avg(List<Integer> lm)throws ArithmeticException
	{
		int sum=0;
		for(int i=0;i<lm.size();i++)
		{
			sum+=lm.get(i);
		}
		return sum/lm.size();	
		
	}
	
	/*
	 * Print MaxGrade from the Given Array List
	 * @param lm ArrayList Input
	 * @return Maximum from the Array List
	 */
	
	public int MaxGrade(List<Integer> lm)
	{
		int mxgrade=lm.get(0);
		for(int i=0;i<lm.size();i++)
		{
			if (mxgrade<lm.get(i)){
				mxgrade=lm.get(i);
			}
		}
		return mxgrade;
	}
	
	/*
	 * Print MinGrade from the Given Array List
	 * @param lm ArrayList Input
	 * @return Minimum from the Array List
	 */
	
	public int MinGrade(List<Integer> lm)
	{
		int mngrade=lm.get(0);
		for(int i=0;i<lm.size();i++){
			if (mngrade>lm.get(i)){
				mngrade=lm.get(i);
			}
		}
		return mngrade;
	}
	
	/*
	 * Pass Percentage of Students
	 * @param lm ArrayList Input
	 * @return Percentage of Students who passed
	 */
	
	public double PassPerc(List<Integer> lm)throws ArithmeticException
	{
		int tot=0;
		for(int i=0;i<lm.size();i++){
			if(lm.get(i)>=40){
				tot+=1;
			}
		}
		return (tot*100)/lm.size();
	}
	
	public static void main(String...arg)
	{
		MarkSheet m=new MarkSheet();
		Scanner sc=new Scanner(System.in);
		int n;
		int grades;
		try{
		System.out.print("Enter Number of Students : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Grades ");
			grades=sc.nextInt();
			m.setLm(grades);
		}
		sc.close();
	
		System.out.println(m.Avg(m.lm));
		System.out.println(m.MaxGrade(m.lm));
		System.out.println(m.MinGrade(m.lm));
		System.out.println(m.PassPerc(m.lm));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number of Students cannot be Zero....");
		}
		catch(IndexOutOfBoundsException c)
		{
			System.out.println("Index Out Of Bounds Exception occurs ");
		}
	}

}
