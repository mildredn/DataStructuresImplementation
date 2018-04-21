package com.mildrednoronha;


class Node{

    //Check access specifiers for these variables
    int value;
    Node link;

    //Constructor
    public Node(){
        value = 0;
        link = null;
    }

    //Constructor
    public Node(int value){
        this.value = value;
        this.link = null;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setNextLink(Node nextLinkValue){
        link = nextLinkValue;
    }

    public Node getNextLink(){
        return link;
    }
}


class linkedList{
    Node start;
    Node end;
    int size;

    public linkedList(){
        start = null;
        end = null;
        size = 0;
    }

    public void insertNodeAtStart(int value){
        Node newNode = new Node(value);

        if(start == null){
            start = newNode;
            end = start;
        }
        else{
            newNode.setNextLink(start);
            start = newNode;
        }

        size++;
    }

    public void insertNodeAtEnd(int value){
        Node newNode = new Node(value);

        if(start == null){
            start = newNode;
            end = start;
        }
        else{
            end.setNextLink(newNode);
            end = newNode;
        }
        size++;
    }

    public void insertAtPosition(int value, int position){
        Node newNode =new Node(value);
        Node head = start;

        for(int i = 1; i < size; i++){
            if(i == position - 1){
                newNode.setNextLink(head.getNextLink());
                head.setNextLink(newNode);
                break;
            }
            head = head.getNextLink();
        }
        size++;
    }

    public void deleteFromPosition(int position){
        if(position == 1){
            start.setNextLink(start.getNextLink());
            size--;
            return;
        }

        if(position == size){
            Node temp = start;
            for(int i = 1; i <= position - 1; i++){
                temp = temp.getNextLink();

            }
            temp.setNextLink(null);
            end = temp;
            size--;
            return;
        }

        Node head = start;
        for(int i = 1; i < size; i++){
            if(i == position - 1){
                head.setNextLink(head.getNextLink().getNextLink());
                break;
            }
            head = head.getNextLink();
        }
        size--;

    }

    public void printList(){
        Node temp = start;

        if(size == 0){
            System.out.println("List is empty.");
            return;
        }

        if(start.getNextLink() == null){
            System.out.println(Integer.toString(start.getValue()));
            return;
        }

        while(temp.getNextLink() != null){
            System.out.print(Integer.toString(temp.getValue())+ " ");
            temp = temp.getNextLink();
        }
    }

}

//Stack using array
class Stack{

    static final int MAX_SIZE = 1000;
    int stackContent[] = new int[MAX_SIZE];
    int top;

    Stack(){
        top = -1;
    }

    public boolean isEmpty(){

        return (top == -1);

    }

    public boolean isFull(){

        return (top == MAX_SIZE - 1);
    }

    public boolean push(int value){

        if(top >= MAX_SIZE){
            System.out.println("Stack overflow.");
            return false;
        }
        stackContent[++top] = value;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow.");
            return -1;
        }
        return stackContent[--top];
    }

    public int peek(){
        if(isEmpty()){
            //Change to accept exception
            System.out.println("Stack underflow.");
            return -1;
        }
        return stackContent[top];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack empty.");
            return;
        }
        int temp = top;
        while(temp >= 0){
            System.out.print(stackContent[temp--]+" ");
        }
        System.out.println();
    }

}

//Queue using array
class Queue{

    static final int MAX_SIZE = 1000;
    int queueContents[];
    int front, rear, length;


    public boolean isEmpty(){

        return (front == -1);

    }

    public boolean isFull(){

        return ((front == 0) && (rear == length - 1));

    }

    public int getSize(){

        return length;

    }

    public int peek(){

        if(isEmpty()){
            return -1;
        }
        
    }

}

public class Main {

    public static void main(String[] args) {
        linkedList testLinkedList = new linkedList();

    }

}
