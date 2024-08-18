package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;

import co.edu.unbosque.model.Facade;
import co.edu.unbosque.model.ProductoJugueteDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductoJugueteControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Facade facade;

	public ProductoJugueteControllerServlet() {
		facade = new Facade();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		for (ProductoJugueteDTO e : facade.getProductoJugueteDAO().getListaJuguetes()) {
			out.write(e.toString() + "\n");
		}
		out.close();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		int UID = Integer.parseInt(req.getParameter("UID"));
		int numLote = Integer.parseInt(req.getParameter("numLote"));
		int numUnidades = Integer.parseInt(req.getParameter("numUnidades"));
		String nombreP = req.getParameter("nombreP");
		String empresa = req.getParameter("empresa");
		int edadMinima = Integer.parseInt(req.getParameter("edadMinima"));
		int numJugadores = Integer.parseInt(req.getParameter("numJugadores"));
		facade.getProductoJugueteDAO()
				.crear(new ProductoJugueteDTO(UID, numLote, numUnidades, nombreP, empresa, edadMinima, numJugadores));
		req.setAttribute("UID", UID);
		req.setAttribute("numLote", numLote);
		req.setAttribute("numUnidades", numUnidades);
		req.setAttribute("nombreP", nombreP);
		req.setAttribute("empresa", empresa);
		req.setAttribute("edadMinima", edadMinima);
		req.setAttribute("numJugadores", numJugadores);
		req.getRequestDispatcher("/juguete.jsp").forward(req, resp);
	}

}
