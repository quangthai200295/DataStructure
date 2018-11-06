/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import object.Student;

/**
 *
 * @author mongnt
 */
public class SimpleLinkedList {

    private class SimpleNode {

        Student data;
        SimpleNode pNext;

        public SimpleNode(Student data) {
            this.data = data;
            this.pNext = null;
        }

    }

    // pHead
    private SimpleNode pHead;

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
        if(containsId(student.getId())){
            // id of student is unique, if contains ID of student in linked list, do nothing
            return;
        }
        SimpleNode element = new SimpleNode(student);
        if (isNull()) {
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
    public void removeSimpleNode(int idStudent){
        if(!containsId(idStudent)){
            return;
        }
        // if idStudent == pHead
        if (this.pHead.data.getId() == idStudent){
            this.pHead = this.pHead.pNext;
            return;
        }
        SimpleNode cursor = this.pHead;
        while (cursor.pNext != null){
            if(cursor.pNext.data.getId() == idStudent){
                cursor.pNext = cursor.pNext.pNext;
                return;
            }
            cursor = cursor.pNext;
        }
    }
    
    public boolean containsId(int idStudent){
        if(isNull()){
            return false;
        }
        SimpleNode cursor = this.pHead;
        while(cursor != null){
            if(cursor.data.getId() == idStudent){
                return true;
            }
            cursor = cursor.pNext;
        }
        return false;
    }
    
    private boolean isNull(){
        return this.pHead == null;
    }

    @Override
    public String toString() {
        String result ="";
        if(this.pHead == null){
            return "List is empty !!!!!!";
        }
        SimpleNode cursor = pHead;
        while(cursor != null){
            result += cursor.data.toString() + " \n";
            cursor = cursor.pNext;
        }
        return result;
    }
}
