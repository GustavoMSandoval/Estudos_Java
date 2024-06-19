class Array {
    int[] vetor =  {1,8,2,7,12,0,-3};
    

public  Array() {
    
    for(int cont = 0;cont < vetor.length;cont ++){
        int num = vetor[cont];
        for(int con2 = 0;con2<=vetor[con2];con2++){
            if(num + vetor[con2] == 9){
                System.out.println(num + " " + vetor[con2]);
            }
        }

    }
}
public static void main(String[] args) {
    Array array = new Array();
    System.out.println(array);
}
}