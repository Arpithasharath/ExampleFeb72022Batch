package com.sgtesting.actitime.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ActiTimeReflectionCreateCustomer {
		public static void main(String[] args) {
			executeactitime();

		}
		private static void executeactitime()
		{
				Workbook wb=null;
				FileInputStream fin=null;
				Sheet sh=null;
				Row row=null;
				Cell cell=null;
				try
				{
					fin=new FileInputStream("E:\\Reflection\\Scenario1.xlsx");
					wb= new XSSFWorkbook(fin);
					sh=wb.getSheet("sheet2");
					int rc=sh.getPhysicalNumberOfRows();
					for(int i=1;i<rc;i++)
					{
						row=sh.getRow(i);
						cell=row.getCell(0);
						String methodname=cell.getStringCellValue();
						cell=row.getCell(1);
						String pkgclsname=cell.getStringCellValue();
						
						Class cls=Class.forName(pkgclsname);
						Object obj=cls.getDeclaredConstructor().newInstance();
						
						Method method=obj.getClass().getMethod(methodname);
						method.invoke(obj);
						
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


