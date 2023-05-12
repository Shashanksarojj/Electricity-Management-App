package com.masai.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.masai.entities.Consumer;
//import com.masai.entities.Product;
import com.masai.entities.Bills;

public class FileExists {

	public static Map<String, Consumer> customerFile() {

		Map<String, Consumer> cFile = null;

		File f = new File("Consumer.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {
				
				cFile = new LinkedHashMap<>();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(cFile);
				return cFile;

			} else {
				
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				cFile = (Map<String, Consumer>) ois.readObject();

				return cFile;

			}

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
		return cFile;

	}
	

	public static List<Bills> transactionFile() {

		List<Bills> tFile = new ArrayList<>();

		File f = new File("Bills.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {
				tFile =  new ArrayList<>();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(tFile);

				return tFile;

			} else {

				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				tFile = (List<Bills>) ois.readObject();
				return tFile;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return tFile;

	}
	
	
	
}
