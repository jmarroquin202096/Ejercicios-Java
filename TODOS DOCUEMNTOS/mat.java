public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int tam;

		System.out.println("Primer número:");

		tam=teclado.nextINt();
		//Definir le tamaño del número
		int arr[]=new int[tam];
		//Declarar el tamaño tam
		System.out.println("Ingrese los "+tam+" valores enteros:");
		//Solo mostrar el número
		for(int i=0;i<tam;i++);
			//i=2
		{
			arr[i]=teclado.nextINt()
			//Rellenar los números
	}
	int aux=0;
	//Ordenar los números
	{
	for(int j=0;<tam;j++)
		//j=0
	{
		for(int i=0;<tam-1;i++)
			//i=0
		{
			if(arr[i]> arr[i+1])
			{
			aux=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=aux;
			}

		}
		{
		int k=0;
		System.out.println("Números ordenados: ");
		while(k<tam)

			System.out.println(arr[k]);
			K++;
	}
}