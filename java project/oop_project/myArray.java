package oop_project;

public class myArray {
    private object[] arr;
    private int itemCount;

    public myArray(int size){
        arr= new object[size];
        itemCount = 0;
    }
    public int getItemCount(){
        return itemCount;
    }
    public void add(businessContact c){
        if(itemCount < arr.length){
            arr[itemCount] =c;
            itemCount++;
        }else{
            System.out.println("Error : Array index out of found");
        }
    }
    public object get(int index){
        if(index >= 0 && index < itemCount){
            return arr[index];
        }
        return null;
    }
    public boolean isEmpty(){
            return itemCount == 0;
        
    }
    public void update(int index , object newData){
        if(index >= 0 && index < itemCount){
            arr[index]=newData;
        }else{
            System.out.println("Error : Array index not found");
        }
    }
    public void remove(int index){
        if(index >= 0 && index < itemCount){
            for(int i = index ; i<itemCount;i++){
                arr[i]=arr[i+1];
            }
            itemCount--;
        }else{
            System.out.println("Error : Array index not found");
        }
    }
    
}
