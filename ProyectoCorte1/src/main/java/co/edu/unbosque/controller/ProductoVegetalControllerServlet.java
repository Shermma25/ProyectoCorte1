package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;

import co.edu.unbosque.model.Facade;
import co.edu.unbosque.model.ProductoVegetalDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductoVegetalControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Facade facade;

	public ProductoVegetalControllerServlet() {
		facade = new Facade();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		for (ProductoVegetalDTO e : facade.getProductoVegetalDAO().getListaVegetales()) {
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
		String fechaVen = req.getParameter("fechaVen");
		String fechaCosecha = req.getParameter("fechaCosecha");
		boolean organico = "true".equalsIgnoreCase(req.getParameter("organico"));
		facade.getProductoVegetalDAO().crear(
				new ProductoVegetalDTO(UID, numLote, numUnidades, nombreP, empresa, fechaVen, fechaCosecha, organico));
		req.setAttribute("nombreP", nombreP);
		req.setAttribute("empresa", empresa);
		req.setAttribute("numUnidades", numUnidades);
		req.setAttribute("numLote", numLote);
		req.setAttribute("UID", UID);
		req.setAttribute("fechaVen", fechaVen);
		req.setAttribute("fechaCosecha", fechaCosecha);
		req.setAttribute("organico", organico);
		req.getRequestDispatcher("/frutas.jsp").forward(req, resp);
	}

	protected void doDeleteIndex(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");
		int index = Integer.parseInt(req.getParameter("index"));
		facade.getProductoVegetalDAO().eliminar(index);
	}

	protected void doDeleteUID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		int UID = Integer.parseInt(req.getParameter("UID"));
		facade.getProductoVegetalDAO().eliminar(UID);
	}

}
