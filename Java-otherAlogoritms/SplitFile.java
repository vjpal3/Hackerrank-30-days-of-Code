package com.vjpal.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SplitFile {

	public static void readLargeFile() {
		StringBuilder text = new StringBuilder();
		
		try (BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("src\\com\\vjpal\\misc\\data\\PS_20174392719_1491204439457_log.csv"), "UTF-8"))) {
			int count = 0;
			
			int fileCount = 0;
			String line = in.readLine(); // skip header
			
			while ((line = in.readLine()) != null) {
				text.append(line).append("\n");
				count++;
				
				if(count > 500000) {
					fileCount++;
					writeMultipleFiles(text.toString(), fileCount);
					count = 0;
					text.setLength(0);
				}
			}
			if(text.length() != 0) {
				fileCount++;
				writeMultipleFiles(text.toString(), fileCount);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeMultipleFiles(String text, int fileCount) throws IOException {
		
		String filenameSuffix = "part_";
		
		String newFilename = "src/com/vjpal/misc/data/PS_20174392719_1491204439457_log_" + filenameSuffix + fileCount + ".csv";
		System.out.println(newFilename);
		
		File file = new File(newFilename);
		if(!file.exists()) {
			file.createNewFile();
		}					
		
		try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(newFilename), "UTF-8"))) {
				out.write(text.toString());		
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		readLargeFile();

	}

}
