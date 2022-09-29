package stingsDemo;



public class Main {

	public static void main(String[] args) {
		
		String mesaj = "   Bugün hava çok güzel  "; 
		
		System.out.println(mesaj);
		System.out.println("eleman sayısı : "+mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(9));
		System.out.println(mesaj.concat(" dışarı çıkabiliriz "));
		System.out.println("ilk karakter b'mi : " + mesaj.startsWith("a"));
		System.out.println("son karakter l'mi : "+ mesaj.endsWith("l"));
		
		System.out.println("--------------------------------------------");
		
		char[] karakterler = new char [6]; 
		mesaj.getChars(0, 6,karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("ü"));
		System.out.println(mesaj.lastIndexOf("üz"));
		
		String yeniMesaj = (mesaj.replace(" ", "-"));
		System.out.println(yeniMesaj);
		System.out.println(yeniMesaj.substring(5,11));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		
	}	
}

