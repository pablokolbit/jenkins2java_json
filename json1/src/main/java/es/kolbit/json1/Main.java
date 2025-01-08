package es.kolbit.json1;

public class Main {

	public static void main(String[] args) {
		String json = "{\"nombre\":\"Jorgelina\"}";
		LeerJsonPersona leer = new LeerJsonPersona();
		Persona p = leer.getPersona(json);
		System.out.println(p);
	}

}
