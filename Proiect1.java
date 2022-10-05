import java.util.Scanner;
class Proiect1
{
	public static void main(String args[])
	{	
		int opt;
		int total=0;
		String numeprodus;
		int cantitate;
		int i;
		//numeprodu=sc.next()
		System.out.println("Optiuni: ");
		System.out.println("1.Adaugare obiect pe raft ");
		System.out.println("2.Gasire cate produse de un anumit tip se cauta");
		System.out.println("3.Modificarea cantitati unui produs de pe raft ");
		System.out.println("4.Afisarea informatiilor despre un anumit produs");
		System.out.println("0.Iesire");
		System.out.println("Alegeti o optiune ");
		Scanner sc=new Scanner(System.in);
		Raft[] raft=new Raft[10];	
		opt=sc.nextInt();
		while(opt!=0)
		{
			if(opt==1)		
			{
				System.out.println("Introduceti numele produsului, data expirarii si cantitatea existenta a acelui obiect(exact in aceasta ordine)");
				raft[total]=new Raft(sc.next(),sc.next(),sc.nextInt());
				total++;
			}
			if(opt==2)		
			{
				System.out.println("Introduceti numele produsului despre care doriti sa aflati cantitatea");
				numeprodus=sc.next();
				for(i=0;i<total;i++)
				{
					if(raft[i].getNumeProdus().equals(numeprodus))
						System.out.println("Cantitatea prodului "+ numeprodus + " este " + raft[i].getCantitateProdus());	
				}	
				
			}	
			if(opt==3)		
			{
				System.out.println("Introduceti numele produsului al carui cantitate va fi modificata ");
				numeprodus=sc.next();
				
				System.out.println("Introduceti ce cantitate va fi adaugata ");
				cantitate=sc.nextInt();
				for(i=0;i<total;i++)
				{
					if(raft[i].getNumeProdus().equals(numeprodus))
						raft[i].setCantitateProdus(cantitate);
				}	
			}
			if(opt==4)		

			{
				System.out.println("Introduceti numele produsului despre care se doresc informatiile ");
				numeprodus=sc.next();
				
				for(i=0;i<total;i++)
				{
					if(raft[i].getNumeProdus().equals(numeprodus))
						System.out.println(raft[i].toString(i));
				}	
			
			}
			
			System.out.println("Optiuni: ");
			System.out.println("1.Adaugare obiect pe raft ");
			System.out.println("2.Gasire cate produse de un anumit tip se cauta");
			System.out.println("3.Modificarea cantitati unui produs de pe raft ");
			System.out.println("4.Afisarea informatiilor despre un anumit produs");
			System.out.println("0.Iesire");
			System.out.println("Alegeti o optiune ");
			opt=sc.nextInt();
			
				
		}
		


		
	}
}