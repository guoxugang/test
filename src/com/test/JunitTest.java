package com.test;  
import java.util.Scanner;

import org.junit.Test;  
public class JunitTest{  
        @Test  
        public void test0(){  
        	System.out.print("����");
	    	Scanner scan = new Scanner(System.in);
	    	String read = scan.nextLine();
	    	System.out.println("�������ݣ�"+read); 
        }  
          
        @Test  
        public void test1(){  
        	System.out.print("�����ַ���:");
	    	Scanner scan = new Scanner(System.in);
	    	String read = scan.nextLine();
	    	String[] aa=read.split("\\."); 
	    	for(int i=0; i<aa.length; i++){ 
	    		System.out.println(aa[i]+"   ");
	    	}
        } 
        
        @Test
        public void test2(){
        	String str="a,az,l";
        	String[] str1=str.split(",");
        	for(String str2:str1){
        		System.out.println(str2);
        	}
        }
        
        //���ݿո����ַ���
        @Test
        public void test3(){
        	String str="12      3 45    6 789 0";
        	String[] str1=str.split("\\s+");
        	for(String str2:str1){
        		System.out.println(str2);
        	}
        }
        
        //���ַ����е���������
        @Test
        public void  test4(){
        	String str="987654321";
        	char[] chr=str.toCharArray();
        	for(int i=0;i<chr.length;i++){
        		for(int j=0;j<i-1;j++){
        			if(chr[j]<chr[i]){
        				char m=0;
        				m=chr[j];
        				chr[j]=chr[i];
        				chr[i]=m;
        			}
        		}
        	}
        	
        }
} 