package es.opensigad.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.opensigad.model.dao.AlumnoDAO;
import es.opensigad.model.vo.AlumnoVO;

@ManagedBean
@SessionScoped
public class AlumnoFichaBean {

	private int id;
	
	private AlumnoVO alumnoVO;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AlumnoVO getAlumnoVO() {
		return alumnoVO;
	}

	public void setAlumnoVO(AlumnoVO alumnoVO) {
		this.alumnoVO = alumnoVO;
	}
	
	public String getDetalleAlumno(int idAlumno) {
		
		String pagina = "alumnoFicha";
		
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		alumnoVO = alumnoDAO.getDetalleAlumno(idAlumno);
		
		return pagina;
		
	}
	
}
