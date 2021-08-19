
public class stackDemo {
    /*
    basic stack implementation
    */
    public static class stack<T> {
        public T[] stackArray;
        int top = -1;
        int size;
        stack( int size){
            this.size = size;
            this.stackArray = (T[]) new Object[size];
        }
        public void push (T element ){

            if (size > top + 1)
                this.stackArray[++top] = element;
            else
                System.out.println("cant push , stack overflow");
        }
        public T pop () {
            if (top > -1) {
                return this.stackArray[top--];
            } else
                System.out.println("stack underflow");
            return null;
        }

        public void peek () {
            System.out.println("this top of stack is " + this.stackArray[top]);
        }
        public boolean isEmpty () {
            return top == -1;
        }
        public boolean isFull () {
            return top == size - 1;
        }
        public void printStack () {
            for (int i = this.size - 1; i >= 0; i--) System.out.println(stackArray[i] + "\n");
        }
        public boolean palindrome ( String inp){
            /*
                here i push the string onto stack , pop em out , append them into another string.
             */

            int sizeOfInput = inp.length();
            String comp="";
            stack<Character> st = new stack<>(sizeOfInput);
            int i = 0;
            System.out.println("inside palindrome");
            while (i < sizeOfInput) {
                st.push(inp.charAt(i));
                i++;
            }
            while (!st.isEmpty()){comp+=st.pop();}
            return comp.equals(inp);
        }
    }
    public static void main(String[] args) {

        int size = 1;
        stack<Character> st = new stack<>(size);
        stack<Integer> st2 = new stack<>(5);
        /*palindrome*/
        Stack x = new Stack();
//        boolean x= st.palindrome("oio");
//        System.out.println(x);

        
    }
}

