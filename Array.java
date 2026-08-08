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
        if(index >= 0 && index <= size && size < capacity){
            for(int i=size;i>index;i--){
                arr[i]=arr[i-1]; 
            }
            arr[index]=element;
            size++;
            return true;
        }
        else System.out.println("Invalid index"); return false;
    }


    //Display the array ADT
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
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

    // Main method ADT
    public static void main(String[] args) {
        Array arr1=new Array(5);  
        arr1.insert(0,5);
        arr1.insert(1,4);
        arr1.get(0);
        arr1.set(2,7);
        arr1.display();
    }
}
