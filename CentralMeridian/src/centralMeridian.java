import java.util.*;
import java.util.stream.Collectors;

public class centralMeridian {
    public static void main(String[] args) {
        List<Integer> q=new ArrayList<>();
        q.add(2);
        q.add(8);
        q.add(4);
        q.add(8);
        q.add(6);
        q.add(8);
        q.add(8);

        List<Integer> solution=new LinkedList<>();

        TreeMap<Integer,Integer> ss=new TreeMap<Integer,Integer>();
String a="";
Float ax=new Float("3.0");

        int z=0;
        for(int i=0;i<q.size();i++)
        {
        System.out.println("-------------------------------------------------------------");
        if(ss.containsKey(q.get(i)))
            ss.replace(q.get(i),ss.get(q.get(i)),(ss.get(q.get(i)))+1);
        else
            ss.put(q.get(i),1);

int sum=0;
int part_sol=0;
System.out.println("<><><><><><><>");
ss.entrySet().forEach(System.out::println);
System.out.println("<><><><><><><>");

for(Map.Entry<Integer,Integer> keyValuePair : ss.entrySet() )
    if(sum<=i/2) {
        System.out.println("--------"+keyValuePair.getKey());
        part_sol=keyValuePair.getKey();
        sum=sum+keyValuePair.getValue();
    }

solution.add(part_sol);


        }
        System.out.println(solution);
    }
}
