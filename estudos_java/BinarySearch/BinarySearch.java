public class BinarySearch {



    static boolean BiSearch(int doors[],int size,int find) //Static faz com que não seja necessário instanciar
    {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right-left)/2;
        
            if(doors[mid] == find) {
                System.out.println(doors[mid] + "f");
                return true;
            }else if (doors[mid] < find) 
            {
                System.out.println(doors[mid] + "l");
                left = mid + 1;
            } else {
                System.out.println(doors[mid] + "r");
                right = mid - 1;
            }
            
        }

        return false;
    }


    public static void main(String[] args) {
        
        int[] doors = {1,2,6,7,8,12,15,123,567,890,1001,1234,1236};
        int find = 890;
        int size = doors.length;

        boolean found = BiSearch(doors,size,find);

        System.out.println(found ? "encontrado" : "perdido");
    }
}
