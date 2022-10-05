public class Raft
{
	private String numeProdus;
	private String dataExpirarii;
	private int cantitateProdus;
	public Raft(String numeProdus,String dataExpirarii,int cantitateProdus) 
	{
		this.numeProdus=numeProdus; 
		this.dataExpirarii=dataExpirarii;
		this.cantitateProdus=cantitateProdus;
	}
	public String getNumeProdus()		 
	{
		return numeProdus;
	}
	public String getDataExpirarii()	
	{
		return dataExpirarii;
	}
	public int getCantitateProdus()		
	{
		return cantitateProdus;
	}
	public String toString(int nr)		
	{
		return "Pe raft se afla "+this.getNumeProdus()+" ce expira la data de "+ this.getDataExpirarii()+" in cantitatea de "+ this.getCantitateProdus();
	}
	public void setCantitateProdus(int cantitate)		
	{
		this.cantitateProdus=this.cantitateProdus+cantitate;
	} 
}