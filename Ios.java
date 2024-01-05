package MyPackage;

import java.io.BufferedOutputStream;

import  java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//file
public class Ios {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileOutputStream  fos= new FileOutputStream("D:\\t1.txt");
     BufferedOutputStream bos=new BufferedOutputStream(fos);
     String str="Welcome to java";
     byte b[]=str.getBytes();
  fos.write(b);
     System.out.println("success");
	}

}
