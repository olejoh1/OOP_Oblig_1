public class Person {
    //Classen blir brukt av Oppg3
	private String fornavn;
	private String etternavn;
	private int alder;

	public Person(String fornavn, String etternavn, int alder) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.alder = alder;
	}

	public String getFornavn() {
		return this.fornavn;
	}

	public String getEtternavn() {
		return this.etternavn;
	}

	public int getAlder() {
		return this.alder;
	}
}