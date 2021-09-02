package com.xworkz.camera.tester;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;

public class SaveTester {
public static void main(String[] args) {
		
		CameraDAO dao = new CameraDAOImpl();
		CameraEntity ent1 = new CameraEntity(1, "canon 123", "canon","DSLR",30000.00, 5, 30);
		CameraEntity ent2 = new CameraEntity(2, "nikson 001", "nikson","DSLR",35000.00, 7, 40);
		CameraEntity ent3 = new CameraEntity(3, "sony 608", "sony","helecam",300000.00, 5, 48);


		
		
		
		dao.save(ent1);
		dao.save(ent2);
		dao.save(ent3);
	}

}
