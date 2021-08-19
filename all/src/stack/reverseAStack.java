import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class reverseAStack {
    public static void revStackFirst(Stack<Integer> st){
        //this is to pop all the elements and saving them in the system stack
        if(!st.isEmpty()){
            int lower = st.peek();
            st.pop();
            revStackFirst(st);

            revStackSecond(st,lower);
        }
    }
    public static void revStackSecond(Stack<Integer> st, Integer lower){
        if(st.isEmpty()){
            System.out.println("last");
            st.push(lower);
            return;
        }
        int t = st.pop();
        // we're saving the top element in t and again popping everyone else till the new element is at the bottom
        revStackSecond(st,lower);
        st.push(t);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(32);
        st.add(42);
        st.add(52);
        st.add(62);

        System.out.println(st);
        revStackFirst(st);
        System.out.println("after reversing \n"+ st );
        /*
        thing is since you want the last element on top
        you will have to pop all the elements and put the former top as last element in the new stack


        * */
    }
}
