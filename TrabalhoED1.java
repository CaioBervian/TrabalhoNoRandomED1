package Trabalho;

import java.util.Calendar;
import java.util.Scanner;
 
public class TrabalhoED1 {

	public static void main(String[] args) {
		int resposta;
		int valor2;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("1 - Valor aleatório;");
			System.out.println("2 - Valor aleatório em certo intervalo;");
			System.out.println("3 - Cara ou coroa;");
			System.out.println("4 - Dados;");
			System.out.println("5 - Sair;");
			resposta = entrada.nextInt();
		
			if (resposta ==1) {
				Aleatorio(resposta);}
			if (resposta ==2) {
			    int valor1;
				do {
					System.out.println("Quer um valor aleatório entre qual intervalo? OBS: Valor1> Valor2");
				    valor1 = entrada.nextInt();
				    valor2 = entrada.nextInt();
				    } while ( valor1>valor2);
				Aleatoriointervalo(valor1,valor2);}
			if (resposta ==3) {
				Coc(resposta);}
			if (resposta ==4) {
				do {
				    System.out.println("Qual tamanho do dado?");
				    valor2 = entrada.nextInt();
					} while (!((valor2==4) || (valor2==6) || (valor2==8) || (valor2==10) || (valor2==12) || (valor2==20) || (valor2==60) || (valor2==100)));
				Dados(valor2);}
			if (resposta ==5) {
				break;}
			
		} while (resposta !=5);
		entrada.close();
		}
		
		public static void Aleatorio(int resposta) {
	      
			Calendar calendario1 = Calendar.getInstance();
			calendario1.getTime();
			
			long valorLong = calendario1.getTimeInMillis(); 

	        String longString = String.valueOf(valorLong);

	        int posicaoUltimoCaractere = longString.length() - 2; 
	        int tamanhoString = longString.length(); 

	        String ultimoCaractere = longString.substring(posicaoUltimoCaractere, tamanhoString);

	        System.out.println("O sorteado foi: " + ultimoCaractere);
		}
		
		public static void Aleatoriointervalo(int valor1,int valor2) {
			int TAM =100000;
			Calendar calendario1[] = new Calendar[TAM];
			int i=0;
			int resultado=0;
			calendario1[i] = Calendar.getInstance();
			calendario1[i].getTime();
		    if ((valor1 >= 10 & valor2<=100) || (valor1 <=100 & valor2 >=10)) {

		    	long valorLong = calendario1[i].getTimeInMillis(); 
		        String longString = String.valueOf(valorLong);
		        int tamanhoString = longString.length()-2; 
		        String ultimoCaractere = longString.substring(tamanhoString);
		        long convertido = Long.parseLong(ultimoCaractere);

		        	while (!(!(resultado >= valor1) & !(resultado<=valor2)) || (!(!(resultado <=valor1) & !(resultado >=valor2)))) {
		
		        	i++;
				     if(resultado <valor1){
				    	 
				    	 resultado = (int) (convertido+resultado);
				     }
				     if (resultado > valor2) {
				    	 resultado = (int) (convertido-resultado);;
				     }
		        	
		    		calendario1[i] = Calendar.getInstance();
		        	calendario1[i].getTime();
			    	valorLong = calendario1[i].getTimeInMillis(); 
			        longString = String.valueOf(valorLong);
			        tamanhoString = longString.length()-2; 
			        ultimoCaractere = longString.substring(tamanhoString);
			        convertido = Long.parseLong(ultimoCaractere);

			     if (i==99999) {
			    	 break;
			     }
		    		}     		
		        System.out.println("O sorteado entre " +valor1+" e " +valor2+ " foi: " + resultado +"\n"); }
		    
		    else {
		    	if ((valor1 >= 10 & valor2<=1000) || (valor1 <=1000 & valor2 >=10)) {

			    	long valorLong = calendario1[i].getTimeInMillis(); 
			        String longString = String.valueOf(valorLong);
			        int tamanhoString = longString.length()-3; 
			        String ultimoCaractere = longString.substring(tamanhoString);
			        long convertido = Long.parseLong(ultimoCaractere);

			        	while (!(!(resultado >= valor1) & !(resultado<=valor2)) || (!(!(resultado <=valor1) & !(resultado >=valor2)))) {
			
			        	i++;
					     if(resultado <valor1){
					    	 
					    	 resultado = (int) (convertido+resultado);
					     }
					     if (resultado > valor2) {
					    	 resultado = (int) (convertido-resultado);;
					     }
			        	
			    		calendario1[i] = Calendar.getInstance();
			        	calendario1[i].getTime();
				    	valorLong = calendario1[i].getTimeInMillis(); 
				        longString = String.valueOf(valorLong);
				        tamanhoString = longString.length()-2; 
				        ultimoCaractere = longString.substring(tamanhoString);
				        convertido = Long.parseLong(ultimoCaractere);

				     if (i==99999) {
				    	 break;
				     }
			    		}     		
			        System.out.println("O sorteado entre " +valor1+" e " +valor2+ " foi: " + resultado +"\n"); }
		  
		    	if ((valor1 < 0 & valor2<=1000) || (valor1 <=1000 & valor2 <0)) {
		        System.out.println("Impossível número negativo");}
		  
		    
		    		if ((valor1 >=0 & valor2<=10) || (valor1 <=10 & valor2 >=0)) {	    	

		    	    	long valorLong = calendario1[i].getTimeInMillis(); 
		    	        String longString = String.valueOf(valorLong);
		    	        int tamanhoString = longString.length()-1; 
		    	        String ultimoCaractere = longString.substring(tamanhoString);
		    	        long convertido = Long.parseLong(ultimoCaractere);

		    	        	while (!(!(resultado >= valor1) & !(resultado<=valor2)) || (!(!(resultado <=valor1) & !(resultado >=valor2)))) {
		    	
		    	        	i++;
		    			     if(resultado <valor1){
		    			    	 
		    			    	 resultado = (int) (convertido+resultado);
		    			     }
		    			     if (resultado > valor2) {
		    			    	 resultado = (int) (convertido-resultado);;
		    			     }
		    	        	
		    	    		calendario1[i] = Calendar.getInstance();
		    	        	calendario1[i].getTime();
		    		    	valorLong = calendario1[i].getTimeInMillis(); 
		    		        longString = String.valueOf(valorLong);
		    		        tamanhoString = longString.length()-2; 
		    		        ultimoCaractere = longString.substring(tamanhoString);
		    		        convertido = Long.parseLong(ultimoCaractere);

		    		     if (i==99999) {
		    		    	 break;
		    		     }
		    	    		}     		
		    	        System.out.println("O sorteado entre " +valor1+" e " +valor2+ " foi: " + resultado +"\n"); }}}
		
		
		public static void Coc(int resposta) {
			int TAM =100000;
			Calendar calendario1[] = new Calendar[TAM];
			int cont1=0;
			int cont2 =0;
			int i=0;
			calendario1[i] = Calendar.getInstance();
			calendario1[i].getTime();	
			long valorLong = calendario1[i].getTimeInMillis(); 
	        String longString = String.valueOf(valorLong);
	        int posicaoUltimoCaractere = longString.length() - 5; 
	        int tamanhoString = longString.length(); 
	        String ultimoCaractere = longString.substring(posicaoUltimoCaractere,tamanhoString);
	        long convertido = Long.parseLong(ultimoCaractere);
			do {
				if (i==TAM) {
					break;
				}
				i++;
	    		calendario1[i] = Calendar.getInstance();
	        	calendario1[i].getTime();
		    	valorLong = calendario1[i].getTimeInMillis(); 
		        longString = String.valueOf(valorLong);
		        posicaoUltimoCaractere = longString.length() - 5; 
		        tamanhoString = longString.length(); 
		        ultimoCaractere = longString.substring(posicaoUltimoCaractere,tamanhoString);
		        long numero = Long.parseLong(ultimoCaractere);
	        if (numero%2 == 1) {
				cont1++;
				}
	        
		        if (numero%2 == 0) {
					cont2++;}
	       
	        } while ((cont1+cont2)<convertido);
		if(cont2<cont1) {
			System.out.println("Cara ganhou. Caiu " + cont1+ " vezes,de um total de " + convertido);
		} else 
			System.out.println("Coroa ganhou. Caiu " + cont2+ " vezes,de um total de " + convertido);
		}
		
		
		public static void Dados(int valor2) {
			int TAM= 100000;
			Calendar calendario1[] = new Calendar[TAM];
			int i=0;
			int j=0;
			int resultado=0;
			calendario1[i] = Calendar.getInstance();
			calendario1[i].getTime();	
			    	long valorLong = calendario1[i].getTimeInMillis(); 
			        String longString = String.valueOf(valorLong);
			        int tamanhoString = longString.length()-1; 
			        String ultimoCaractere = longString.substring(tamanhoString);
			        long convertido = Long.parseLong(ultimoCaractere);

			        	do {
			
			        if (valor2 == 4) {
			        	for(i=1;i<=convertido;) {
			        		do {        			
			        			calendario1[i] = Calendar.getInstance();
			        			calendario1[i].getTime();
			        			valorLong = calendario1[i].getTimeInMillis(); 
			        	        longString = String.valueOf(valorLong);
			        	        tamanhoString = longString.length()-1; 
			        	        ultimoCaractere = longString.substring(tamanhoString);
			        	        long convertido2 = Long.parseLong(ultimoCaractere);
			        	        
			        			if ((convertido2 > 0) & (convertido2<=4)){
			        				j++;
			        				i++;
			        				resultado = (int) (resultado+convertido2);
			        			}
			        		} while ((j<convertido) & (j==0));
			        		
			        	}
			        			
			        }
			        
			        if (valor2 == 6) {
			        	for(i=1;i<=convertido;) {
			        		do {        			
			        			calendario1[i] = Calendar.getInstance();
			        			calendario1[i].getTime();
			        			valorLong = calendario1[i].getTimeInMillis(); 
			        	        longString = String.valueOf(valorLong);
			        	        tamanhoString = longString.length()-1; 
			        	        ultimoCaractere = longString.substring(tamanhoString);
			        	        long convertido2 = Long.parseLong(ultimoCaractere);
			        	        
			        			if ((convertido2 > 0) & (convertido2<=6)){
			        				j++;
			        				i++;
			        				resultado = (int) (resultado+convertido2);
			        			}
			        		} while ((j<convertido) & (j==0));
			        		
			        	}
			        			
			        }
			        if (valor2 == 8) {
			        	for(i=1;i<=convertido;) {
			        		do {        			
			        			calendario1[i] = Calendar.getInstance();
			        			calendario1[i].getTime();
			        			valorLong = calendario1[i].getTimeInMillis(); 
			        	        longString = String.valueOf(valorLong);
			        	        tamanhoString = longString.length()-1; 
			        	        ultimoCaractere = longString.substring(tamanhoString);
			        	        long convertido2 = Long.parseLong(ultimoCaractere);
			        	        
			        			if ((convertido2 > 0) & (convertido2<=8)){
			        				j++;
			        				i++;
			        				resultado = (int) (resultado+convertido2);
			        			}
			        		} while ((j<convertido) & (j==0));
			        		
			        	}
			        			
			        }
			        if (valor2 == 10) {
			        	for(i=1;i<=convertido;) {
			        		do {        			
			        			calendario1[i] = Calendar.getInstance();
			        			calendario1[i].getTime();
			        			valorLong = calendario1[i].getTimeInMillis(); 
			        	        longString = String.valueOf(valorLong);
			        	        tamanhoString = longString.length()-2; 
			        	        ultimoCaractere = longString.substring(tamanhoString);
			        	        long convertido2 = Long.parseLong(ultimoCaractere);
			        	        
			        			if ((convertido2 > 0) & (convertido2<=10)){
			        				j++;
			        				i++;
			        				resultado = (int) (resultado+convertido2);
			        			}
			        		} while ((j<convertido) & (j==0));
			        		
			        	}
			        			
			        }
			        if (valor2 == 12) {
			        	for(i=1;i<=convertido;) {
			        		do {        			
			        			calendario1[i] = Calendar.getInstance();
			        			calendario1[i].getTime();
			        			valorLong = calendario1[i].getTimeInMillis(); 
			        	        longString = String.valueOf(valorLong);
			        	        tamanhoString = longString.length()-2; 
			        	        ultimoCaractere = longString.substring(tamanhoString);
			        	        long convertido2 = Long.parseLong(ultimoCaractere);
			        	        
			        			if ((convertido2 > 0) & (convertido2<=12)){
			        				j++;
			        				i++;
			        				resultado = (int) (resultado+convertido2);
			        			}
			        		} while ((j<convertido) & (j==0));
			        		
			        	}
			        			
			        }
			        if (valor2 == 20) {
			        	for(i=1;i<=convertido;) {
			        		do {        			
			        			calendario1[i] = Calendar.getInstance();
			        			calendario1[i].getTime();
			        			valorLong = calendario1[i].getTimeInMillis(); 
			        	        longString = String.valueOf(valorLong);
			        	        tamanhoString = longString.length()-3; 
			        	        ultimoCaractere = longString.substring(tamanhoString);
			        	        long convertido2 = Long.parseLong(ultimoCaractere);
			        	        
			        			if ((convertido2 > 0) & (convertido2<=20)){
			        				j++;
			        				i++;
			        				resultado = (int) (resultado+convertido2);
			        			}
			        		} while ((j<convertido) & (j==0));
			        		
			        	}
			        			
			        }
			        if (valor2 == 60) {
			        	for(i=1;i<=convertido;) {
			        		do {        			
			        			calendario1[i] = Calendar.getInstance();
			        			calendario1[i].getTime();
			        			valorLong = calendario1[i].getTimeInMillis(); 
			        	        longString = String.valueOf(valorLong);
			        	        tamanhoString = longString.length()-2; 
			        	        ultimoCaractere = longString.substring(tamanhoString);
			        	        long convertido2 = Long.parseLong(ultimoCaractere);
			        	        
			        			if ((convertido2 > 0) & (convertido2<=60)){
			        				j++;
			        				i++;
			        				resultado = (int) (resultado+convertido2);
			        			}
			        		} while ((j<convertido) & (j==0));
			        		
			        	}
			        			
			        }
			        if (valor2 == 100) {
			        	for(i=1;i<=convertido;) {
			        		do {        			
			        			calendario1[i] = Calendar.getInstance();
			        			calendario1[i].getTime();
			        			valorLong = calendario1[i].getTimeInMillis(); 
			        	        longString = String.valueOf(valorLong);
			        	        tamanhoString = longString.length()-3; 
			        	        ultimoCaractere = longString.substring(tamanhoString);
			        	        long convertido2 = Long.parseLong(ultimoCaractere);
			        	        
			        			if ((convertido2 > 0) & (convertido2<=100)){
			        				j++;
			        				i++;
			        				resultado = (int) (resultado+convertido2);
			        			}
			        		} while ((j<convertido) & (j==0));
			        		
			        	}
			        			
			        }
			        
			  
			        	} while (j < convertido);	 		
			        System.out.println("O dado de " + valor2+ " lados girou "+(i-1)+" vezes,resultando total de: " + resultado +"\n"); 
			}
	

	}

