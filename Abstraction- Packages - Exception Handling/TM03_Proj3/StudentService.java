package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarks(Student data[])
	{
	           int x=0;
	           for(int i=0;i<data.length;i++)
	           {
	        	   if(data[i]==null)
	        	   {
	        		   
	        	   }
	        	   else if(data[i].getMarks()==null)
	        		   x++;
	           }
	           return x;
	}
	public int findNumberOfNullNames(Student data [])
	{
		 int x1=0;
         for(int i=0;i<data.length;i++)
         {
        	 if(data[i]==null)
        	 {
        		 
        	 }
         else if(data[i].getName()==null)
      		   x1++;
         }
         return x1;
	                  
	}
	public int findNumberOfNullObjects(Student data [])
	{
		 int x2=0;
         for(int i=0;i<data.length;i++)
         {
      	   if(data[i]==null)
      		   x2++;
         }
         return x2;  
	}
}
