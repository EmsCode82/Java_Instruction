
public class Animal implements ProfessionalRacing {
	private String order;
	private String family;
	private String genus;
	private String species;
	public Animal(String order, String family, String genus, String species) {
		super();
		this.order = order;
		this.family = family;
		this.genus = genus;
		this.species = species;
	}
	public Animal() {
		super();
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "Animal [order=" + order + ", family=" + family + ", genus=" + genus + ", species=" + species + "]";
	}
	
}
