package business;

public class Pet {

	    private int ID;
	    private String Type;
	    private String Species;
	    private String Name;
	    private int Age;
		
	    public Pet() {
	    	ID = 0;
	    	Type = "";
	    	Species = "";
	    	Name = "";
	    	Age = 0;
			
	    }

		public Pet(int iD, String type, String species, String name, int age) {
			super();
			this.ID = iD;
			this.Type = type;
			this.Species = species;
			this.Name = name;
			this.Age = age;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getType() {
			return Type;
		}

		public void setType(String type) {
			Type = type;
		}

		public String getSpecies() {
			return Species;
		}

		public void setSpecies(String species) {
			Species = species;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getAge() {
			return Age;
		}

		public void setAge(int age) {
			Age = age;
		}

		@Override
		public String toString() {
			return "Pet [ID=" + ID + ", Type=" + Type + ", Species=" + Species + ", Name=" + Name + ", Age=" + Age
					+ "]";
		}
	    
}

	    