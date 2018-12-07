package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.GradeVo;

public class GradeService {
	
	List<GradeVo> gradeList;
	List<String> strNumList;
	
	String strFileName;
	
	public GradeService(String strFileName) {
		strNumList = new ArrayList();
		gradeList = new ArrayList();
		this.strFileName = strFileName;
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strFileName);
			br = new BufferedReader(fr);
			while(true) {
				String strL = br.readLine();
				
				if(strL == null)break;
				
				String[] strR = strL.split(":");
				
				GradeVo vo = new GradeVo();
				
				vo.setStrName(strR[0]);
			
				gradeList.add(vo);
				
			}
			br.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void makeNum() {
		for(int i = 0; i < gradeList.size(); i++) {
			
			strNumList.add(String.valueOf(i+1));
		}
		
		//Set<String> setString = new TreeSet(strNumList);
		//strNumList = new ArrayList(setString);
	}
	public void addNum() {
		
		int intS = strNumList.size();
		for(int i = 0; i < intS ; i++) {
			 GradeVo vo = gradeList.get(i);
			 String strNum = strNumList.get(i);
			
			 vo.setStrNum(strNum);
		}
	}
	
	public void view() {
		int intS = gradeList.size();
		System.out.println("=======================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		for(int i = 0 ; i < intS;i++) {
			System.out.print(gradeList.get(i).getStrNum() + "\t");
			System.out.print(gradeList.get(i).getStrName() + "\t");
			System.out.print(gradeList.get(i).getIntK() + "\t");
			System.out.print(gradeList.get(i).getIntE() + "\t");
			System.out.print(gradeList.get(i).getIntM() + "\t");
			System.out.print(gradeList.get(i).getIntSum() + "\t");
			System.out.print(gradeList.get(i).getFloatAvg() + "\n");
		}
	}
	
	public void makeScore() {
		for(GradeVo vo : gradeList) {
			int intK = (int)(Math.random() * (100-50+1))+50;
			int intE = (int)(Math.random() * (100-50+1))+50;
			int intM = (int)(Math.random() * (100-50+1))+50;
			
			vo.setIntK(intK);
			vo.setIntE(intE);
			vo.setIntM(intM);
			
			int intSum = intK + intE + intM;
			float floatAvg = intSum/3.0f;
			
			vo.setIntSum(intSum);
			vo.setFloatAvg(floatAvg);
		}
	}
	
}
