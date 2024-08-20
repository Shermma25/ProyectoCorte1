package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;

import co.edu.unbosque.model.Facade;
import co.edu.unbosque.model.ProductoCarneDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductoCarneControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Facade facade;

	public ProductoCarneControllerServlet() {
		facade = new Facade();
	}

	protected void doDeleteIndex(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");
		int index = Integer.parseInt(req.getParameter("index"));
		facade.getProductoCarneDAO().eliminar(index);
	}

	protected void doDeleteUID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		int UID = Integer.parseInt(req.getParameter("UID"));
		facade.getProductoCarneDAO().eliminar(UID);
	}

	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		PrintWriter out = arg1.getWriter();
		out.write("yo soy el metodo doHead");
		out.close();
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.write("yo soy el metodo delete");
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		for (ProductoCarneDTO e : facade.getProductoCarneDAO().getListaCarnesFrias()) {
			out.write(e.toString() + "\n");
		}
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		int UID = Integer.parseInt(req.getParameter("UID"));
		int numLote = Integer.parseInt(req.getParameter("numLote"));
		int numUnidades = Integer.parseInt(req.getParameter("numUnidades"));
		String nombreP = req.getParameter("nombreP");
		String empresa = req.getParameter("empresa");
		String fechaVen = req.getParameter("fechaVen");
		String animalOrigen = req.getParameter("animalOrigen");

		facade.getProductoCarneDAO()
				.crear(new ProductoCarneDTO(UID, numLote, numUnidades, nombreP, empresa, fechaVen, animalOrigen));
		req.setAttribute("nombreP", nombreP);
		req.setAttribute("empresa", empresa);
		req.setAttribute("numUnidades", numUnidades);
		req.setAttribute("numLote", numLote);
		req.setAttribute("UID", UID);
		req.setAttribute("fechaVen", fechaVen);
		req.setAttribute("animalOrigen", animalOrigen);
		req.getRequestDispatcher("/crear-carnes.jsp").forward(req, resp);
	}

	protected void doPutActualizar(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int UIDviejo = Integer.parseInt(req.getParameter("UIDviejo"));
		int UID = Integer.parseInt(req.getParameter("UID"));
		int numLote = Integer.parseInt(req.getParameter("numLote"));
		int numUnidades = Integer.parseInt(req.getParameter("numUnidades"));
		String nombreP = req.getParameter("nombreP");
		String empresa = req.getParameter("empresa");
		String fechaVen = req.getParameter("fechaVen");
		String animalOrigen = req.getParameter("animalOrigen");
		facade.getProductoCarneDAO().actualizar(UIDviejo,
				new ProductoCarneDTO(UID, numLote, numUnidades, nombreP, empresa, fechaVen, animalOrigen));
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		PrintWriter out = arg1.getWriter();
		out.write("yo soy el metodo delete");
		out.close();
	}

}
