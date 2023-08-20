/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leetcodeproblems;

/**
 *
 * @author islam.hany
 */
public class LinkedList3 {

    public static void main(String[] args) {
        System.out.println("Hello World44!");
        
        llist3 mylist1=new llist3();
        llist3 mylist2=new llist3();
        
//        mylist1.append(2);
//        mylist1.append(2);
//        mylist1.append(2);
//        mylist1.append(5);
//        mylist1.append(7);
//        
//        mylist2.append(1);
//        mylist2.append(2);
//        mylist2.append(3);
//       
        mylist1.append(0);
      //  mylist2.append(0);
      
     //    mylist2.append(3);
        llist3 newlist=new llist3();
       // mylist2.printls();
        
        llist3 myList=newlist.MergeTwoLists(mylist1, mylist2);
        myList.printls();
//        mylist1.append(1);
//        mylist1.append(2);
//        mylist1.append(4);
//        mylist2.append(1);
//        mylist2.append(3);
//        mylist2.append(4);
        
        //llist3 newList=new llist3();
        //newList.MergeTwoLists(mylist1, mylist2);
      //  newList.printls();
      // mylist1.printls();
       //mylist2.printls();
    }
}
