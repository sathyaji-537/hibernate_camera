package com.xworkz.camera.tester;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;

public class ReadTester {
public static void main(String[] args) {
		
		CameraDAO dao = new CameraDAOImpl();
		System.out.println(dao.readById(1));
		
	}

}
