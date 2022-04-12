package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
	public String findGrade(Student studentObject)
	{
		int b[]=studentObject.getMarks();
		int flag=0;
		String flag1="";
		for(int i=0;i<3;i++)
		{
			if(b[i]<35)
				flag=1;
		}
		if(flag==1)
			 flag1="F";
		else
		{
			int sum=0;
			for(int i1=0;i1<3;i1++)
			{
				sum=sum+b[i1];
			}
			if(sum<=150)
				flag1="D";
			else if(sum>150&&sum<=200)
				flag1="C";
			else if(sum>200&&sum<=250)
				flag1="B";
			else if(sum>250&&sum<=300)
				flag1="A";
		}
		return flag1;
	}
	public String validate 	(Student studentObject)	throws NullStudentObjectException,NullNameException,NullMarksArrayException
	{
		String result="";
		try
		{
		if(studentObject==null)
			throw new NullStudentObjectException();
		else
		{
			if(studentObject.getName()==null||studentObject.getName().isEmpty())
				throw new NullNameException();
			if(studentObject.getMarks()==null)
				throw new NullMarksArrayException();
			else
				result=findGrade(studentObject);
				
		}
		}
		catch(Exception e)
		{
			result=e.toString();
		}
		return result;
	}

}
