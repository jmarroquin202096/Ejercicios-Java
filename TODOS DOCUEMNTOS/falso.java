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
System.out.println("\nLos numeros ingresados SIN ORDENAR son: ");
for(int i = 0; 1 < num.length; i++){
System.out.println(num[i]);
}
//////////////////////////////
Arrays.sort(num);
////////////////////////////
System.out.println("\nLos numeros ingresados ORDENADOS ASCENDENTEMENTE son: ");
for(int i = 0; i < num.length; i++){
System.out.println(num[i]);
}
 
System.out.println("\nLos numeros ingresados ORDENADOS  DESCENDENTEMENTE son: ");
for(int i =num.length-1; i>=0; i--){
System.out.println(num[i]);
}
}