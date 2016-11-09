import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static class Node{
        int data ;
        int left ;
        int right ;
        int depth ;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t,k ;
        Node[] nodes = new Node[n+1];
        int a,b ;
        for( int i=1 ; i<=n ; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            nodes[i] = new Node();
            nodes[i].data = i;
            nodes[i].left = a;
            nodes[i].right = b;
        }
        t = scanner.nextInt();
        int temp ; 
        for( int i=0 ; i<t ; i++ ){
            k = scanner.nextInt();
            int multiplier =1;
            while( k*multiplier<=n ){ 
                swapNodesAtDepth(nodes,1,1,k*multiplier,n) ;
                multiplier++ ;
            }
            printInorder(nodes,1,n);
            System.out.println();
        }
    }
    
    public static void swapNodesAtDepth(Node[] nodes,int i,int curDepth,int d,int n){
        if(i>n || i==-1 || curDepth>d )
            return ;
        if( curDepth==d ){
            int temp = nodes[i].left;     
            nodes[i].left = nodes[i].right ;
            nodes[i].right = temp ;
        }else{
            swapNodesAtDepth(nodes,nodes[i].left,curDepth+1,d,n);
            swapNodesAtDepth(nodes,nodes[i].right,curDepth+1,d,n);
        }
        
    }
    
    public static void printInorder(Node[] nodes,int i,int n){
        if(i>n || i==-1)
            return ;
        printInorder(nodes,nodes[i].left,n);
        System.out.print(nodes[i].data+" ");
        printInorder(nodes,nodes[i].right,n);
    }
}
