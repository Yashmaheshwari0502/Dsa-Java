package learn_the_basics.Learn_STL.Java_Collections_or_similar_thing_in_your_language;

import java.util.HashMap;
import java.util.Map;


public class java_02_java_collections {

    public static void main(String[] args) {
        // List<Integer> student=new ArrayList<>();
        // student.add(10);
        // student.add(20);
        // student.add(30);
        // System.out.println( student);
        // student.add(40);
        // System.out.println(student);
        // student.add(0,50);
        // System.out.println(student);

        // List<Integer> stu=new ArrayList<>();
        // stu.add(100);
        // stu.add(300);

        // student.addAll(stu);
        // System.out.println(student);
        // student.remove(5);
        // System.out.println(student);
        // student.remove(Integer.valueOf(300));
        // System.out.println(student);
        // student.set(0, 0);
        // System.out.println(student);

        // System.out.println(student.contains(30));

        // for(int i=0;i<student.size();i++){
        //     System.out.println(student.get(i));
        // }

        // for(Integer i:student){
        //     System.out.println(i);
        // }

        // Iterator<Integer> it=student.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        // Stack<String> value=new Stack<>();
        // value.push("hello");
        // value.push("welcome");
        // System.out.println(value.peek());
        // value.pop();
        // System.out.println(value.peek());


        // Queue<Integer> qt=new LinkedList<>();

        // qt.offer(10);
        // qt.offer(20);
        // qt.offer(30);
        // System.out.println(qt);
        // System.out.println(qt.poll());
        // System.out.println(qt.peek());


        // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        // pq.offer(300);
        // pq.offer(10);
        // pq.offer(24);
        // pq.offer(20);
       
        // pq.offer(1);
        // System.out.println(pq);



        // ArrayDeque<Integer> ada=new ArrayDeque<>();
        // ada.offer(10);
        // ada.offerFirst(20);
        // ada.offerLast(45);
        // System.out.println(ada);

        // Set<Integer> se=new HashSet<>();
        // se.add(10);
        // se.add(1000);
        // se.add(240);
        // se.add(30);
        // se.add(50);

        // System.out.println(se);

        Map<Integer,String>mt=new HashMap<>();
        mt.put(10, "yash");
        mt.put(20, "ravi");
        mt.put(30,"subhash");
        System.out.println(mt);
    }

}