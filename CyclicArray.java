public class CyclicArray {
    public class cyclicArray {
        public static void main(String[] args) {
            System.out.println("Given Array Elements: ");
            int a[] = {1, 2, 3, 4, 5, 6, 7 ,8 ,9};
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println("After Cyclic: ");
            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int n = arr.length;
            int k = 1;

            int[] temp;

            temp = new int[n];

            for (int i = 0; i < k; i++)
                temp[i] = arr[i];

            int x = k;
            for (int i = 0; x < n; i++) {
                arr[i] = arr[x++];
            }

            x = 0;

            for (int i = n - k; i < n; i++)
                arr[i] = temp[x++];


            for (int i = 0; i < 7; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
