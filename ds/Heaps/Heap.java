class Heap {
    public static int heapSize = 10;

    public static int getRightChild(int A[], int index){
        if(((2*index)+1) < A.length && (index >=1)){
            return (2*index)+1;
            
        }
        return -1;
    }

    public static int getLeftChild(int A[], int index){
        if((2*index) < A.length && (index >=1)){
            return (2*index);
            
        }
        return -1;
    }

    public static int getParent(int A[], int index){
        if(index < A.length && index >1){
            return index/2;
            
        }
        return -1;
    }


    public static void maxHeapify(int A[],int index){
        int leftChildIndex = getLeftChild(A, index);
        int rightChildIndex = getRightChild(A, index);

        int largest = index;

        if((leftChildIndex <=heapSize) && (leftChildIndex>0)){
            if(A[leftChildIndex] > A[largest]){
                largest = leftChildIndex;
            }
        }

        if((rightChildIndex <=heapSize) && (rightChildIndex>0)){
            if(A[rightChildIndex] > A[largest]){
                largest = rightChildIndex;
            }
        }

        if (largest != index){
            int temp;
            temp = A[largest];
            A[largest] = A[index];
            A[index] = temp;
            maxHeapify(A, largest);
        }

        
        
    }

    public static void buildMaxHeap(int A[]) {
        int i;
        for(i = heapSize/2; i>=1; i--){
            maxHeapify(A, i);
        }


        
    }

    public static void main(String[] args) {
        int A[] = {0, 15, 20, 7, 9, 5, 8, 6, 10, 2, 1};
        buildMaxHeap(A);
        for(int i=1; i<=heapSize; i++) {
          System.out.println(A[i]);
        }     
    }





}
