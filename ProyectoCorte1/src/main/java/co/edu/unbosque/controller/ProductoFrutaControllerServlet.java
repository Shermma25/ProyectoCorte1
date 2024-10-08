package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;

import co.edu.unbosque.model.Facade;
import co.edu.unbosque.model.ProductoFrutaDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductoFrutaControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Facade facade;

	public ProductoFrutaControllerServlet() {
		facade = new Facade();
	}

	protected void doDeleteIndex(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");
		int index = Integer.parseInt(req.getParameter("index"));
		facade.getProductoFrutaDAO().eliminar(index);
	}

	protected void doDeleteUID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		int UID = Integer.parseInt(req.getParameter("UID"));
		facade.getProductoFrutaDAO().eliminar(UID);
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
		for (ProductoFrutaDTO e : facade.getProductoFrutaDAO().getListaFrutas()) {
			out.write(e.toString() + "\n");
		}
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		int UID = Integer.parseInt(req.getParameter("UID"));
//		int numLote = Integer.parseInt(req.getParameter("numLote"));
		int numUnidades = Integer.parseInt(req.getParameter("numUnidades"));
		String nombreP = req.getParameter("nombreP");
		String empresa = req.getParameter("empresa");
		String fechaVen = req.getParameter("fechaVen");
		String fechaCosecha = req.getParameter("fechaCosecha");
		boolean organico = "true".equalsIgnoreCase(req.getParameter("organico"));
		facade.getProductoFrutaDAO().crear(
				new ProductoFrutaDTO(UID, numUnidades, nombreP, empresa, fechaVen, fechaCosecha, organico));
		req.setAttribute("nombreP", nombreP);
		req.setAttribute("empresa", empresa);
		req.setAttribute("numUnidades", numUnidades);
//		req.setAttribute("numLote", numLote);
		req.setAttribute("UID", UID);
		req.setAttribute("fechaVen", fechaVen);
		req.setAttribute("fechaCosecha", fechaCosecha);
		req.setAttribute("organico", organico);
		req.getRequestDispatcher("/frutas.jsp").forward(req, resp);
	}

	protected void doPutActualizar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int UIDviejo = Integer.parseInt(req.getParameter("UIDviejo"));
		int UID = Integer.parseInt(req.getParameter("UID"));
//		int numLote = Integer.parseInt(req.getParameter("numLote"));
		int numUnidades = Integer.parseInt(req.getParameter("numUnidades"));
		String nombreP = req.getParameter("nombreP");
		String empresa = req.getParameter("empresa");
		String fechaVen = req.getParameter("fechaVen");
		String fechaCosecha = req.getParameter("fechaCosecha");
		boolean organico = "true".equalsIgnoreCase(req.getParameter("organico"));
		facade.getProductoFrutaDAO().actualizar(UIDviejo,
				new ProductoFrutaDTO(UID, numUnidades, nombreP, empresa, fechaVen, fechaCosecha, organico));
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		PrintWriter out = arg1.getWriter();
		out.write("yo soy el metodo delete");
		out.close();
	}

}
