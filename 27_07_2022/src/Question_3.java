import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_3 {

public static void main(String[] args) {

 List<Electronic> ec=new ArrayList<Electronic>();

 ec.add(new Electronic(1,"Iphone",65000f));

 ec.add(new Electronic(2,"Samsung",21000f));

 ec.add(new Electronic(3,"Sony Xperia",25000f));

 ec.add(new Electronic(4,"Vivo",18000f));

 ec.add(new Electronic(5,"Redmi",12000f));

 ec.add(new Electronic(6,"Oppo",31000f));

 Map<Object, Object> map= ec.stream()

  .filter(p-> p.price > 20000)

  .collect(Collectors.toMap(p->p.name, p->p.price));

 map.forEach((k,v)->{

 System.out.println(k+" : "+v);

 });

}

}







