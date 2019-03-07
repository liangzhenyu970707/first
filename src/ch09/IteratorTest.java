package ch09;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        Iterator<String> it  = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        Set<Integer> set = new TreeSet<>();
        // HashSet   LinkedHashSet
        set.add(1);
        set.add(6);
        set.add(8);
        set.add(5);
        set.add(1);
       /* set.forEach(System.out::println);*/

        Queue<Integer> queue = new PriorityQueue<>();//优先级队列（先排序）
        //ArrayDeque();//双端队列
        queue.offer(55);
        queue.offer(44);
        queue.offer(66);
        queue.offer(22);
        System.out.println(queue.peek());
        //查看队列的第一个元素（不取出）
        System.out.println(queue.poll());
        //取出队列的第一个元素（出队列）
        //queue.forEach(System.out::println);
        Stack<Integer> stack = new Stack<>();
        stack.push(3);//将元素压入堆栈（入栈）
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());//将栈顶元素弹出栈（弹栈，出栈）


        }
    }

