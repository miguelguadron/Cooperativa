/*
package com.empresa.test;

import java.util.ArrayList;
import java.util.List;

import com.empresa.dao.PersonaDao;
import com.empresa.entities.Beneficiario;
import com.empresa.entities.Cliente;
import com.empresa.entities.Direccion;
import com.empresa.entities.Persona;
import com.empresa.entities.Referencia;
import com.empresa.entities.Telefono;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombres("luis");
		persona.setApellidos("Escobar");
		persona.setNumeroDocumento("d2-f23fsdf2343");
		
		List<Cliente> clilist = new ArrayList<Cliente>();
		Cliente cli = new Cliente();
		cli.setEsMiembro("1");
		cli.setPersona(persona);
		clilist.add(cli);
		List<Telefono> telList = new ArrayList<Telefono>();
		Telefono telcli = new Telefono();
		telcli.setTelefono("23233-2323233");
		telcli.setPersona(persona);
		telList.add(telcli);
		
		telcli = new Telefono();
		telList = new ArrayList<Telefono>();
		telcli = new Telefono();
		telcli.setTelefono("23233-333333");
		telcli.setPersona(persona);
		telList.add(telcli);
		
		List<Direccion> dirList = new ArrayList<Direccion>();
		Direccion dir = new Direccion();
		dir.setDireccion("Direccion uno");
		dir.setPersona(persona);
		dirList.add(dir);
		
		persona.setDireccions(dirList);
		persona.setTelefonos(telList);
		persona.setClientes(clilist);
		
		//guardando persona
		PersonaDao perDao = new PersonaDao();
		Persona perRest = perDao.insertPersona(persona);
		System.out.println("id Persona insertada :  " + perRest.getIdPersona());
		
		//beneficiarios
		List<Beneficiario> benList = new ArrayList<Beneficiario>();
		Beneficiario ben = new Beneficiario();
		Persona perBen = new Persona();
		perBen.setNombres("Ben Nombre 1");
		perBen.setApellidos("Ben Ape 1");
		perBen.setNumeroDocumento("111111111");
		Persona respuestaPerBen = perDao.insertPersona(perBen);
		ben.setPersona(respuestaPerBen);
		ben.setCliente(persona.getClientes().get(0));
		ben.setParentesco("padre");
		ben.setPorcentaje(100);
		benList.add(ben);
		
		cli.setBeneficiarios(benList);
		String respuestaBen = perDao.insertEbenficiarios(benList);
		System.out.println("Respuesta Beneficiario" + respuestaBen);
		
		// referencias
		List<Referencia> refList = new ArrayList<Referencia>();
		Referencia ref = new Referencia();
		Persona perRef = new Persona();
		perRef.setNombres("Ref Nombres 1");
		perRef.setApellidos("Ref Ape 1");
		perRef.setNumeroDocumento("8888888888888");
		Persona respuestaPerRef = perDao.insertPersona(perRef);
		ben.setPersona(respuestaPerRef);
		ref.setCliente(persona.getClientes().get(0));
		refList.add(ref);
		cli.setReferencias(refList);
		String respuestaRef = perDao.insertReferencias(refList);
		System.out.println("Respuesta referencia" + respuestaRef);
	}

}
*/