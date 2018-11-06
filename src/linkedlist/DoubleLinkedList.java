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
public class DoubleLinkedList {

    private class DoubleNode {

        Student data;
        DoubleNode pNext;
        DoubleNode pPrevious;

        public DoubleNode(Student data) {
            this.data = data;
            this.pNext = null;
            this.pPrevious = null;
        }
    }

    private DoubleNode pHead;
    private DoubleNode pTail;

    public DoubleLinkedList() {
        pHead = null;
        pTail = null;
    }

    public void insertHeadList(Student student) {
        if (containsId(student.getId())) {
            return;
        }
        DoubleNode element = new DoubleNode(student);
        if (isNull()) {
            pHead = element;
            pTail = element;
            return;
        }
        element.pNext = pHead;
        pHead.pPrevious = element;
        pHead = element;
    }

    public void insertTailList(Student student) {
        if (containsId(student.getId())) {
            return;
        }
        DoubleNode element = new DoubleNode(student);
        if (isNull()) {
            pHead = element;
            pTail = element;
            return;
        }
        element.pPrevious = pTail;
        pTail.pNext = element;
        pTail = element;
    }

    public void removeDoubleNode(int idStudent) {
        if (!containsId(idStudent)) {
            return;
        }
        if (pHead.data.getId() == idStudent) {
            pHead = pHead.pNext;
            pHead.pPrevious = null;
        }
        if (pTail.data.getId() == idStudent) {
            pTail = pTail.pPrevious;
            pTail.pNext = null;
        }

        DoubleNode cursor = pHead;
        while (cursor != null) {
            if (cursor.data.getId() == idStudent) {
                cursor.pPrevious.pNext = cursor.pNext;
                cursor.pNext.pPrevious = cursor.pPrevious;
                cursor = null;
                return;
            }
            cursor = cursor.pNext;
        }
    }

    public boolean containsId(int idStudent) {
        if (isNull()) {
            return false;
        }
        DoubleNode cursor = pHead;
        while (cursor != null) {
            if (cursor.data.getId() == idStudent) {
                return true;
            }
            cursor = cursor.pNext;
        }
        return false;
    }

    private boolean isNull() {
        return pHead == null;
    }

    @Override
    public String toString() {
        String result = "";
        if (this.pHead == null) {
            return "List is empty !!!!!!";
        }
        DoubleNode cursor = pHead;
        while (cursor != null) {
            result += cursor.data.toString() + " \n";
            cursor = cursor.pNext;
        }
        return result;
    }
}
