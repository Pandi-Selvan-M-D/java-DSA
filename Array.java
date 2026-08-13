public class Array{
    int capacity;
    int size;
    int arr[];

    
    // Array creation ADT
    Array(int capacity){
        this.arr=new int[capacity];                                                                                    
        this.capacity=capacity;
        this.size=0;
    }


    // Insert in array ADT
    boolean insert(int index,int element){
        if(index<0 || index>size){
            System.out.println("Can't insert : Invalid Index");
            return false;
        }
        else if(size>=capacity){
            resize();
        }
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1]; 
        }
        arr[index]=element;
        size++;
        return true;
    }


    //Display the array ADT
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    // Get method ADT
    void get(int index){
    if(index >= 0 && index < size){
        System.out.println(arr[index]);
    }
    else{
        System.out.println("Invalid index");
    }
}


    // Set method ADT
    void set(int index, int element){
        if(index >= 0 && index < size){
            arr[index] = element;
        }
        else{
            System.out.println("Invalid index");
        }
    }



    // Search element ADT
    int search(int target){
        for(int i=0;i<size;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }



    // Delete an element ADT
    boolean delete(int index){
        if(index<0 || index>=size){
            System.out.println("Can't delete : Invalid index");
            return false;
        }
        for(int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        return false;
    }



    // Resize array ADT
    void resize(){
        capacity = capacity*2;
        int[] newArray = new int[capacity];
        for(int i=0; i<size; i++){
            newArray[i]=arr[i];
        }
        arr= newArray;
    }

    // Main method ADT
    public static void main(String[] args) {
        Array arr1=new Array(5);  
        arr1.insert(0,15);
        arr1.insert(1,14);
        arr1.insert(2,13);
        arr1.insert(3,12);
        arr1.insert(4,11);
        arr1.display();
        arr1.delete(2);
        arr1.display();
    }
}
