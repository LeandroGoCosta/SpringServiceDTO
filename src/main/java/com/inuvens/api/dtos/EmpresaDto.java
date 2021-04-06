package com.inuvens.api.dtos;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;
import javax.validation.constraints.NotEmpty;

public class EmpresaDto {
	
	private Long id;
	private String razaoSocial;
	private String cnpj;
	
	
	public EmpresaDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@NotEmpty(message = "Razao social não pode ser vazia.")
	@Length(min = 5, max=200, message = "Razão Social deve ter entre 5 e 200 caracteres.")
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	@NotEmpty(message = "Cnpj não pode ser vazio.")
	@CNPJ(message = "Cnpj invalido")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "EmpresaDto [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}
	
	
	
}
