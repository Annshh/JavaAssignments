//Heap Class

public class HeapClass {
 
   int[] arr;
 
   HeapClass() {
       this.arr = new int[0];
   }
 
   void insert(int number) {
       int newarr[] = new int[this.arr.length + 1];
       for (int i = 0; i < this.arr.length; i++) {
           newarr[i] = this.arr[i];
       }
       newarr[this.arr.length] = number;
       this.arr = newarr;
       if (this.arr.length / 2 > 0) {
           this.heapify(this.arr.length / 2 - 1, this.arr.length);
       }
   }
 
   void heapify(int index, int n) {
       int current = index;
       int left = 2 * index + 1;
       int right = 2 * index + 2;
       if (left < n && arr[left] > arr[current]) {
           current = left;
       }
       if (right < n && arr[right] > arr[current]) {
           current = right;
       }
       if (current != index) {
           int swap = arr[index];
           arr[index] = arr[current];
           arr[current] = swap;
           heapify(index / 2, n);
       }
   }
 
   void delete(int n) {
       int lastNode = this.arr[n - 1];
       this.arr[n - 1] = this.arr[0];
       this.arr[0] = lastNode;
       heapify(0, n - 1);
   }
 
   void printHeap() {
       for (int i = 0; i < this.arr.length; ++i) {
           System.out.print(this.arr[i] + " ");
       }
       System.out.println();
   }
 
   public static void main(String[] args) {
 
       // Sorting test cases
       System.out.println("**Test case 1**");
       int arr1[] = { 2, 5, 1, 5, 3, 4};
       heapSort(arr1);
       System.out.println();
       System.out.println("**Test case 2**");
       int arr2[] = { 10, 54, 34, 675, 232,123 };
       heapSort(arr2);
   }
 
   static void heapSort(int[] arr) {
       int n = arr.length;
       HeapClass maxHeap = new HeapClass();
       for (int i = 0; i < arr.length; i++) {
           maxHeap.insert(arr[i]);
       }
       System.out.println("Before Sorting:");
       maxHeap.printHeap();
       for (int i = arr.length; i > 0; i--) {
           maxHeap.delete(i);
       }
 
       System.out.println("Afer Sorting:");
       maxHeap.printHeap();
   }
}