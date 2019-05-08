package com.empresa.mb;

import com.empresa.dao.CuentaDao;
import com.empresa.entities.Cuenta;
import com.empresa.entities.Persona;
import com.empresa.entities.Transaccion;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CuentasMb {
    private Persona afiliadoSeleccionado;
	private List<Persona> afiliados;
	private Cuenta cuentaSeleccionada;
	private List<Cuenta> cuentas;
	private List<Transaccion> transacciones;
        @EJB
	private CuentaDao cuDao;
	
	@PostConstruct
	public void init() {
		afiliadoSeleccionado = new Persona();
		afiliados = new ArrayList<Persona>();
		cuentaSeleccionada = new Cuenta();
		cuentas = new ArrayList<Cuenta>();
		transacciones = new ArrayList<Transaccion>();
//		cuDao = new CuentaDao();
		getClientes();
		
	}
	
	public void getClientes() {
		afiliados = cuDao.getClientes();
	}

	public Persona getAfiliadoSeleccionado() {
		return afiliadoSeleccionado;
	}
	
	public void verCuentas(Persona per) {
		cuentas = cuDao.getCuentas(per.getClienteList().get(0));
	}
	
	public void verTransacciones(Cuenta cuen) {
		//System.out.println("22222222222222222222");
		transacciones = cuDao.getTransacciones(cuen);
		//System.out.println(transacciones.size());
	}
	

	public void setAfiliadoSeleccionado(Persona afiliadoSeleccionado) {
		this.afiliadoSeleccionado = afiliadoSeleccionado;
	}

	public List<Persona> getAfiliados() {
		return afiliados;
	}

	public void setAfiliados(List<Persona> afiliados) {
		this.afiliados = afiliados;
	}

	public Cuenta getCuentaSeleccionada() {
		return cuentaSeleccionada;
	}

	public void setCuentaSeleccionada(Cuenta cuentaSeleccionada) {
		this.cuentaSeleccionada = cuentaSeleccionada;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	
	
	
}
