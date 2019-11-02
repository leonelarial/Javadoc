package clase1;

/**
 * Comentario de prueba para Javadoc
 */

public class HolaMundo {

	/**
	 * Javadoc para el metodo
	 * @param args
	 */
	
	public static void main(String[] args) {
		


		Persona per = new Persona();
		
		per.setAltura(160);
		per.setNacionalidad("arg");
		per.setFuma(true);
		
		Persona madre = new Persona();
		madre.setNombre("Ana");
		per.setMadre(madre);
		
		Persona padre = new Persona();
		padre.setNombre("Jose");
		per.setPadre(padre);
		
		Persona per2 = new Persona();
		
		per2.setAltura(170);
		per2.setNacionalidad("uru");
		per2.setFuma(false);
		
		Persona madre2 = new Persona();
		madre2.setNombre("Juan");
		per2.setMadre2(madre2);
		
		Persona padre2 = new Persona();
		padre2.setNombre("Andrea");
		per2.setPadre2(padre2);

		
		System.out.println(per.getAltura());
		System.out.println(per.getNacionalidad());
		System.out.println(per.isFuma());
		System.out.println("per padre: " + per.getPadre().getNombre());
		System.out.println("per madre: " + per.getMadre().getNombre());
		
		System.out.println(per2.getAltura());
		System.out.println(per2.getNacionalidad());
		System.out.println(per2.isFuma());


	}
}
