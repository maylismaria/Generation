package clinica.model;

import java.util.ArrayList;

import clinica.repository.ClinicaRepository;
import clinica.util.Cores;


public class Especialidade {

	protected float taxaConsulta;
	private String especialidade;

	 
    private static ArrayList<Especialidade> listaEspecialidade = new ArrayList<Especialidade>();

	 
	public Especialidade(String especialidade, float taxaConsulta) {
	this.especialidade = especialidade;
	this.taxaConsulta = taxaConsulta;
	
	}
	
	public static void visualizar2() {
		listaEspecialidade.add(new Especialidade("Clínico", 100f));
		listaEspecialidade.add(new Especialidade("Pediatra", 80f));
		
		
		for (Especialidade especialidade : listaEspecialidade) {
			System.out.println("\nEspecialidade: " + especialidade.especialidade );
            System.out.println("Taxa R$: " + especialidade.taxaConsulta + " reais\n");
			System.out.print("*******************************");

		}
	}

	public float getTaxaConsulta() {
		return taxaConsulta;
	}

	public void setTaxaConsulta(float taxaConsulta) {
		this.taxaConsulta = taxaConsulta;
	}


	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	}


	
	
	
	   
	    
	    
	  
	
	
	
	

