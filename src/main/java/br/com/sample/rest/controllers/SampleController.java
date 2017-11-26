package br.com.sample.rest.controllers;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.sample.rest.models.Funcionario;

@Path("/")
public class SampleController {
	
	
	@GET
	@Path("/home")
	@Produces("text/plain")
	public String home(){
		return "Ola mundo!!!";
	}
	@GET
	@Path("/funcionarios")
	@Produces("application/json")
	public List<Funcionario> funcionarios(){
		return Arrays.asList(
				new Funcionario(1l,"Tiago",24l,new Date()),
				new Funcionario(2l,"Michelle",12l,new Date()),
				new Funcionario(3l,"Tânia",12l,new Date())
		);
	}
}
