import java.util.*;
class try1{
    public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int n1= n.nextInt();
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<n1;i++){
        a.add(n.nextInt());
    }
    System.out.println(a);
    ArrayList<Integer> b=new ArrayList<>();
    int max=a.get(a.size()-1);
    b.add(max);
    for(int i=a.size()-2;i>=0;i--){
        if(a.get(i)>max){
            b.add(a.get(i));
            max=a.get(i);
        }
    } 
    System.out.println(b);
    }

}