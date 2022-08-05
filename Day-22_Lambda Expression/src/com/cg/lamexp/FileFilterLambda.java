package com.cg.lamexp;

import java.io.File;

import java.io.FileFilter;
public class FileFilterLambda {

	public static void main(String[] args) {
		FileFilter obj=(File Pathname)->Pathname.getName().endsWith(".pptx");
		File dir=new File("C:\\Users\\shweta dhande\\Downloads");
		File[] contents=dir.listFiles(obj);
		for(File i:contents)
		{
			System.out.println(i);
		}

	}

}
