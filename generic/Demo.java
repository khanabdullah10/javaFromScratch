package generic;


import java.util.ArrayList;

class GenDemo<T>{
    T obj;

    GenDemo(T obj){
        this.obj = obj;
    }

    public void show(){
        System.out.println("Type is "+obj.getClass().getName());
    }

    public T getObj(){
        return obj;
    }


        }



public class Demo {

    public static void main(String[] args) {
        GenDemo<Integer> g1 = new GenDemo<>(10);
        g1.show();
    }
}
