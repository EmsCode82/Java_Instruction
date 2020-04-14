package business;

public class Pet {

	    private int iD;
	    private String type;
	    private String species;
	    private String name;
	    private int age;
		
	    public Pet() {
	    	iD = 0;
	    	type = "";
	    	species = "";
	    	name = "";
	    	age = 0;
			
	    }

		public Pet(int iD, String type, String species, String name, int age) {
			super();
			this.iD = iD;
			this.type = type;
			this.species = species;
			this.name = name;
			this.age = age;
		}

		public int getiD() {
			return iD;
		}

		public void setiD(int iD) {
			this.iD = iD;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Pet [iD=" + iD + ", type=" + type + ", species=" + species + ", name=" + name + ", age=" + age
					+ "]";
		}
}
			    