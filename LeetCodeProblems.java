/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leetcodeproblems;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author islam.hany
 */

public class LeetCodeProblems {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        String str[]={"fe","flowea","flouu","flour"};
//String str[]={"flower","flower","flower","flower","flower"};
//String str[]={"a","c","b","aba"};
//System.out.println(validParanthes_stack("{}()[]"));
    //    System.out.println( LongestCommonPrefix1(str));
    ListNode list1=new ListNode();
    ListNode list2=new ListNode();
    
    list1.val=1;
    list1.next=new ListNode(3);
    list1.next.next=new ListNode(4);
    list2.val=1;
    list2.next=new ListNode(3);
    list2.next.next=new ListNode(4);
    ListNode list3=mergeTwoLists(list1,list2);
    }
    public static void printList(ListNode myList)
    {
        while(myList.next!=null)
        {
            
            System.out.println(myList.val);
            myList.next=myList.next.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listAll=new ListNode(list1);
        ListNode headList2=new ListNode(list2);
      //  ListNode headList1=new ListNode(list1);
        while(list1.next!=null)
        {
            while(list2.next!=null)
            {
                if(list2.val==list1.val)
               insertNode(listAll,list1.val);
                list2.next=list2.next.next;
            }
            list2.next=headList2;
            list1.next=list1.next.next;
        }
        printList(listAll);
        return listAll;
    }
    public static void insertNode(ListNode listAll,int val)
    {
        
        listAll.next=new ListNode(val);
        //listAll.next.val=val;
    }
    public static boolean validParanthes_stack(String s)
    {
        Stack<String> open_brakets=new Stack<String>(); //stack for opened brakets
        Stack<String> close_brakets=new Stack<String>();//stack for closed brakets
        boolean validate=false;                         //flag to validate brakets
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')        //detect open brakets
            {
                open_brakets.push(s.charAt(i)+"");                                        //push opened brakets in open_brakets object
            }
            if(s.charAt(s.length()-i-1)=='}'||s.charAt(s.length()-i-1)==']'||s.charAt(s.length()-i-1)==')')   //detect closed brakets
            {
                close_brakets.push(s.charAt(s.length()-i-1)+"");                                //push closed brakets in close_brakets object
            }
        }
        String strOpenBraket;
        String strCloseBraket;
        
        for(int i=0;i<s.length()/2;i++)
        {
           strOpenBraket= open_brakets.pop();
           strCloseBraket=close_brakets.pop();
           System.out.println(strOpenBraket+"<<<");
           System.out.println(strCloseBraket+">>>>");
            if(strOpenBraket.charAt(0)=='{'&&strCloseBraket.charAt(0)=='}')
                validate=true;
            else if(strOpenBraket.charAt(0)=='('&&strCloseBraket.charAt(0)==')')
                validate=true;
            else if(strOpenBraket.charAt(0)=='['&&strCloseBraket.charAt(0)==']')
                validate=true;
            else if(strOpenBraket.length()==0)
                break;
            else 
            {
                validate=false;
                break;
            }
                
        }
       return validate;
    }
    public static boolean validParanthes(String s)
    {
//    
//        Stack<String> brakets=new Stack<String>();
//        Stack<String> braces=new Stack<String>();
//        Stack<String> paranthes=new Stack<String>();
       
        int brakets=0;
        
        int braces=0;
       
        int paranthes=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
            {
                brakets++;
                //brakets.push(s.charAt(i)+"");
            }
            else if(s.charAt(i)==']')
            {
                brakets--;
            }
            else if(s.charAt(i)=='{')
            {
                braces++;
            }
            else if(s.charAt(i)=='}')
            {
                braces--;
            }
            else if(s.charAt(i)=='(')
            {
            paranthes++;
            }
            else if(s.charAt(i)==')')
            {
            paranthes--;
            }
        }
        if(brakets==0&&braces==0&&paranthes==0)
        return true;
        else 
            return false;
    }
    public static String LongestCommonPrefix1(String[] str)
    {
        StringBuilder result=new StringBuilder();
        Arrays.sort(str);
        for(int i=0;i<str[0].length();++i)
        {
            if(str[0].charAt(i)!=str[str.length-1].charAt(i))
            {
               break;
            }
            result.append(str[0].charAt(i));
        }
        return result.toString();
//                
//                for(int i=0;i<str.length-1;++i)
//        {
//            for(int j=1;j<str.length;++j)
//            {
//                if(str[i].compareTo(str[j])>0)
//                {
//                    String temp=str[i];
//                    str[i]=str[j];
//                    str[j]=temp;
//                }
//            }
//           
//        }
 //       int length=str.length-1;
//        for(int i=0;i<str[length].length();++i)
//        {
//          //  for(int j=0;j<str[2].length();++j)
//            if(str[0].charAt(0)!=str[length].charAt(0))
//                return "";
//            if(str.length==1)
//                 return str[0];
//            if(i==str[0].length())
//                  return str[length].substring(0,i);
//            if(str[0].charAt(i)!=str[length].charAt(i))
//                  return str[length].substring(0,i);
//        }
   //     return str[0];
    }
    
    
    
    
    public static String LongestCommonPrefix2(String[] str)
    {
    String base=str[0];
        for(int i=0;i<base.length();++i)        //loop through characters of base "flower"
        {
            for(String word : str)              //loop through words of str 
            {    //0     5                //f         !=      f
                if(i==word.length() || word.charAt(i)!=base.charAt(i))
                {
                    return base.substring(0,i);
                }
            }
        }
        return base;
    }
    public static void LongestCommonPrefix(String[] str)
    {
        String tempStr="";
        String temp="";
        str[0].toCharArray();
        for(int j=0;j<str.length-1;++j)
        {
            for(int i=0;i<str[j].length()-1;++i)
            {
                if(str[j+1].length()<str[j].length())
                {
                    temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        for(String myStr: str )
        {
            System.out.println(myStr);
        }
        tempStr="";
        temp=str[0];
        for(int j=0;j<str.length-2;++j)
        {
            for(int i=0;i<str[j].length()-1;++i)
            {
                if(temp.charAt(i)==str[j+1].charAt(i))
                {
                tempStr+=str[j+1].charAt(i);
                }
                
            }
            temp=tempStr;
        }
        System.out.println(tempStr);
    }
}
