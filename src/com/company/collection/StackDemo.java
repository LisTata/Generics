package com.company.collection;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
class Stack<E>{
    private List<E>  element=new LinkedList<>();


    public List<E> getElement() {
        return element;
    }

    public void setElement(List<E> element) {
        this.element = element;
    }
    public boolean isEmpty(List<E> element){

        return element.size()==0;
    }
    public void push(E obj){
        element.add(obj);
    }


    public E pop(){
        if (element.size()==0)
            throw new EmptyStackException();
        E obj = element.get(element.size()-1);
        element.remove(element.size()-1);
        return obj;
    }
}