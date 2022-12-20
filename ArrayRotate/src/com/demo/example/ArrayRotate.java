package com.demo.example;
import java.util.Scanner;

class ArrayRotate {
   
 
static void leftRotate(int arr[], int d, int n)
{
    int temp[] = new int[n];
    int k = 0;
    
    for (int i = d; i < n; i++) {
        temp[k] = arr[i];
        k++;
    }

    for (int i = 0; i < d; i++) {
        temp[k] = arr[i];
        k++;
    }

    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}

static void rightRotate(int arr[], int d, int n)
{
	 for (int i = 0; i < d; i++) 
		 rightRotateArray(arr, n);      
} 
		 
		 public static void rightRotateArray(int arr[], int n) 
		 { 
		 int i, temp; 
		 temp = arr[n - 1]; 
		 for (i = n-1; i > 0; i--) 
		 arr[i] = arr[i - 1];    
		 arr[0] = temp; 
		 } 
 
static void PrintTheArray(int arr[], int n)
{
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
}
    public static void main (String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the length of an array");
    	int N=sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<N;i++){
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position of an array element you wish to rotate");
        int p = sc.nextInt();
        int d=0;
        if(p>0 && p<N){
        System.out.println("Enter 1 for right rotation and 0 for left rotation");
        d = sc.nextInt();
        }
        else{
        	System.out.println("Position of an array element should be greater than 0 and should be less than "+ N);
        }
        
        if(d==0){
        leftRotate(arr, p, N);
        PrintTheArray(arr, N);
        }
        else{
        	rightRotate(arr,p,N);
        	PrintTheArray(arr, N);
        }
    }
}
 