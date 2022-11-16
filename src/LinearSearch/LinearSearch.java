package LinearSearch;

public class LinearSearch {

    public int search(int[] a, int key){
        for (int i = 0; i < a.length; i++){
            if (a[i] == key){
                return i;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        System.out.println("asdfsd");
        int[] a = {1,2,3,45,8};
        LinearSearch rv = new LinearSearch();
        int v = rv.search(a,45);
        System.out.println(v);
        if (v>0){
            System.out.println("the key is found at the location "+v);
        }else{
            System.out.println("Key is not found.");
        }
    }
}
