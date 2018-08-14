/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.cursojee.agenda.negocio;

import co.edu.utp.isc.cursojee.agenda.dao.CiudadDAO;
import co.edu.utp.isc.cursojee.agenda.dao.DepartamentoDAO;
import co.edu.utp.isc.cursojee.agenda.dao.PaisDAO;

/**
 *
 * @author DiazOspina
 */
public class ConfiguracionBean {
    private final PaisDAO paisDAO;
    private final DepartamentoDAO departamentoDAO;
    private final CiudadDAO ciudadDAO;

    public ConfiguracionBean() {
        paisDAO = new PaisDAO();
        departamentoDAO = new DepartamentoDAO();
        ciudadDAO = new CiudadDAO();
    }

}
