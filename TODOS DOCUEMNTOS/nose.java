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