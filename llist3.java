/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist3;

/**
 *
 * @author islam.hany
 */
public class llist3 {
    llist3 newList;
    Node head;
    public void append(int data){
        if(head==null)
        {
            head=new Node(data);
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=new Node(data);
    }
    public void deleteWithValue(int data)
    {
    }
    public llist3 MergeTwoLists(llist3 list1,llist3 list2)
    {
        Node currentList1=list1.head;
        Node currentList2=list2.head;
        newList=new llist3();
        while(currentList1!=null)
        {
            
            while(currentList2!=null)
            {
                if(currentList1==null && currentList2!=null)
                {
                    newList.append(currentList2.data);
                    currentList2=currentList2.next;
                }
                else  if(currentList1.data==currentList2.data)
                {
                    newList.append(currentList2.data);
                    newList.append(currentList1.data);
                    currentList1=currentList1.next;
                    currentList2=currentList2.next;
                }
                else if(currentList1.data<currentList2.data)
                {
                    newList.append(currentList1.data);
                    currentList1=currentList1.next;
                }
                else if(currentList1.data>currentList2.data)
                {
                    newList.append(currentList2.data);
                    currentList2=currentList2.next;
                }
                //  currentList2=currentList2.next;
            }
            if(currentList2==null && currentList1!=null)
            {
                newList.append(currentList1.data);
                currentList1=currentList1.next;
            }
            
        }
        while(currentList1==null && currentList2!=null)
        {
         newList.append(currentList2.data);
                currentList2=currentList2.next;
        }
        return newList;
    }
    public void printls()
    {    
        Node current=head;
       // System.out.println(current.data);
       
      /* System.out.println(current.next.data);
       System.out.println(current.next.next.data);
       System.out.println(current.next.next.next.data);*/
     // current=current.next;
     //  current=current.next;
       while(current!=null)
       { 
          
           System.out.println(current.data);
          current=current.next;
            
       }
  //      while(current.next!=null)
 //       {
      
     //  System.out.println(current.next.data);
//            current=current.next;
//         System.out.println("data: "+current.data);         
//        }
    }
}
