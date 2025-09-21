public class MyArray {

    int[] arr = new int[0]; // Zero sized array

    public void add(int num){

        int[] temp = new int[arr.length+1]; // Array reconstruction

        // Copy values
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length] = num; // new value
        arr = temp;

    }

    void showAll() {

        for (int j : arr) System.out.print(j + " ");
        System.out.println();

    }

    public  static void main(String[] arg){

        MyArray a = new MyArray();
        a.showAll();

        a.add(1);
        a.showAll();

        a.add(2);
        a.showAll();

        a.add(3);
        a.showAll();

    }

}