 package com.sgtesting.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleClassesReflection {

	public static void main(String[] args) {
		executetests();

	}
	
	private static void executetests()
	{
		Workbook wb=null;
		FileInputStream fin=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\Reflection\\MethodsReflection.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int i=1;i<rc;i++)
			{
				row=sh.getRow(i);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				System.out.println(methodname+"------------->"+pkgclassname);
				
				Class clsobject=Class.forName(pkgclassname);
				Object obj=clsobject.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
				
				
		/*		Class clsobj=Class.forName(pkgclass);
			//	System.out.println(clsobj);
				Object obj=clsobj.getDeclaredConstructor().newInstance();
			//	System.out.println(obj);
			
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);	*/
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
