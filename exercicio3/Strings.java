package exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings {
	/*
	 * @brief gera uma lista de substring
	 * 
	 * @param recebe uma palavra para gera as substring
	 * 
	 * @returt List<List<String>> com as varios substring
	 */
	int contador = 0;
	public List<List<String>> geradorDeSubstring(String palavra) {
		
		List<List<String>> listaDesubstring = new ArrayList<>();
		for (int i = 0; i < palavra.length(); i++) {
			listaDesubstring.add(new ArrayList<String>(i));
			for (int j = i + 1; j < palavra.length() + 1; j++) {
				listaDesubstring.get(i).add(palavra.substring(i, j));
				
			}
		}
		return listaDesubstring;
	}
	
	/*
	 * @brief compara uma lista de substring
	 * 
	 * @param recebec uma lista de substring
	 * 
	 * @return o numero de string repetidas
	 */

	public int compararSubstring(List<List<String>> listaDesubstring) {
		
		int quantosSaoAnagrama = 0;
		List<String> listaAnagramasRepetidoEmOrdem = new ArrayList<>();
		for (int i = 0; i < listaDesubstring.size(); i++) {
			for (int j = 0; j < listaDesubstring.get(i).size(); j++) {
				
	
				char[] chars = listaDesubstring.get(i).get(j).toCharArray();
				Arrays.sort(chars);
				String arrumado = new String(chars);
				listaAnagramasRepetidoEmOrdem.add(arrumado);
				
			}
		}

		return contarAnagramasRepetidos(listaAnagramasRepetidoEmOrdem);
	}
	
	/*
	 * @brief lista de anagramas repetidos e retonar o numero de repeticoes
	 * 
	 * @param recebe a lista de anagramas repetidos
	 * 
	 * @return int retorna o numero de repeticoes
	 * 
	 * @
	 */

		public int contarAnagramasRepetidos(List<String> listaAnagramasRepetidos) {
			
			int contador = 0;
			
			for(int i = 0;i<listaAnagramasRepetidos.size();i++) {
				
				for(int y = i+1; y<listaAnagramasRepetidos.size();y++) {
					if(listaAnagramasRepetidos.get(i).equals(listaAnagramasRepetidos.get(y))) {
						contador++;
						break;
					}
				}
			}
			return contador;
		}
	}
	

