package com.bridgelabz;

public class SinglyLinkedList {

        private MyNode head;
        private MyNode tail;
        private int size;
        public SinglyLinkedList(){
            this.size=0;
        }

        public void insertAtFirst(int value){      //Method to add elements to the list
            MyNode n= new MyNode(value);
            n.next=head;
            head=n;
            if(tail==null){
                tail=head;
            }
            size=size+1;
        }

        public void insertAtLast(int value){  //To insert elements to the right (Last)
            MyNode n= new MyNode(value);
            if(tail==null){
                tail=n;
                head=n;
            }
            else {
                tail.next = n;
                tail = n;
            }
        }

        public void insertBetween(int value){   //Inserts elements between two nodes 
            MyNode n= new MyNode(value);
            head.next=n;
            n.next=tail;
        }
        public void deleteFirst(){   // function to delete element at first position
            int value=head.value;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
        }

        public void display(){      //To display the elements inserted in the list
            MyNode temp=head;
            while(temp!=null){
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.print("End");
        }
        private class MyNode{    // A private class for creating a node
            private int value;
            private MyNode next;


            public MyNode(int value){
                this.value=value;
            }
            public MyNode(int value , MyNode next){
                this.value=value;
                this.next=next;
            }



        }
    }


