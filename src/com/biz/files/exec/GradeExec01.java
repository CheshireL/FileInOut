package com.biz.files.exec;

import com.biz.files.service.GradeService;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "src/com/biz/files/service/우리말이름.txt";
		GradeService service = new GradeService(readFile);
	
		service.readFile();
		
		service.makeNum();
		
		service.addNum();
		
		service.makeScore();
		
		service.view();
		

	}

}
