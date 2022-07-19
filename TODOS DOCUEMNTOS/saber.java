public Class Orden de Números {
	public int[] num;
	int j;
	int aux;
	int i;
 
	public Numero(int[]s){
		num = new int[s.length];
		for(int n=0; n < s.length; n++){
			num[n] = s[n];
		}
	}
 
	public void obtenerDatos(){
		Scanner leer = new Scanner(System.in);
 
		System.out.print("Introduzca el total de numeros que desea ingresar: ");
		int totNum = leer.nextInt();
 
		int[] num = new int[totNum];
 
		System.out.println("Introduzca " + totNum + " numero(s): ");
 
		for(int i = 0; i < num.length; i++){
			System.out.print("Numero " + (i+1) + ": ");
			num[i] = leer.nextInt();
		}
		System.out.println("\nLos numeros ingresados son: ");
		for(int i = 0; 1 < num.length; i++){
			System.out.println(num[i]);
		}
	}
 
	public void mayorMenor(){
		for(int i = 0; i < num.length; i++){
			for(j=i+1; j < num.length; j++){
				if(num[i] < num[j]){
					aux = num[i];
					num[i] = num[j];
					num[j] = aux;
				}
			}
		}
	}
 
	public String toString(){
		return "Numero de mayor a menor: " + num[j];
	}
}
}
