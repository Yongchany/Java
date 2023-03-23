import java.util.*;

class GStack<T>{
    int tos;
    int len;
    Object [] stck;

    public int size(){
        return len;
    }

    public GStack(){
        tos = 0;
        len = 1;
        stck = new Object[len];
    }

    public boolean add(T value){
        try{
            if(tos == len){
                Object[] d = stck;
                len++;
                stck = new Object[len];
                for(int i = 0; i < d.length; i++){
                    stck[i] = d[i];
                }
            }
            stck[tos] = value;
            tos++;
            return true;
        }
        catch(OutOfMemoryError e){
            return false;
        }
    }

    public T remove(int index){
        Object ret = stck[index];
        stck[index] = null;
        len--;
        Object[] d = new Object[len];
        int dLen = 0;
        for(int i = 0; i < stck.length; i++){
            if(stck[i] == null)
                i++;
            d[dLen] = stck[i];
            dLen++;
        }
        stck = d;
        return (T) ret;
    }

    public T get(int index){
        return (T) stck[index];
    }

    public void clear(){
        tos = 0;
        len = 1;
        stck = new Object[len];
    }
}

public class MyArrayList {
    public static void main(String[] args) throws Exception {
        GStack<Integer> gs = new GStack<Integer>();

        gs.add(1);
        gs.add(5);
        gs.add(3);
        for(int i = 0; i < gs.size(); i++){
            System.out.println(gs.get(i));
        }
        System.out.println("gs의 사이즈 : " + gs.size());

        System.out.println(gs.remove(1));
        for(int i = 0; i < gs.size(); i++){
            System.out.println(gs.get(i));
        }
        System.out.println("gs의 사이즈 : " + gs.size());

        gs.clear();
        for(int i = 0; i < gs.size(); i++){
            System.out.println(gs.get(i));
        }
        System.out.println("gs의 사이즈 : " + gs.size());
    }
}
