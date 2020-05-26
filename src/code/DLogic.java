package code;

public class DLogic {

	
	private String msg;
	private String saida = "";
	private String a = "kldjpgqmvczweaisçnofx urythz";
	private String b = "vxhsz ifçljqrpoutyekdgambcnw";
	private String c = "tragfvbyujhzmi klnqspwoerçdc";
	private String n;
	private int inicio = 0 ;
	private int fim = 2;
	private int c1;
	private char u;
	
	
	public void decodificar() {
		
		
		for (int i = 0; i < msg.length(); i+=4) {
			n = msg.substring(inicio, fim);	
			c1 = Integer.parseInt(n);
			pegarLinha(c1);
			inicio+=2;
			fim+=2;	
				}
		}			

	
	private void pegarLinha(int linha) {
		
		switch(linha) {
		
			case 1:

				pegarLetra();
				u = a.charAt(c1);
				saida = saida + u;
				break;
				
			case 2:
				pegarLetra();
				u = b.charAt(c1);
				saida = saida + u;
				break;
				
			case 3:
				pegarLetra();
				u = c.charAt(c1);
				saida = saida + u;
			break;
			
		}
	}
	
	private void pegarLetra() {
		inicio+=2;
		fim+=2;
		n = msg.substring(inicio, fim);
		c1 = Integer.parseInt(n);
	}
	
	
	public String getMsg() {
		return msg;
	}
	
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getSaida() {
		return saida;
	}


	public void setSaida(String saida) {
		this.saida = saida;
	}
}
