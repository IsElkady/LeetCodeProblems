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
        
        llist3 mylist1=new llist3();
        llist3 mylist2=new llist3();
        
        //list1 nodes
        mylist1.append(0);      
        mylist1.append(0);
        mylist1.append(3);
        
        //list2 nodes
        mylist2.append(1);
        mylist2.append(3);
        mylist2.append(5);
        
        //newlist used to merge the two lists
        llist3 newlist=new llist3();

        //call MergeTwoLists and pass mylist1 and mylist2 to be merged.
        llist3 myList=newlist.MergeTwoLists(mylist1, mylist2);
        
        //printout myList(Merged List)
        myList.printls();

    }
}
