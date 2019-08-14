package IBM_1408;

public enum Level {
		
		HIGH(3),
		MEDIUM(2),
		LOW(1);
		private int levelCode;
		private Level(int levelCode) {
			this.levelCode=levelCode;
		}
		
		public int getLevelCode() {
			return levelCode;
		}
	}


