package level4;

public class horseBarn {
	private static Horse[] spaces;

	public int findHorseSpace(String name) {
		int index = 0;
		for (Horse c : spaces) {
			if (c.name.equals(name)) {
				return index;
			}
			index++;
		}
		return -1;
	}
	public horseBarn(Horse[] horses){
		spaces = horses;
	}
	public static void consolidate() {
		int numHorses = 0;
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null) {
				numHorses++;
			}
		}
		Horse[] horsez = new Horse[numHorses];
		int index = 0;
		for (int j = 0; j<spaces.length; j++) {
			if (spaces[j] != null) {
				horsez[index] = spaces[j];
				index++;
			}
		}
		for (int c = 0; c<spaces.length; c++) {
			if (c > numHorses -1) {
				spaces[c] = horsez[c];
			} else {
				spaces[c] = null;
			}
		}
	}

	public static Horse[] getSpaces() {
		return spaces;
	}

	public static horseBarn createTestBarn() {
		Horse[] spaces1 = new Horse[7];
		spaces1[0] = new Horse("Trigger",1340);
		spaces1[1] = null;
		spaces1[2] = new Horse("Silver",1210);
		spaces1[3] = null;
		spaces1[4] = null;
		spaces1[5] = new Horse("Patches",1350);
		spaces1[6] = new Horse("Duke",1410);
		
		return new horseBarn(spaces1);
	}

}
