import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MakeSet {
    private static final Object NF = new Object();
    private HashMap<Integer, Object> map;
    public boolean add(Integer value){
        if (map.containsKey(value)){
            return false;}
        else {map.put(value, NF);
            return true;
        }
    }
    public MakeSet(){
        map = new HashMap<>();
    }

    @Override
    public String toString() {
        Set<Integer> keys = map.keySet();
        String tmp = "";
        for (int i = 0; i < keys.size(); i++) {
            tmp += keys.toArray()[i] + ", " ;
        }
        tmp ="["+ tmp.substring(0, tmp.length()-2)+ "]";
        return tmp;
    }
    public void remove(Integer key){
        map.remove(key);
    }
    public int size(){
        return map.size();
    }
    public boolean isEmpty(){
        if(map.size()>0){return false;}
        return true;
    }
    //public String[] get(){
    //    return (String[]) map.keySet().toArray();
    //}
    public Iterator iter(){

        return map.keySet().iterator();
    }
}
