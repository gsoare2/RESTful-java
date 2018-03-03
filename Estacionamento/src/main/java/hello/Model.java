package hello;


import java.util.List;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Model {
	
	private List<Carro> carros = new LinkedList<Carro>();

	
	public void addCarro(Carro carro){
		carros.add(carro);
	}
	
	public Carro buscarPlaca(String placa){
		
		for(Carro carro:carros){
			if(carro.getPlaca().equals(placa)) {
				//JOptionPane.showMessageDialog(null, carro);
				return carro;
			}
		}
		
		return null;
	}
	
	
	public List<Carro> buscarEspecificacao(Especificacao esp){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		
		for(Carro carro:carros){
			 if(esp.comparar(carro.getEspc())) carrosEncontrados.add(carro);
		}
		
		return carrosEncontrados;
		
	}
	
	
	public List<Carro> getCarros(){
		return carros;
	}

}
