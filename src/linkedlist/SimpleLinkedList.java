/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.HashMap;
import java.util.Map;
import object.Student;

/**
 *
 * @author mongnt
 */
public class SimpleLinkedList {

    private class Node {

        Student data;
        Node pNext;

        public Node(Student data) {
            this.data = data;
            this.pNext = null;
        }

    }

    // pHead
    private Node pHead;

    public SimpleLinkedList() {
        this.pHead = null;
    }

    /**
     *
     * insert data into head simple linked list
     *
     * @param student
     */
    public void insertHeadList(Student student) {
        Node element = new Node(student);
        if (this.pHead == null) {
            pHead = element;
            return;
        }
        element.pNext = this.pHead;
        this.pHead = element;
    }
    
    /**
     * remove all node if id = idStudent
     * @param idStudent
     */
    public void removeNode(int idStudent){
        if(!containsId(idStudent)){
            return;
        }
        // if idStudent == pHead
        while (this.pHead != null && this.pHead.data.getId() == idStudent){
            this.pHead = this.pHead.pNext;
        }
        if (this.pHead == null){
            return;
        }
        Node cursor = this.pHead;
        while (cursor.pNext != null){
            if(cursor.pNext.data.getId() == idStudent){
                cursor.pNext = cursor.pNext.pNext;
            }
            cursor = cursor.pNext;
        }
    }
    
    public boolean containsId(int idStudent){
        if(this.pHead == null){
            return false;
        }
        Node cursor = this.pHead;
        while(cursor != null){
            if(cursor.data.getId() == idStudent){
                return true;
            }
            cursor = cursor.pNext;
        }
        return false;
    }

    @Override
    public String toString() {
        String result ="";
        if(this.pHead == null){
            return "List is empty !!!!!!";
        }
        Node cursor = pHead;
        while(cursor != null){
            result += cursor.data.toString() + " \n";
            cursor = cursor.pNext;
        }
        return result;
    }
}
