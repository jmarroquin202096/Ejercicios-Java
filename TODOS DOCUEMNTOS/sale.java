public static void main(String[] args) {     
    int [] a  = {7,2,4,8,3,9,1,5,10,6};
    int menor;

    for(int i = 0; i < 10; i++){
        menor = a[0];

        if (a[i] < menor){
            menor = a[i];
        }
        else{
            if (a[i] > menor){
              menor = menor;
            }      
        }
    }
    System.out.println(Arrays.toString(a));
}
int a[] = {5,3,2,7,10,1};
    for (int x = 0; x < a.length; x++) {
        for (int i = 0; i < a.length-x-1; i++) {
            if(a[i] < a[i+1]){
                int tmp = a[i+1];
                a[i+1] = a[i];
                a[i] = tmp;
            }
        }
    }
    int [] a  = {7,2,4,8,3,9,1,5,10,6};
  Arrays.sort(a);
  System.out.println(Arrays.toString(a));
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 public static void main(String[] args) {
    int [] a  = {7,2,4,8,3,9,1,5,10,6};
    int temporal = 0;

    for (int i = 0; i < a.length; i++) {
        for (int j = 1; j < (a.length - i); j++) {
            if (a[j - 1] > a[j]) {
                temporal = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temporal;
            }
        }
    }
    System.out.println(Arrays.toString(a));
}
public static void main(String[] args) {
        optimizedBubbleSort(new int[]{1,2,4,5,6}); // Iteración 0, array ordenado
        optimizedBubbleSort(new int[]{11,2,44,5,16}); // Iteración 2, array ordenado
        optimizedBubbleSort(new int[]{0,8,74,5,1}); // Iteración 3, array ordenado
}

    private static void optimizedBubbleSort(int [] list){
        for(int i =0; i< list.length; i++){
            boolean sorted = true; // asumo que para la iteración i el listado es ordenado,
            for(int j =0; j< list.length - i - 1; j++){ // en cada iteración los elementos desde la posición (length-i) estan ordenados, por lo tanto solo recorro hasta esa posición
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    sorted = false; 
                }
            }
            if(sorted){ 
                System.out.println(String.format("Iteración %s, array ordenado", i));
                return;
            }
        }
    }