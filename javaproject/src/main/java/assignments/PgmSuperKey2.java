package assignments;

public class PgmSuperKey2 extends PgmSuperKey1{
	void print()
	{
		int d=this.sum(2,30);
		System.out.println(d);
		if(d%10==0)
		{
			System.out.println("Number is divisible by 10");
		}
		else
		{
			System.out.println("Number is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PgmSuperKey2 p=new PgmSuperKey2();
		p.print();
	}

}
