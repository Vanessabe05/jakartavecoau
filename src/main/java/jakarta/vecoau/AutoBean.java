package jakarta.vecoau;

import java.io.Serializable;

public class AutoBean implements Serializable {

	private static final long serialVersionUID = 6575056551121951958L;
	private String placas;
	private String marca;
	private String modelo;
	private Integer anioModelo;
	private Double precio;
	private String color;
	private String descripcioFisica;
	private String descripcionDocumentos;

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnioModelo() {
		return anioModelo;
	}

	public void setAnioModelo(Integer anioModelo) {
		this.anioModelo = anioModelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescripcioFisica() {
		return descripcioFisica;
	}

	public void setDescripcioFisica(String descripcioFisica) {
		this.descripcioFisica = descripcioFisica;
	}

	public String getDescripcionDocumentos() {
		return descripcionDocumentos;
	}

	public void setDescripcionDocumentos(String descripcionDocumentos) {
		this.descripcionDocumentos = descripcionDocumentos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void devuelveAuto() {

		this.setAnioModelo(2019);
		this.setColor("Azul");
		this.setDescripcioFisica("Buenas condiciones, se tiene una mancha en asiento trasero");
		this.setDescripcionDocumentos("Cuenta con factura original, tarjeta de circulacion");
		this.setMarca("Nissan");
		this.setModelo("Versa");
		this.setPlacas("GHMJK-H");
		this.setPrecio(200000.00);

	}

}
