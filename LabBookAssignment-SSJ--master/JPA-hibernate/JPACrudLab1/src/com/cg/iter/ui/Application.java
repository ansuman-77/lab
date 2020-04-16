package com.cg.iter.ui;



import java.io.IOException;
import java.util.Scanner;

import com.cg.iter.entity.Author;
import com.cg.iter.service.AuthorService;
import com.cg.iter.service.AuthorServiceImpl;


public class Application {

	public static void main(String[] args) {
		AuthorService eService = new AuthorServiceImpl();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter <firstName> <middleName> <lastName> <phoneNo>");
		Author aut = new Author(scan.next(), scan.next(), scan.next(),scan.nextLong());
		boolean saved = eService.saveAut(aut);
		if (saved)
			System.out.println("Author saved :)");
		else
			System.out.println("Author not saved :(");
		aut = null;
		System.out.println("Press enter to continue..");
		try {
			System.in.read();
		} catch (IOException e) {
		}
//		System.out.println("Find Author : Enter <id>");
//		aut = eService.getAut(scan.nextInt());
//		System.out.println("Author found: " + aut);
//		if (aut != null) {
//			System.out.println("Enter new designation");
//			aut.setDesignation(scan.next());
//			saved = eService.update(aut);
//			if (saved)
//				System.out.println("Aut updated");
//			else
//				System.out.println("Aut could not be updated");
		}
	}

