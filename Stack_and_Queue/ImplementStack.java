package DSA_450.Stack_and_Queue;

public class ImplementStack {
    public static class Stack{
        int[]arr = new int[5];
        int index = 0;
        public void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[index] = x;
            index++;
        }
        public int peek(){
            if(index==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[index-1];
        }
        public int pop(){
            if(index==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[index-1];
            arr[index-1] = 0;
            index--;
            return top;
        }
        public boolean isEmpty(){
            if(index==0) return true;
            else return false;
        }
        public boolean isFull(){
            if(index== arr.length) return true;
            else return false;
        }
        public int size(){
            return index;
        }
        void display(){
            for(int i=0;i<=index-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.push(3);
        st.push(6);
        st.push(7);
        System.out.println(st.isFull());
        st.pop();
        st.display();
    }
}
