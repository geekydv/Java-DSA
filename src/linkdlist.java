public class linkdlist {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    class Main{
        public static void main(String[] args) {
            Node first = new Node(1);
            System.out.println(first.data);
        }
    }


}
