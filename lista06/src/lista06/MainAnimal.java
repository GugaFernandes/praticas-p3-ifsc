package lista06;

public class MainAnimal {

	public static void main(String[] args) {
	
	Gato siames = new Gato();	
	
	siames.setCor("Branco com cinza");
	
	siames.setNumPatas(4);
	
	siames.setEcoSist("casa");
	
	siames.setComp(46f);
	
	siames.setNome("pacheco valencio");
	
	siames.setRaca("siames");
	
	
	System.out.println(siames.getCor());
	System.out.println(siames.getNome());
	System.out.println(siames.getRaca());
	System.out.println(siames.getEcoSist());
	System.out.println(siames.getComp());
	siames.mia();
	siames.caminha();
	
	
  
	//divisória maneira
	
	
    Cachorro caramelo = new Cachorro ();
    
    caramelo.setCor("caramelo");
    
    caramelo.setNumPatas(4);
    
    caramelo.setComp(80f);
    
    caramelo.setNome("nestor cabeca chata");
    
    caramelo.setRaca("caramelo");
    
    System.out.println(caramelo.getCor());
    System.out.println(caramelo.getNome());
    System.out.println(caramelo.getRaca());
    System.out.println(caramelo.getComp());
    System.out.println(caramelo.getEcoSist());
    caramelo.late();
    caramelo.caminha();
    
    
    
    
    
    
	
	}

}
