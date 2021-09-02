package com.xworkz.camera.tester;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;

public class DeleteTester {
public static void main(String[] args) {
		
		CameraDAO dao = new CameraDAOImpl();
		dao.deleteById(3);

	}

}
