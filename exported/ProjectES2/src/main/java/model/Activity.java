package model;

import java.util.ArrayList;
import java.util.List;

public class Activity {
	int id;
	String nomeAtividade;
	String nomeCoordenador;
	String nomeSetor;
	String numProcesso;
	String dataInicio;
	String dataFim;
	int cargaHoraria;
	List<String> servidores = new ArrayList<String>();
	List<String> alunos = new ArrayList<String>();
	List<String> tags = new ArrayList<String>();

	public Activity() {
		super();
	}

	public Activity(int id, String nomeAtividade, String nomeCoordenador, String nomeSetor, String numProcesso,
			String dataInicio, String dataFim, int cargaHoraria, List<String> servidores, List<String> alunos,
			List<String> tags) {
		super();
		this.id = id;
		this.nomeAtividade = nomeAtividade;
		this.nomeCoordenador = nomeCoordenador;
		this.nomeSetor = nomeSetor;
		this.numProcesso = numProcesso;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cargaHoraria = cargaHoraria;
		this.servidores = servidores;
		this.alunos = alunos;
		this.tags = tags;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}

	public String getNomeCoordenador() {
		return nomeCoordenador;
	}

	public void setNomeCoordenador(String nomeCoordenador) {
		this.nomeCoordenador = nomeCoordenador;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public String getNumProcesso() {
		return numProcesso;
	}

	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<String> getServidores() {
		return servidores;
	}

	public void setServidores(List<String> servidores) {
		this.servidores = servidores;
	}

	public List<String> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<String> alunos) {
		this.alunos = alunos;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
