import java.util.LinkedList;
import java.util.Queue;




    class Stack{
        Queue<Integer> q1,q2;
        int size;
        Stack(){
           q1 = new LinkedList<>();
           q2 = new LinkedList<>();
           size= 0;
        }

        public void push(int  ele){
            q1.add(ele);
            size++;
            while(!q2.isEmpty())
                q1.offer(q2.poll());

            Queue<Integer> t =q1;
            q1 = q2;
            q2 = t;

        }

        public int pop(){size--;return q2.poll(); }

        public int peek(){return  q2.peek();}



    }
public class stackWithQ {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(5);
        st.push(53);
        st.push(35);
        st.push(65);
        st.push(75);
        st.push(35);
        st.push(567);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size);



    }
}
