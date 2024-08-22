package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;

import co.edu.unbosque.model.Facade;
import co.edu.unbosque.model.ProductoRandomDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductoRandomControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Facade facade;

	public ProductoRandomControllerServlet() {
		facade = new Facade();
	}

	protected void doDeleteIndex(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");
		int index = Integer.parseInt(req.getParameter("index"));
		facade.getProductoRandomDAO().eliminar(index);
	}

	protected void doDeleteUID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		int UID = Integer.parseInt(req.getParameter("UID"));
		facade.getProductoRandomDAO().eliminar(UID);
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
		for (ProductoRandomDTO e : facade.getProductoRandomDAO().getListaRandoms()) {
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
		facade.getProductoRandomDAO().crear(new ProductoRandomDTO(UID, numUnidades, nombreP, empresa, fechaVen));
		req.setAttribute("nombreP", nombreP);
		req.setAttribute("empresa", empresa);
		req.setAttribute("numUnidades", numUnidades);
//		req.setAttribute("numLote", numLote);
		req.setAttribute("UID", UID);
		req.setAttribute("fechaVen", fechaVen);
		req.getRequestDispatcher("/random.jsp").forward(req, resp);
	}

	protected void doPutActualizar(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int UIDviejo = Integer.parseInt(req.getParameter("UIDviejo"));
		int UID = Integer.parseInt(req.getParameter("UID"));
//		int numLote = Integer.parseInt(req.getParameter("numLote"));
		int numUnidades = Integer.parseInt(req.getParameter("numUnidades"));
		String nombreP = req.getParameter("nombreP");
		String empresa = req.getParameter("empresa");
		String fechaVen = req.getParameter("fechaVen");
		facade.getProductoRandomDAO().actualizar(UIDviejo,
				new ProductoRandomDTO(UID, numUnidades, nombreP, empresa, fechaVen));
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		PrintWriter out = arg1.getWriter();
		out.write("yo soy el metodo delete");
		out.close();
	}

}
