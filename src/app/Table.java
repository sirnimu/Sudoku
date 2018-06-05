package app;

import java.util.ArrayList;
import java.util.List;

public class Table {
	
	private int[][] table;
	private List<Integer> values;
	
	Table(int[][] table){
		this.table = table;
		values = new ArrayList<Integer>();
		for (int i = 1; i <= table.length; i++) {
			values.add(i);
		}
	}
	
	public void checkHorizontal() {
		for (int k = 0; k < table.length; k++) {
			List<Integer> tempValues = new ArrayList<Integer>(values); 
			for (int i = 0; i < table.length; i++) {
				int index = tempValues.indexOf(table[k][i]);
				if (index == -1) {
					System.out.println((k+1) + " eilutëj, skaièius " + table[k][i] + " pasikartoja daugiau nei kartà");
				}
				else {
					tempValues.remove(index);
				}
			}
		}
	}
	
	public void checkVertical() {
		for (int i = 0; i < table.length; i++) {
			List<Integer> tempValues = new ArrayList<Integer>(values); 
			for (int k = 0; k < table.length; k++) {
				int index = tempValues.indexOf(table[k][i]);
				if (index == -1) {
					System.out.println((i+1) + " stulpelyje, skaièius " + table[k][i] + " pasikartoja daugiau nei kartà");
				}
				else {
					tempValues.remove(index);
				}
			}
		}
	}
	
	public void checkSquare() {
		for (int kvadratoStulpelis = 0; kvadratoStulpelis < table.length/3; kvadratoStulpelis++) {
			for (int kvadratoEil = 0; kvadratoEil < table.length/3; kvadratoEil++) {
				List<Integer> tempValues = new ArrayList<Integer>(values); 
				for (int eilute = kvadratoStulpelis * 3; eilute < (kvadratoStulpelis + 1) * 3; eilute++) {
					for (int stulpelis = kvadratoEil * 3; stulpelis < (kvadratoEil + 1)*3; stulpelis++) {
						int index = tempValues.indexOf(table[eilute][stulpelis]);
						if (index == -1) {
							System.out.println((kvadratoEil + 1) + " kvadratø stulpelyje " + (kvadratoStulpelis + 1) + " kvadratø eilutëj , skaièius " + table[eilute][stulpelis] + " pasikartoja daugiau nei kartà");
						}
						else {
							tempValues.remove(index);
						}
					}
				}
			}
		}
	}
	
	public void checkFirstDiagonal() {
		List<Integer> tempValues = new ArrayList<Integer>(values); 
		for (int eilute = 0; eilute < table.length; eilute++) {
			for (int stulpelis = 0; stulpelis < table.length; stulpelis++) {
				if (eilute == stulpelis) {
					int index = tempValues.indexOf(table[eilute][stulpelis]);
					if (index == -1) {
						System.out.println("Pirmoje ástriþainëje, skaièius " + table[eilute][stulpelis] + " pasikartoja daugiau nei kartà");
					}
					else {
						tempValues.remove(index);
					}
				}
				
			}
		}
	}
	
	public void checkSecondDiagonal() {
		List<Integer> tempValues = new ArrayList<Integer>(values); 
		for (int eilute = 0; eilute < table.length; eilute++) {
			for (int stulpelis = 0; stulpelis < table.length; stulpelis++) {
				if (eilute + stulpelis == table.length - 1) {
					int index = tempValues.indexOf(table[eilute][stulpelis]);
					if (index == -1) {
						System.out.println("Antroje ástriþainëje, skaièius " + table[eilute][stulpelis] + " pasikartoja daugiau nei kartà arba neáraðytas");
					}
					else {
						tempValues.remove(index);
					}
				}
			}
		}
	}
	
}
