/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;

import linkedlist.SimpleLinkedList;
import linkedlist.DoubleLinkedList;
import object.Student;

/**
 *
 * @author mongnt
 */
public class MainApp {

    public static void main(String[] args) {
//        demoSimpleLinkedList();
        demoDoubleLinkedList();
    }

    public static void demoSimpleLinkedList() {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        simpleLinkedList.insertHeadList(new Student(1, "Thi Hien", "Khu B"));
        simpleLinkedList.insertHeadList(new Student(2, "Kim Hoa", "ok"));
        simpleLinkedList.insertHeadList(new Student(3, "Thach Mong", "...."));
        simpleLinkedList.insertHeadList(new Student(4, "Demo", "Ahihi"));
        simpleLinkedList.insertHeadList(new Student(2, "Check", "Di An"));
        System.out.println(simpleLinkedList.toString());
        System.out.println("---------------- DELETE ID = 2");
        simpleLinkedList.removeSimpleNode(2);
        System.out.println(simpleLinkedList.toString());
    }

    public static void demoDoubleLinkedList() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertHeadList(new Student(1, "Thi Hien", "Khu B"));
        doubleLinkedList.insertTailList(new Student(2, "Kim Hoa", "ok"));
        doubleLinkedList.insertHeadList(new Student(3, "Thach Mong", "...."));
        doubleLinkedList.insertHeadList(new Student(4, "Demo", "Ahihi"));
        doubleLinkedList.insertHeadList(new Student(2, "Check", "Di An"));
        System.out.println(doubleLinkedList.toString());
        System.out.println("---------------- DELETE ID = 2");
        doubleLinkedList.removeDoubleNode(2);
        System.out.println(doubleLinkedList.toString());
    }
}