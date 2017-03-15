package it.lutech.corso.web;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lutech.corso.guasti.dal.Segnalazione;
import lutech.corso.guasti.util.JPAConfig;

/**
 * Servlet implementation class ElencoSegnalazioniController
 */
@WebServlet("/elencoSegnalazioni")
public class ElencoSegnalazioniController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ElencoSegnalazioniController() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recupero il model
		EntityManager em = JPAConfig.getInstance().getEmf().createEntityManager();
		List<Segnalazione> segnalazioni = em.createQuery("select s from Segnalazione s")
				.getResultList();
		
		request.setAttribute("elencoSegnalazioni", segnalazioni);
		
		// passo le informazioni a un template JSP
		request.getRequestDispatcher("/WEB-INF/jsp/elencoSegnalazioni.jsp").forward(request, response);
	}

}
