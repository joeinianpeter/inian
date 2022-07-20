package org.telgu;

import org.english.english;
import org.tamil.TamilLanguage;

public class Telgu extends TamilLanguage  {
	public void telgu() {
		System.out.println("telgu separated two states");

	}
	public static void main(String[] args) {
		Telgu e=new Telgu();
		e.telgu();
		e.tamil();
		e.english();
	}

}
