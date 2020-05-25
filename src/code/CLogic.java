package code;

import java.util.Random;

public class CLogic {
	
	private String msg ;
	private String saida = "";
	private String linha;
	private String a = "kldjpgqmvczweaisçnofx urythz";
	private String b = "vxhsz ifçljqrpoutyekdgambcnw";
	private String c = "tragfvbyujhzmi klnqspwoerçdc";
	private int u;
	private char comp;
	
	Random random = new Random();
	private int ra;
	
	
	public void codificar () {
		
		for(int i = 0; i < msg.length(); i++) {
				comp = msg.charAt(i);
				ra = random.nextInt(3);
					switch (ra) {
						case 0:
							linha = "01";
							u = a.indexOf(comp);
							montarSaida();
						break;
						
						case 1:
							linha = "02";
							u = b.indexOf(comp);
							montarSaida();
						break;
						
						case 2:
							linha = "03";
							u = c.indexOf(comp);
							montarSaida();
						break;
					}
				
					//System.out.println("esta em ca: " + ca);
					//System.out.println("esta em comp: " + comp);
					//System.out.println("esta em ra: " + ra);
					//System.out.println("saida: " + saida);
				}
			}
		
	
	private void montarSaida() {
		if(u < 10) {
			String uu = "0" + Integer.toString(u);
			saida = saida + linha + uu;
		} else
			saida = saida + linha + Integer.toString(u);	
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
